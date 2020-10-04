package kelompok2;

public class defaultclass {
    String Kelas;
    
    defaultclass(){
       Kelas = "2IA01";
    }
    
    public static void main(String[] args) {

        defaultclass u = new defaultclass();
        System.out.println("Kelas = "+u.Kelas);
    }
}
