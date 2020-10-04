package kelompok2;

public class overloading {
    
    public static void kali(int a, int b) {
        System.out.println((a*b));
    }
    //oveloading dengan jumlah parameter berbeda dan tipe data beda
    public static void kali(double a, double b,double c) {
        System.out.println((a*b*c));
    }
    //oveloading dengan jumlah parameter berbeda
    public static void kali(int a, int b,int c) {
        System.out.println((a*b*c));
    }
    //overloading perbedaan tipe data parameter
    public static void kali(int a,double b){
        System.out.println((a*b));
    }
    //overloading perbedaan urutan tipe data parameter
    public static void kali(double a,int b){
    System.out.println((a*b));
    }
    
    public static void main(String[] args) {
       penjumlahan sum = new penjumlahan();
       System.out.println(sum.tambah(10,20));
       System.out.println(sum.tambah(30,40,50));
       System.out.println(sum.tambah(60.5,70.5));
       kali(5,5);
       kali(5.0,5.0,5.0);
       kali(5,5,5);
       kali(5.0,5);
       kali(5,5.0);
    }
    
}

class penjumlahan extends overloading{
    public int tambah(int x,int y){
        return(x+y);
    }
    public int tambah(int x,int y,int z){
        return(x+y+z);
    }
    public double tambah(double x,double y){
        return(x+y);
    }
}

