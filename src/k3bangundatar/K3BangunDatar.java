
package k3bangundatar;

public class K3BangunDatar {

    public static void main(String[] args) {
        PersegiPanjang pp =new PersegiPanjang();
        
        pp.setpanjang(10);
        pp.setlebar(5);
        pp.settinggi(7);
        
        System.out.println("panjang : "+ pp.getpanjang());
        System.out.println("lebar : "+ pp.getlebar());
        System.out.println("tinggi : "+ pp.gettinggi());
        System.out.println("luas : "+ pp.hitungluas());
        System.out.println("keliling : "+ pp.hitungkeliling());
    }
    
}
