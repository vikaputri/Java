
import java.util.ArrayList;
import java.util.Scanner;

public class vclas1 {
     @SuppressWarnings("empty-statement")
     public static void main(String[] args) {
     ArrayList arr_data= new ArrayList();
     Scanner scan=new Scanner(System.in);
        System.out.println("Masukkan 5 Angka Pilihan Anda");
        System.out.println("===============================================");
        for (int a=0; a<5; a++){
            System.out.print("Data ke-"+(a)+" : ");
            int data=scan.nextInt();
             arr_data.add(data);
        }
        
       System.out.println("");
       System.out.print("Masukkan Angka yang Dicari : ");
       int cari=scan.nextInt();
       int tanda = 0;
       for (int b=0;(b<5&&tanda==0);b++){
         int[] angka = null;
           if(cari==angka[b])
               tanda++;
       }
       if(tanda>0){
           System.out.println("");
           System.out.print("Bilangan Tersebut Ada Dalam Daftar");
       }
       else{
            System.out.println("");
            System.out.print("Maaf Bilangan yang Anda Cari Tidak Terdapat Dalam Daftar");
        }
        }
     
}