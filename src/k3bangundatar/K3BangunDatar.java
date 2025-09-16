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
        
        System.out.println("Alas   : " + s.getalas());
        System.out.println("Tinggi : " + s.gettinggi());
        System.out.println("Sisi A : " + s.getsisiA());
        System.out.println("Sisi B : " + s.getsisiB());
        System.out.println("Sisi C : " + s.getsisiC());
    
    }
    
}
