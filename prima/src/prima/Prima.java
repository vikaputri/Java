package prima;
import java.util.Scanner;
class Prima{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Silahkan Masukkan Jumlah Deret Bilangan:");
        int jumlahbilanganprima=input.nextInt();
        System.out.println("Silahkan Masukkan Jumlah Baris:");
        int baris=input.nextInt();
        System.out.println(jumlahbilanganprima+ " Bilangan Prima Pertama Adalah:");
        int hitung=0;
        int angka=2;
        while(hitung<jumlahbilanganprima){
            boolean prima=true;
                for(int pembagi=2;pembagi<=angka/2;pembagi++){
            if(angka%2==0){
                prima=false;
            break;
                }
            }
        if(prima){
            hitung++;
            if(hitung%baris==0){
            System.out.print(" "+angka);
            }
            else{
                System.out.print(angka+" ");
            }
        }
        angka++;
        }
    }
}
