package k3bangundatar;


public class Main {
    
    
    public static void main(String[] args) {
        Persegi p = new Persegi(10);
        p.Luas();
        p.Keliling();
        p.tampilkan();
       
        
        
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


