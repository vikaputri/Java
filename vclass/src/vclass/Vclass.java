package vclass;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Vclass {

    public static void main(String[] args) {
        BufferedReader bilangan=new BufferedReader(new InputStreamReader(System.in));
        try{
            
        int tanda=0;
        int [] angka;
        angka=new int[5];
            System.out.println("Masukkan 5 Angka Pilihan Anda");
            System.out.println("========================");

        for (int i=0;i < angka.length;i++){
            System.out.print("Masukkan Data ke "+i+" = ");
            angka[i]=Integer.parseInt(bilangan.readLine());
        }

        System.out.println("");
        System.out.print("Masukkan Angka yang Dicari : ");
        int cari=Integer.parseInt(bilangan.readLine());

        for(int j=0;(j < angka.length && tanda == 0);j++){
            if (cari == angka[j])
            tanda++;
        }

        if (tanda > 0){
            System.out.println("");
            System.out.println("Bilangan Tersebut Ada Dalam Daftar");
        }
    
        else{
        System.out.println("");
        System.out.println("Maaf Bilangan yang Anda Cari Tidak Ada");
        }
        }
    
        catch(Exception e){
        System.out.println("Salah");
        }

    }
    
}
