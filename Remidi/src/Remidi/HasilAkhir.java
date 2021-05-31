package Remidi;
import java.util.Scanner;


public class HasilAkhir {
    
    
    
static Olahraga SepatuOlahraga = new Olahraga("Adidas", "Pria", "Black", 30, 500000);
static Kantoran SepatuKantoran = new Kantoran("Fila", "Wanita", "Black", 30, 700000);
static Santai SepatuSantai = new Santai("Skechers", "Wanita", "White", 30, 900000);
      


    public static void main(String[] args) {
        
        String KB;
        int jumlahpembelian, norpil;
        double diskon, hargatotal;
        double harga = 0;
        
        
        System.out.println("Toko Jayabaru");
        System.out.println("==========");
        System.out.println("Nama Kasir: Chrisna");
        System.out.println("Tanggal Pembelian: 29 Mei 2021");
        System.out.println("==========");
        
        System.out.println("Daftar Sepatu: ");
        System.out.println("\n1. Sepatu Pertama:");
        SepatuOlahraga.showOlahraga();
        System.out.println("\n2. Sepatu Kedua:");
        SepatuKantoran.showKantoran();
        System.out.println("\n3. Sepatu Ketiga:");
        SepatuSantai.showSantai();
        System.out.println("==========");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Silahkan Input Nomor Pilihan Anda: ");
        norpil = scanner.nextInt();
        
        switch(norpil){
            case 1: 
                harga = SepatuOlahraga.getHarga(); 
                break;
            case 2: 
                harga = SepatuKantoran.getHarga(); 
                break;
            case 3: 
                harga = SepatuSantai.getHarga(); 
                break;
        }      
        
        System.out.println("==========");
        System.out.println("Informasi: Anda hanya dapat membeli sepatu sebanyak 1-3 buah.");
        System.out.print("Silahkan Input Jumlah Barang Yang Dibeli: ");
        jumlahpembelian = scanner.nextInt();
        System.out.println("==========");
        
        hargatotal = harga*jumlahpembelian - HitungDiskon.potonganharga(jumlahpembelian);
        
        System.out.println("Berikut Merupakan Total Harga Beli Anda: "+hargatotal);
        
        

        
    }
}