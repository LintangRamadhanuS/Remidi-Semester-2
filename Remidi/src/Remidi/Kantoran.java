package Remidi;
public class Kantoran extends Sepatu {
    
    
protected String kategori = "Kantoran";   
public Kantoran(String merk, String jenis, String warna, int ukuran, double harga){
        super(merk, jenis, warna, ukuran, harga);
    }
    
public void showKantoran(){
        System.out.println("Kategori: Kantoran");
        System.out.println("Merk    : " + merk);
        System.out.println("Jenis   : " + jenis);
        System.out.println("Warna   : " + warna);
        System.out.println("Ukuran  : " + ukuran);
        System.out.println("Harga   : " + harga);
    }
}