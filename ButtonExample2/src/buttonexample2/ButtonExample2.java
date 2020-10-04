package buttonexample2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class ButtonExample2 {

    public static void main(String[] args) {
       BufferedReader dataIn=new BufferedReader(new InputStreamReader(System.in));
       String name= "",npm="",uts="",uas="",nilai_akhir="",kelulusan="";
       
       name = JOptionPane.showInputDialog("Nama :");
       npm = JOptionPane.showInputDialog("NPM :");
       uts=JOptionPane.showInputDialog("Nilai UTS :");
       uas=JOptionPane.showInputDialog("Nilai UAS :");
       double nilaiuts = Integer.parseInt(uts);
       double nilaiuas = Integer.parseInt(uas);
       double grade = nilaiuts*0.7+nilaiuas*0.3;
       String pesan="";
       if( (grade>=80.1)&&(grade<=100)){
        pesan="Nilai Akhir   :  A"
                + "\n"
                + "Kelulusan   : Lulus";
       }
       else if((grade>=65.1)&&(grade<=80)){
        pesan="Nilai Akhir   :  B"
                + "\n"
                + "Kelulusan   : Lulus";
       }
       else if((grade>=50.1)&&(grade<=65) ){
        pesan="Nilai Akhir   :  C"
                + "\n"
                + "Kelulusan   : Lulus";
       }
       else if ((grade>=40.1)&&(grade<=50)){
        pesan="Nilai Akhir   :  D"
                + "\n"
                + "Kelulusan   : Tidak Lulus";  
       }
       else if ((grade>=0)&&(grade<=40)){
        pesan="Nilai Akhir   :  E"
               +"\n"
                + "Kelulusan   : Tidak Lulus";    

     }
     String msg =("Nama           :  " +name+ "\nNPM             :  " + npm + "\nNilai UTS     :  "+ uts + "\nNilai UAS     :  " +uas +"\n" + pesan);  
     JOptionPane.showMessageDialog(null, msg);
          
    }
    
}
