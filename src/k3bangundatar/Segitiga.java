package k3bangundatar;

public class Segitiga extends BangunDatar{
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
    
    public void Luas() {
        luas = 0.5 * alas * tinggi;
    }

    public void Keliling() {
        keliling = sisiA + sisiB + sisiC;
    }

    @Override
    public void tampilkan() {
        System.out.println("=== SEGITIGA ===");
        System.out.println("Alas      : " + alas);
        System.out.println("Tinggi    : " + tinggi);
        System.out.println("Sisi 1    : " + sisiA);
        System.out.println("Sisi 2    : " + sisiB);
        System.out.println("Sisi 3    : " + sisiC);
        System.out.println("Luas      : " + luas);
        System.out.println("Keliling  : " + keliling);
    }
}
