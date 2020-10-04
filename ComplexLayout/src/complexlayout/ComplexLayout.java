package complexlayout;

import java.awt.*;

public class ComplexLayout {

    public ComplexLayout(){
    }
    
    public static void main(String[] args) {
        ComplexLayout cl=new ComplexLayout();
        Panel panelNorth=new Panel();
        Panel panelCenter=new Panel();
        Panel panelSouth=new Panel();
        panelNorth.add(new Button("ONE"));
        panelNorth.add(new Button("TWO"));
        panelNorth.add(new Button("THREE"));
        panelCenter.setLayout(new GridLayout(4,4));
        panelCenter.add(new TextField("1st"));
        panelCenter.add(new TextField("2nd"));
        panelCenter.add(new TextField("3rd"));
        panelCenter.add(new TextField("4th"));
        panelSouth.setLayout(new BorderLayout());
        panelSouth.add(new Checkbox("Choose me!"),BorderLayout.CENTER);
        panelSouth.add(new Checkbox("I'm here!"),BorderLayout.EAST);
        panelSouth.add(new Checkbox("Pick me!"),BorderLayout.WEST);
        cl.add(panelNorth,BorderLayout.NORTH);
        
        
    }
    
}
