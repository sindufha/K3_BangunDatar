/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package k3bangundatar;

/**
 *
 * @author MyBook Hype AMD
 */
public class Persegi extends BangunDatar{
    double sisi;
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    
    public double Luas(){
        return sisi * sisi;
    }
    public double Keliling(){
        return 4 * sisi;
    }
    @Override
    public void tampilkan(){
        super.tampilkan();
        System.out.println("====PERSEGI===");
        System.out.println("Sisi : " + sisi);
        System.out.println("Luas : " + Luas());
        System.out.println("Keliling : " + Keliling());
        
        
        
    }
}
