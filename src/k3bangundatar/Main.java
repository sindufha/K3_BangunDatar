package k3bangundatar;


public class Main {
    
    double luas, keliling;

    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }
    
    public static void main(String[] args) {
        System.out.println("Program Menghitung Luas Dan Keliling Bangun Datar");
        System.out.println("============Dibuat Oleh Kelompok 3================");
        BelahKetupat bk = new BelahKetupat();
        System.out.print("\n");
        bk.setsisi(12);
        bk.setd1(9);
        bk.setd2(9);
        System.out.println("========== Belah Ketupat ==========");
        System.out.println("Panjang sisi:"+bk.getsisi());
        System.out.println("Panjang d1 :"+bk.getd1());
        System.out.println("Panjang d2 :"+bk.getd2());
        System.out.println("Luas :"+bk.hitungluas());
        System.out.println("Keliling :"+bk.hitungKeliling());
        System.out.print("\n");
        
       Segitiga sg = new Segitiga();
       sg.setalas(10);
       sg.setsisiA(8);
       sg.setsisiB(8);
       sg.setsisiC(8);
       sg.settinggi(10);
       System.out.println("============ Segitiga =============");
       System.out.println("Panjang Alas : "+sg.getalas());
       System.out.println("Tinggi :"+sg.gettinggi());
       System.out.println("Panjang Sisi A :"+sg.getsisiA());
       System.out.println("Panjang Sisi B :"+sg.getsisiB());
       System.out.println("Panjang Sisi C :"+sg.getsisiC());
       System.out.println("Luas Segitiga :"+sg.hitungluas());
       System.out.println("Keliling Segitiga :"+sg.hitungkeliling());
       System.out.print("\n");
       
       JajarGenjang jg = new JajarGenjang();
       jg.setAlas(10);
       jg.setSisiMiring(12);
       jg.setTinggi(8);
       System.out.println("========== Jajar Genjang ==========");
       System.out.println("Panjang Alas :"+jg.getAlas());
       System.out.println("Panjang Sisi Miring :"+jg.getSisiMiring());
       System.out.println("Tinggi :"+jg.getTinggi());
       System.out.println("Luas Jajar Genjang :"+jg.hitungLuas());
       System.out.println("Keliling Jajar Genjang :"+jg.hitungKeliling());
       System.out.print("\n"); 
        
        Persegi ps = new Persegi();
        ps.setsisi(8);
        System.out.println("============ Persegi ==============");
        System.out.println("Panjang Sisi : "+ps.getsisi());
        System.out.println("Luas Persegi : "+ps.hitungLuas());
        System.out.println("Keliling Persegi : "+ps.hitungKeliling());
        System.out.print("\n");
        
        PersegiPanjang pp = new PersegiPanjang();
        pp.setpanjang(12);
        pp.setlebar(8);
        System.out.println("========= Persegi Panjang =========");
        System.out.println("Panjang : "+pp.getpanjang());
        System.out.println("Lebar : "+pp.getlebar());
        System.out.println("Luas Persegi Panjang : "+pp.hitungluas());
        System.out.println("Keliling Persegi Panjang : "+pp.hitungkeliling());
        System.out.print("\n");
        
        LayangLayang ll = new LayangLayang();
        ll.setDiagonal1(10);
        ll.setDiagonal2(8);
        ll.setSisiPen(6);
        ll.setSisiPan(5);
        System.out.println("========== Layang-Layang ==========");
        System.out.println("Diagonal 1 : "+ll.getDiagonal1());
        System.out.println("Diagonal 2 : "+ll.getDiagonal2());
        System.out.println("Panjang Sisi A : "+ll.getSisiPen());
        System.out.println("Panjang Sisi B : "+ll.getSisiPan());
        System.out.println("Luas Layang-Layang : "+ll.getLuas());
        System.out.println("Keliling Layang-Layang : "+ll.getKeliling());
        
     
       
       
        
    }

}
