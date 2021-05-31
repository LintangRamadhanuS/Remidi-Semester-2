package Remidi;
public class Lari extends Sepatu {
    

protected String kategori = "Lari";
public Lari(String merk, String jenis, String warna, int ukuran, double harga){
        super(merk, jenis, warna, ukuran, harga);
    }
    
    public void showLari(){
        System.out.println("Kategori: Lari");
        System.out.println("Merk    : " + merk);
        System.out.println("Jenis   : " + jenis);
        System.out.println("Warna   : " + warna);
        System.out.println("Ukuran  : " + ukuran);
        System.out.println("Harga   : " + harga);
    }
    
}