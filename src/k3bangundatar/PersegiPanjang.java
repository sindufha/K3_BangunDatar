
package k3bangundatar;


public class PersegiPanjang extends BangunDatar {
    double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void Luas() {
        luas = panjang * lebar;
    }

    public void Keliling() {
        keliling = 2 * (panjang + lebar);
    }

    @Override
    public void tampilkan() {
        System.out.println("=== PERSEGI PANJANG ===");
        System.out.println("Panjang   : " + panjang);
        System.out.println("Lebar     : " + lebar);
        System.out.println("Luas      : " + luas);
        System.out.println("Keliling  : " + keliling);
    } 
}
  
   
   
   
   
   
   

