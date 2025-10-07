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
    
    public double hitungluas () {
        return 0.5 * alas * tinggi;
    }
    
    public double hitungkeliling(){
        return sisiA * sisiB * sisiC;
    }
    
}
