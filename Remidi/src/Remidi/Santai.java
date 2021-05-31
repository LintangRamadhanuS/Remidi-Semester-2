package Remidi;
public class Santai extends Sepatu{
  
    
    
protected String kategori = "Santai";
public Santai(String merk, String jenis, String warna, int ukuran, double harga){
        super(merk, jenis, warna, ukuran, harga);
    }
    
    public void showSantai(){
        System.out.println("Kategori: Santai");
        System.out.println("Merk    : " + merk);
        System.out.println("Jenis   : " + jenis);
        System.out.println("Warna   : " + warna);
        System.out.println("Ukuran  : " + ukuran);
        System.out.println("Harga   : " + harga);
    }
}