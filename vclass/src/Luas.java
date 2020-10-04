class Luas_Keliling {
	double sisi;
	double jarijari;
        double phi;
}

public class Luas{
	public static void main(String[] args) {
	double luas_persegi;
        double keliling_persegi;
        double luas_lingkaran;
        double keliling_lingkaran;
        
	Luas_Keliling k = new Luas_Keliling();

	k.sisi = 5;
	k.jarijari = 10;
	k.phi = 3.14;
        
	luas_persegi = k.sisi*k.sisi;
        keliling_persegi = 4*k.sisi;
        luas_lingkaran = k.phi*k.jarijari*k.jarijari;
        keliling_lingkaran = 2*k.phi*k.jarijari;

       System.out.println("Luas Persegi = " +luas_persegi);
       System.out.println("Keliling Persegi = " +keliling_persegi);
       System.out.println("Luas Lingkaran = " +luas_lingkaran);
       System.out.println("Keliling Lingkaran = " +keliling_lingkaran);

}
}
