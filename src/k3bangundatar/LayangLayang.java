/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package k3bangundatar;

/**
 *
 * @author MyBook Hype AMD
 */
public class LayangLayang {
    double diagonal1, diagonal2, sisipen, sisipan, luas, keliling;
    
    public void setDiagonal1 (double diagonalKu){
        this.diagonal1=diagonalKu;
    } 
    public double getDiagonal1 (){
        return this.diagonal1;
    } 
    public void setDiagonal2 (double diaoganl2){
        this.diagonal2 = diaoganl2;
    }
    public double getDiagonal2 (){
        return this.diagonal2;
    }
    public void setSisiPen (double sisiPenKu){
        this.sisipen = sisiPenKu;
    }
    public double getSisiPen (){
        return this.sisipen;
    }
    public void setSisiPan (double sisiPanKu){
        this.sisipan = sisiPanKu;
    }
    public double getSisiPan (){
        return this.sisipan;
    }
    public double setLuas (){
        return this.luas = 0.5 * diagonal1 * diagonal2; 
    }
    public double setKeliling (){
        return this.keliling = 2 * (sisipan + sisipen);
    }
}
