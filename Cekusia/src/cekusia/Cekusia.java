package cekusia;

import java.util.Scanner;

public class Cekusia{
    public static void main(String args[]){
        Scanner kbd = new Scanner(System.in);
        System.out.print("berapa usia anda?");
        byte usia=kbd.nextByte();
        String pesan ="17 tahun atau lebih adalah saat untuk mengukir prestasi";
        if(usia<17)
            pesan="semangat terus untuk menuju usia 17 tahun";
        System.out.println(pesan);
        kbd.close();
        
    }
}