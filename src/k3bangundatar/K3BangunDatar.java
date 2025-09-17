package k3bangundatar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author MyBook Hype AMD
 */
public class K3BangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BelahKetupat bk = new BelahKetupat();
        
        bk.setsisi(12);
        bk.setd1(9);
        bk.setd2(9);
        System.out.println("========== Belah Ketupat ==========");
        System.out.println("Panjang sisi:"+bk.getsisi());
        System.out.println("Panjang d1 :"+bk.getd1());
        System.out.println("Panjang d2 :"+bk.getd2());
        System.out.println("Luas :"+bk.hitungluas());
        System.out.println("Keliling :"+bk.hitungKeliling());
    }
    
}
