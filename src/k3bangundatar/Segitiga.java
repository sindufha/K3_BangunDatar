package k3bangundatar;

public class Segitiga {
    double alas, tinggi, sisiA, sisiB, sisiC;
    
    public void setalas(double als) {
        this.alas = als;
    }
    public double getalas (){
        return this.alas;
    }
    
    public void settinggi(double tgi){
        this.tinggi = tgi;
    }
    public double gettinggi (){
        return this.tinggi;
    }
    
    public void setsisiA(double a){
        this.sisiA = a;
    }
    public double getsisiA (){
        return this.sisiA;
    }
    
    public void setsisiB(double b){
        this.sisiB = b;
    }
    public double getsisiB (){
        return this.sisiB;
    }
       
    public void setsisiC(double c){
        this.sisiC = c;
    }
    public double getsisiC (){
        return this.sisiC;
    }
    
    public double hitungluas () {
        return 0.5 * alas * tinggi;
    }
    
    public double hitungkeliling(){
        return sisiA * sisiB * sisiC;
    }
    
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        
        s.setalas(6);
        s.settinggi(8);
        s.setsisiA(6);
        s.setsisiB(8);
        s.setsisiC(10);
        
        System.out.println("Luas dan Keliling Segitiga\n");
        System.out.println("Alas   : " + s.getalas());
        System.out.println("Tinggi : " + s.gettinggi());
        System.out.println("Sisi A : " + s.getsisiA());
        System.out.println("Sisi B : " + s.getsisiB());
        System.out.println("Sisi C : " + s.getsisiC());
        System.out.println("===================");
        System.out.println("Luas     : " + s.hitungluas());
        System.out.println("Keliling : " + s.hitungkeliling());
    }
}
