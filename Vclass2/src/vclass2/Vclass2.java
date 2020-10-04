package vclass2;


public class Vclass2 {

    public static void main(String[] args) {
        cetak(5,5);
        cetak(5,5,5);
        cetak(5,5);
        cetak(5,5);
        cetak(5,5,5);
    }
    
    public static void cetak(int a, int b) {
        System.out.println((a*b));
    }
    
    public static void cetak(int a, int b,int c) {
        System.out.println((a*b*c));
    }
    
    public static void cetak(int a,double b){
        System.out.println((a*b));
    }
   
    public static void cetak(double a,int b){
    System.out.println((a*b));
    }
    
   public static void cetak(double a,int b,double c){
   System.out.println((a*b*c));
    }
    
    
}


    

