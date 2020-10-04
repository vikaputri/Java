import java.io.PrintStream;
import java.util.Scanner;

class Nilai{
    public static void main(String args[]){
        Scanner kbd=new Scanner(System.in);
        System.out.println("Menentukan Hasil Ujian Algoritma&Pemrograman 1B");
        System.out.println("===============================================");
        System.out.println("Masukan Nilai Ujian Mahasiswa");
        int nilai=kbd.nextInt();
    
        if(nilai<=40){
            System.out.println("Nilai Mahasiswa adalah " +nilai);
            System.out.println("Jadi,nilai Mahasiswa E");
        }
        else if (nilai>=41 && nilai<=60){
            System.out.println("Nilai Mahasiswa adalah " +nilai);
            System.out.println("Jadi,nilai Mahasiswa D");
        }
        else if(nilai>=61 && nilai<=70){
            System.out.println("Nilai Mahasiswa adalah " +nilai);
            System.out.println("Jadi, nilai Mahasiswa C");
        }
        else if(nilai>=71 && nilai<=90){
            System.out.println("Nilai Mahasiswa adalah " +nilai);
            System.out.println("jadi, nilai Mahasiswa B");
        }
        else if(nilai>91 && nilai<=100){
            System.out.println("Nilai Mahasiswa adalah " +nilai);
            System.out.println("jadi,nilai Mahasiswa A");
        }
       kbd.close();
    }
    }