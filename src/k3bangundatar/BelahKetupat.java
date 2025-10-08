package k3bangundatar;
public class BelahKetupat extends BangunDatar1 {
    double sisi,d1,d2,luas,keliling;
    
    public BelahKetupat(double d1, double d2, double sisi){
        this.d1 = d1;
        this.d2 = d2;
        this.sisi = sisi;
        
    }
    public double hitungluas(){
        return 0.5 * d1 * d2;
    }
    void hitungLuas(){
        luas = 0.5 * d1 * d2;
    }
    void hitungKeliling(){
        keliling = 2 * sisi * sisi;
    }
    @Override
    public void tampilkan(){
        super.tampilkan();
        System.out.println("=== Belah Ketupat===");
        System.out.println("Panjang  d1 = " + d1);
        System.out.println("Panjang d2 = " + d2);
        System.out.println("Panjang sisi = " +sisi);
        System.out.println("Luas ="+luas);
        System.out.println("Keliling = " +keliling);
    }
}
