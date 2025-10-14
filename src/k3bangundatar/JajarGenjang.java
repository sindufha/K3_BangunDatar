/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package k3bangundatar;

/**
 *
 * @author MyBook Hype AMD
 */
public class JajarGenjang extends BangunDatar{
    double alas;
    double tinggi;
    double sisiMiring;

 public JajarGenjang (double a, double t, double sM){
     this.alas = a;
     this.tinggi = t;
     this.sisiMiring = sM;
 }
    // Method untuk menghitung luas
    public double getLuas() {
        return alas * tinggi;
    }
    // Method untuk menghitung keliling
    public double getKeliling() {
        return 2 * (alas + sisiMiring);
    }
    @Override
    public void tampilkan(){
        System.out.println("===JAJAR GENJANG===");
        System.out.println("alas : "+ alas);
        System.out.println("tinggi : "+ tinggi);
        System.out.println("sisiMiring : "+ sisiMiring);
        System.out.println("luas : "+ getLuas());
        System.out.println("keliling : "+ getKeliling());

    }
}
