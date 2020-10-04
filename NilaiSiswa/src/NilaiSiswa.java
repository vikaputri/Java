import java.util.Scanner;
class NilaiSiswa{
    public static void main(String args[]){
        System.out.println("Nilai Kuis Kimia");
        System.out.println("==================");
        
        Scanner kbd = new Scanner(System.in);
            System.out.println("Masukan Nilai Anda");
            int nilai=kbd.nextInt();
            
            if(nilai<=50){
                System.out.println("Nilai Kuis Anda " +nilai);
                System.out.println("Kategori Nilai E");
                System.out.println("Terus Berjuang");
            }   
            else if(nilai<=51 && nilai>=70){
                System.out.println("Nilai Kuis Anda " +nilai);
                System.out.println("Kategori Nilai D");
                System.out.println("Terus Berjuang");
            }
            else if(nilai<=71 && nilai>=80){
                System.out.println("Nilai Kuis Anda " +nilai);
                System.out.println("Kategori Nilai C");
                System.out.println("Tingkatkan Nilai");
            }
            else if(nilai<=81 && nilai>=90){
                System.out.println("Nilai Kuis Anda " +nilai);
                System.out.println("Kategori Nilai B");
                System.out.println("Maksimalkan Nilai");
            }
            else if(nilai<=91 && nilai>=100){
                System.out.println("Nilai Kuis Anda " +nilai);
                System.out.println("Kategori Nilai A");
                System.out.println("Pertahankan Nilai");
            }
        
    }
}