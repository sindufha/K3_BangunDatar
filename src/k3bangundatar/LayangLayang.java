/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package k3bangundatar;

/**
 *
 * @author MyBook Hype AMD
 */
public class LayangLayang extends BangunDatar{
    double diagonal1, diagonal2, sisipen, sisipan;
    
public LayangLayang (double d1, double d2, double sisiA, double sisiB){
    this.diagonal1 = d1 ;
    this.diagonal2 = d2 ;
    this.sisipen = sisiA ;
    this.sisipan = sisiB ;
}
    public double getLuas(){
        luas = 0.5 * diagonal1 * diagonal2;
        return 0;
    }
    
    public double getKeliling(){
        keliling = 2 * (sisipen + sisipan); 
        return 0;
    }
    
    
        @Override
    public void tampilkan() {
        System.out.println("=== LAYANG-LAYANG ===");
        System.out.println("Diagonal 1      : " + diagonal1);
        System.out.println("Diagonal 2      : " + diagonal2);
        System.out.println("Sisi Pendek     : " + sisipen);
        System.out.println("Sisi Panjang    : " + sisipan);
        System.out.println("Luas            : " + luas);
        System.out.println("Keliling        : " + keliling);

        
    }
    
}


