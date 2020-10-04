package cobawhile;
import java.util.Scanner;
class CobaWhile{
    public static void main(String args[]){
        Scanner kbd=new Scanner(System.in);
        float bil,jumlah;
        int data;
        System.out.print("Masukkan Jumlah Bilangan:");
        data=kbd.nextInt();
        jumlah=0;
        bil=0;
        int i=1;
        do{
            i++;
            System.out.print("Masukkan Bilangan:");
            bil=kbd.nextFloat();
            jumlah+=bil;
        }
        while(i<=data);{
        System.out.println("Jumlah Data:" +jumlah);
        double rata=jumlah/data;
        System.out.println("Jadi,Rata-Ratanya Adalah:" +rata);
    }
    }
}