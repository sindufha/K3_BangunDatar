/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package k3bangundatar;

/**
 *
 * @author MyBook Hype AMD
 */
public class BelahKetupat {
    double sisi,d1,d2,luas,keliling;
    public void setsisi(double sisi){
        this.sisi = sisi;
    }
    public void setd1(double d1){
        this.d1 = d1;
    }
    public void setd2(double d2){
        this.d2 = d2;
    }
    public double getsisi(){
        return this.sisi;
    }
    public double getd1(){
        return this.d1;
    }
    public double getd2(){
        return this.d2;
    }
    public double hitungluas(){
        return 0.5 * d1 * d2;
    }
    public double hitungKeliling(){
        return 4 * sisi;
    }
}
