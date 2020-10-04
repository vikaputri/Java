package framecontrol;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Scrollbar;
import java.awt.TextField;

public class FrameControl extends Frame{
    public FrameControl(){
    }
    
    public static void main(String[] args) {
        FrameControl fwc=new FrameControl();
        fwc.setLayout(new FlowLayout());
        fwc.setSize(600,600);
        fwc.add(new Button("Test Me!"));
        fwc.add(new Label("Label"));
        fwc.add(new TextField());
        CheckboxGroup cbg=new CheckboxGroup();
        fwc.add(new Checkbox("chk1",cbg,true));
        fwc.add(new Checkbox("chk2",cbg,false));
        fwc.add(new Checkbox("chk3",cbg,false));
        List list=new List(3,false);
        list.add("MTV");
        list.add("V");
        fwc.add(list);
        Choice chooser=new Choice();
        chooser.add("Avril");
        chooser.add("Monica");
        chooser.add("Britney");
        fwc.add(chooser);
        fwc.add(new Scrollbar());
        fwc.setVisible(true);
        
        
    }
    
}
