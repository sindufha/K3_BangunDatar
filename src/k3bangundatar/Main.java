package k3bangundatar;


public class Main {
    
    
    public static void main(String[] args) {
        
        LayangLayang layang = new LayangLayang(10, 5, 10, 5);
        layang.getLuas();
        layang.getKeliling();
        layang.tampilkan();
        
        JajarGenjang jjg = new JajarGenjang(10,20,30); 
        jjg.getLuas();
        jjg.getKeliling();
        jjg.tampilkan();
        
        Persegi p = new Persegi(10);
        p.Luas();
        p.Keliling();
        p.tampilkan();
       
        
        PersegiPanjang pp = new PersegiPanjang(10, 20);
        pp.Luas();
        pp.Keliling();
        pp.tampilkan();
        
        
      BelahKetupat bk = new BelahKetupat(10, 10, 20);
      
      bk.hitungLuas();
      bk.hitungKeliling();
      bk.tampilkan();
      
      Segitiga s = new Segitiga(6, 8, 5, 7, 9);
            

            s.hitungLuas();
            s.hitungKeliling();
            s.tampilkan();
           
          
        }
    }


