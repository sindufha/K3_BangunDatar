/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package k3bangundatar;

/**
 *
 * @author MyBook Hype AMD
 */
public class BangunDatar1 {

    double luas;
    double keliling;

    // Konstruktor kosong (bisa dipakai semua subclass)
    public BangunDatar1() {
    }

    // Getter — cuma buat baca hasil perhitungan
    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }

    // Method umum yang nanti akan dioverride oleh subclass
    void hitungLuas() {}
    void hitungKeliling() {}
    

}
