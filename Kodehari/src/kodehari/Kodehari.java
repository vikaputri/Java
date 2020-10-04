package kodehari;
import java.util.Scanner;
public class Kodehari{
    public static void main(String args[]){
        Scanner kbd=new Scanner(System.in);
        System.out.println("Masukan Kode Hari");
        System.out.println("1.Senin 2.Selasa 3.Rabu 4.Kamis");
        System.out.println("5.Jumat 6.Sabtu 7.Minggu");
    Byte kodehari=kbd.nextByte();
    
    if(kodehari==1)
        System.out.println("Senin");
    else if(kodehari==2)
        System.out.println("Selasa");
    else if(kodehari==3)
        System.out.println("Rabu");
    else if(kodehari==4)
        System.out.println("Kamis");
    else if(kodehari==5)
        System.out.println("Jumat");
    else if(kodehari==6)
        System.out.println("Sabtu");
    else if(kodehari==7)
        System.out.println("Minggu");
    else
        System.out.println("Kode Hari Salah");
    
    }
}
