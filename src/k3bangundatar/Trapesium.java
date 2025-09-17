package k3bangundatar;


public class Trapesium {
    
    double sisiAtas, sisiBawah, sisiMiring1, sisiMiring2, tinggi;
    
    public void setsisiAtas(double sa){
        this.sisiAtas = sa;
    }
    public double getsisiAtas (){
        return this.sisiAtas;
    }
    
    public void setsisiBawah(double sb){
        this.sisiAtas = sb;
    }
    public double getsisiBawah (){
        return this.sisiBawah;
    }
    
    public void setsisiMiring1(double sm1){
        this.sisiMiring1 = sm1;
    }
    public double getsisiMiring1 (){
        return this.sisiMiring1;
    }
    
    public void setsisiMiring2(double sm2){
        this.sisiMiring2 = sm2;
    }
    public double getsisiMiring2 (){
        return this.sisiMiring2;
    }
    
    public void settinggi(double tgi){
        this.tinggi = tgi;
    }
    public double gettinggi(){
        return this.tinggi;
    }
    
    public double hitungLuas(){
        return 0.5 * (sisiAtas + sisiBawah) * tinggi;
    }
    
    public double hitungkeliling(){
        return sisiAtas + sisiBawah + sisiMiring1 + sisiMiring2;       
    }
    
    public static void main(String[] args) {
        
        Trapesium t = new Trapesium();
       
        t.setsisiAtas(6);
        t.setsisiBawah(10);
        t.setsisiMiring1(5);
        t.setsisiMiring2(7);
        t.settinggi(8);
        
        System.out.println("\nLuas dan Keliling Trapesium\n");
        System.out.println("Sisi Atas     : " + t.getsisiAtas());
        System.out.println("Sisi Bawah    : " + t.getsisiBawah());
        System.out.println("Sisi Miring A : " + t.getsisiMiring1());
        System.out.println("Sisi Miring B : " + t.getsisiMiring2());
        System.out.println("Sisi Tinggi   : " + t.gettinggi());
        System.out.println("===================");
        System.out.println("luas     : " + t.hitungLuas());
        System.out.println("Keliling : " + t.hitungkeliling());
    }
  
}
