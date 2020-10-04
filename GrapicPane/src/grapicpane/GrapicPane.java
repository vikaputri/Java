package grapicpane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class GrapicPane extends Panel{
    public GrapicPane(){
        setBackground(Color.black);
    }
    
    public void paint(Graphics V){
        V.setColor(new Color(0,255,0));
        V.setFont(new Font("Helvetica",Font.PLAIN,16));
        V.drawString("Hello GUI World!", 30, 100);
        V.setColor(new Color(1.0f,0,0));
        V.fillRect(30, 100, 150, 10);
            
    }
    public static void main(String[] args) {
        Frame f=new Frame("Testing Grapics Panel");
        GrapicPane gp=new GrapicPane();
        f.add(gp);
        f.setSize(600,300);
        f.setVisible(true);
        
        
        

    }
    
}
