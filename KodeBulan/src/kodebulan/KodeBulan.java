package kodebulan;
import java.util.Scanner;
class KodeBulan{
    public static void main(String args[]){
      Scanner kbd=new Scanner(System.in);
      System.out.println("Menentukan Nama Bulan");
      System.out.println("1.Januari 2.Februari 3. maret 4. April 5.Mei 6.Juni");
      System.out.println("7.Juli 8.Agustus 9.September 10.Oktober 11.November 12.Desember");
      System.out.println("Masukkan Kode Bulan");
      
      Byte kodebulan=kbd.nextByte();
      switch(kodebulan){
          case 1:
              System.out.println("Januari");
              break;
          case 2:
              System.out.println("Februari");
              break;
          case 3:
              System.out.println("Maret");
              break;
          case 4:
              System.out.println("April");
              break;
          case 5:
              System.out.println("Mei");
              break;
          case 6:
              System.out.println("Juni");
              break;
          case 7:
              System.out.println("Juli");
              break;
          case 8:
              System.out.println("Agustus");
              break;
          case 9:
              System.out.println("September");
              break;
          case 10:
              System.out.println("Oktober");
              break;
          case 11:
              System.out.println("November");
              break;
          case 12:
              System.out.println("Desember");
              break;
          default:
              System.out.println("Kode Masukan Salah");
          
          kbd.close();
      }
      
      
    }
}
