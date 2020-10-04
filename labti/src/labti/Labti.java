package labti;
import java.util.Scanner;

public class Labti {

    public static void main(String[] args) {
        System.out.println("Nilai Mahasiswa");
        System.out.println("==================");
        
        Scanner kbd = new Scanner(System.in);
            System.out.print("Masukan Nilai UTS : ");
            int uts=kbd.nextInt();
            System.out.print("Masukan Nilai UTS : ");
            int uas=kbd.nextInt();
            System.out.print("Masukan Nilai Tugas : ");
            int tugas=kbd.nextInt();
            
            int nilai=(uts+uas+tugas)/3;
             if(nilai>=90){
                System.out.println("Nilai Akhirnya adalah : A");
             }
             else if(nilai>=80){
                System.out.println("Nilai Akhirnya adalah : B");
             }
             else if(nilai>=70){
                System.out.println("Nilai Akhirnya adalah : C");
             }
             else if(nilai>=60){
                System.out.println("Nilai Akhirnya adalah : D");
             }
             else if(nilai<=59){
                System.out.println("Nilai Akhirnya adalah : E");
             }
                
                
    }
    
}
