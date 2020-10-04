package logika;
public class Logika{
    public static void main(String args[]){
    for (int i=1;i<5;i++){
        for (int j=0;j<=(i*2)-1;j++){
            System.out.print(j++); 
        }
    System.out.println(i++);
    }
    }
}