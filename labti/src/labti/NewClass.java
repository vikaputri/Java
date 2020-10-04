package labti;
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
       Scanner kbd = new Scanner(System.in);
       System.out.print("Masukan Angka : ");
            int a=kbd.nextInt(); 
            
            if(a<0){
                System.out.println(a+ " Bilangan Negatif");
             }
            else if(a == 0){
                System.out.println(a+ " Bilangan Sama dengan Nol");
             }
            else if(a>0){
                System.out.println(a+ " Bilangan Positif");
             }
            
    }
    
}
