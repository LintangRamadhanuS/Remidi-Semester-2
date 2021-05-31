package Remidi;
public class HitungDiskon {
    
    
    
    static public double potonganharga(int jumlahpembelian){
        
    double result = 0;
        
    if(jumlahpembelian == 2){
            result = 50000.0;
        }
    else if(jumlahpembelian == 3){
            result = 100000.0;
        }
        
    return result;
    }
}