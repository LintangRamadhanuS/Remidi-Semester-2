package Remidi;
public class Olahraga extends Sepatu {
    

protected String kategori = "Olahraga";
public Olahraga(String merk, String jenis, String warna, int ukuran, double harga){
        super(merk, jenis, warna, ukuran, harga);
    }
    
    public void showOlahraga(){
        System.out.println("Kategori: Olahraga");
        System.out.println("Merk    : " + merk);
        System.out.println("Jenis   : " + jenis);
        System.out.println("Warna   : " + warna);
        System.out.println("Ukuran  : " + ukuran);
        System.out.println("Harga   : " + harga);
    }
    
}