import javax.swing.*;
import java.awt.*;

public class javaswing {
    JOptionPane optionPane;
    public javaswing(){
    }
    
    void lauchFrame(){
        optionPane= new JOptionPane();
        String name=optionPane.showInputDialog("Hi,what's your name?");
        optionPane.showMessageDialog(null,"Nice to meet you,"+ name+".","Greeting..",optionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
    
    public static void main(String args[]){
            
      }
}
