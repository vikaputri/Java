package kelompok2;

import java.util.Scanner;

public class Kelompok2 {

    int hasil=0; 
    
    public void Hitung (int s){
        hasil= s*s;
        System.out.println("Luas : s x s = "+hasil);
    }
    
    public void Hitung (int p,int l){
        hasil= p*l;
        System.out.println("Luas : p x l = "+hasil);
    }
    
    public void Hitung (int P,int L,int T){
        hasil=2*(P*L+P*T+L*T);
        System.out.println("Luas : 2 x (p x l + p x t + l x t) = "+hasil);
    }

    public static void main(String[] args) {
        Kelompok2 overload = new Kelompok2();
        Scanner input = new Scanner( System.in ); 
        
        System.out.println("\tKalkulator Luas");
        System.out.println("===========================");
        System.out.println("pilihan  :");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Balok");
        System.out.println("===========================");
        System.out.println(" ");
        System.out.print("Masukan Pilihan anda  : ");
        int pilihan = input.nextInt();
        System.out.println(" ");  
        
        switch(pilihan){
        case 1 :
            System.out.print("Masukan Panjang Sisi  : ");
            int s = input.nextInt(); 
            overload.Hitung(s);
        break;
        
        case 2 :
            System.out.print("Masukan Panjang  : ");
            int p = input.nextInt(); 
            System.out.print("Masukan Lebar  : ");
            int l = input.nextInt();
            overload.Hitung(p,l);
        break;
        
        case 3 :
            System.out.print("Masukan Panjang: ");
            int P = input.nextInt(); 
            System.out.print("Masukan Lebar  : ");
            int L = input.nextInt();
            System.out.print("Masukan Lebar  : ");
            int T = input.nextInt();
            overload.Hitung(P,L,T);
        break;
        
        default :
            System.out.println("Maaf, pilihan anda salah");
        break;
        }
    }
}
