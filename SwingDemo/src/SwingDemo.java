import java.awt.*;
import javax.swing.*;

public class SwingDemo {
    JFrame frame;
    JPanel panel;
    JTextField textfield;
    JButton button;
    Container contentPane;
    
    public SwingDemo(){
    }
    
    void launchFrame(){
        frame=new JFrame("My First Swing Application");
        panel=new JPanel();
        textfield=new JTextField("Default text");
        button=new JButton("Click me!");
        contentPane=frame.getContentPane();
        panel.add(textfield);
        panel.add(button);
        contentPane.add(panel,BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String args[]){
    }
}
   
