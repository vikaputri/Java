package kelompok2;

public class Kontruktor {

    private String Username;

    public Kontruktor(String username){
        this.Username=username;
    }
    
    public static void main(String[] args) {
        Kontruktor parameter = new Kontruktor("Ini adalah Konstruktor dengan parameter");
        System.out.println("Username: " + parameter.Username);
    }
}
