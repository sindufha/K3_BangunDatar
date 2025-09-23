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
        // TODO code application logic here
        LayangLayang layang = new LayangLayang();
        
        layang.setDiagonal1(12);
        layang.setDiagonal2(24);
        layang.setSisiPan(20);
        layang.setSisiPen(10);
        
        
        System.out.println("Luas : " + layang.setLuas());
        System.out.println("Keliling : " + layang.setKeliling());
        
        
    }
    
}
