/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package k3bangundatar;

/**
 *
 * @author MyBook Hype AMD
 */
public class JajarGenjang {
    double alas;
    double tinggi;
    double sisiMiring;

    // Setter (set method)
    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisiMiring(double sisiMiring) {
        this.sisiMiring = sisiMiring;
    }

    // Getter (get method)
    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getSisiMiring() {
        return sisiMiring;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return alas * tinggi;
    }

    // Method untuk menghitung keliling
    public double hitungKeliling() {
        return 2 * (alas + sisiMiring);
    }
}
