package tic.tac.toe;

import java.awt.*;

public class TicTacToe extends Frame {

    public static void main(String[] args) {
        TicTacToe TTT=new TicTacToe();
        TTT.setLayout(new GridLayout(3,3,2,2));
        TTT.add(new Button());
        TTT.add(new Button());
        TTT.add(new Button());  
        TTT.add(new Button());
        TTT.add(new Button());
        TTT.add(new Button());
        TTT.setSize(300,150);
        TTT.setVisible(true);
     
    }
    
}
