package faktorial;
import java.util.Scanner;
class Faktorial{
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        int f=1;
        System.out.print("Masukan Bilangan Faktorial=");
        int n=a.nextInt();
        System.out.println("==============================");
        int i;
        for(i=1;i<=n;i++)
        f*=i;
        System.out.println(n+"!="+f);
    }
}