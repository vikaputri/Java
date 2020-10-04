package kelompok2;

class favorit {
    private String Nama;
    private String Makanan;
    private String Minuman;
            
        public favorit (String nama){
            this.Nama = nama;
            Makanan = "Tidak suka makan";
            Minuman = "Tidak suka minum";
        }
        
        public favorit (String nama, String makanan){
            this.Nama = nama;
            this.Makanan = makanan;
            Minuman = "Tidak suka minum";
        }
        
        public favorit (String nama, String makanan, String minuman){
            this.Nama = nama;
            this.Makanan = makanan;
            this.Minuman = minuman;
        }
        

    public void cetak() {
        System.out.println ("Nama             : "+Nama);
        System.out.println ("Makanan kesukaan : "+Makanan);
        System.out.println ("Minuman kesukaan : "+Minuman);
        System.out.println();
      }
}

public class Mainkonstruktor {
    public static void main(String[] args) {
       favorit favorit1 = new favorit("Andi");
       favorit favorit2 = new favorit("Budi","Bakso Telur");
       favorit favorit3 = new favorit("Jaka","Mie Ayam", "Air Mineral");
       favorit1.cetak();
       favorit2.cetak();
       favorit3.cetak();
       
    }
    
}
