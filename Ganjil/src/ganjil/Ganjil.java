package ganjil;
import java.util.Scanner;
public class Ganjil{
    public static void main (String args[]){
        Scanner kbd= new Scanner(System.in);
        System.out.println("Masukan Bilangan");
        int bilangan=kbd.nextByte();
        
        if (bilangan%3==0){
            System.out.println("Bilangan " +bilangan+ " habis dibagi 3");
            System.out.println("Termasuk Bilangan kelipatan 3");
        }
        
        else{
            System.out.println("Bilangan " +bilangan+ " tidak habis dibagi 3");
            System.out.println("Tidak termasuk bilangan kelipatan 3");
        }
        
    }
}