package genap;
import java.util.Scanner;
public class Genap{
    public static void main(String args[]){
        Scanner kbd=new Scanner(System.in);
            System.out.println("Masukkan Bilangan Bulat:");
            int bilangan=kbd.nextByte();
            
            if(bilangan%2==1){
                System.out.println("Bilangan:" +bilangan+ " tidak habis dibagi 2");
                System.out.println("Termasuk bilangan ganjil");
            }
            else{
                System.out.println("Bilangan:" +bilangan+ " habis dibagi 2");
                System.out.println("termasuk bilangan genap");
            }
    }
}
