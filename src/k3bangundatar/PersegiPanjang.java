
package k3bangundatar;


public class PersegiPanjang {
   double panjang, lebar,tinggi;
   
   public void setpanjang(double p){
        this.panjang = p;
    }
   public void setlebar(double l){
        this.lebar = l;
    }
   public void settinggi(double t){
        this.tinggi = t;
    }
   
   public double getpanjang(){
        return this.panjang;
    }
   public double getlebar(){
        return this.lebar;
    }
   public double gettinggi(){
        return this.tinggi;
    }
   public double hitungluas(){
        return panjang * lebar;
   }    
   public double hitungkeliling(){
        return 2 * panjang + lebar;
    }
        
     
     
  
   
   
   
   
   
   
}
