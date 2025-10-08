package k3bangundatar;

public class Segitiga extends BangunDatar1{
    double alas, tinggi, sisiA, sisiB, sisiC;

    // Konstruktor
    public Segitiga(double alas, double tinggi, double a, double b, double c) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = a;
        this.sisiB = b;
        this.sisiC = c;
    }

    void hitungLuas() {
        luas = 0.5 * alas * tinggi;
    }

    void hitungKeliling() {
        keliling = sisiA + sisiB + sisiC;
    }

    @Override
    public void tampilkan() {
        super.tampilkan();
        System.out.println("=== SEGITIGA ===");
        System.out.println("Alas      : " + alas);
        System.out.println("Tinggi    : " + tinggi);
        System.out.println("Sisi A    : " + sisiA);
        System.out.println("Sisi B    : " + sisiB);
        System.out.println("Sisi C    : " + sisiC);
        System.out.println("Luas      : " + getLuas());
        System.out.println("Keliling  : " + getKeliling());
    }
    
    public static void main(String[] args) {
    }
    
}
