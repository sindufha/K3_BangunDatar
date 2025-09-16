/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package k3bangundatar;

/**
 *
 * @author MyBook Hype AMD
 */
public class K3BangunDatar {

    /**
     * @param args the command line arguments
     */
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
