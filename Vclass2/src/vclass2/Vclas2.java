package vclass2;
import java.io.*; 

    public class Vclas2 { 
        
        public static void main(String[] args) throws IOException { 
            
            byte[] huruf = new byte[9]; 
            System.out.print("Masukkan 9 huruf : ");
            System.in.read(huruf);
            System.out.print("Karakter yang Anda ketik yaitu :");
            
            for(int i=0;i<huruf.length;i++) { 
            System.out.print((char)huruf[i]); 
            } 
        }    
    }