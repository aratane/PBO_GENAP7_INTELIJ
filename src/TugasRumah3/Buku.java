package TugasRumah3;
import java.util.Scanner;

public class Buku {
    private String judulBuku = "Konsep Dasar Pemrograman Java";
    private String pengarangBuku = "Ihsan Maulana";
    private int stokbuku = 27;
    private int hargaBuku = 75000;

    String namaPembeli, alamatPembeli;
    int banyakPembelian, bayarBuku, sisaBuku;

    public Buku() {

        Scanner buyer = new Scanner(System.in);

        System.out.println("SELAMAT DATANG DI TOKO BUKU MERAPI");
        System.out.println("DATA BUKU YANG TERSEDIA : ");
        System.out.println("================");
        System.out.println("Judul buku : "+judulBuku);
        System.out.println("Nama pengarang : "+pengarangBuku);
        System.out.println("Harga buku = RP."+hargaBuku);
        System.out.println("Stok buku yang tersedia = "+stokbuku);
        System.out.println("================ \n");

        System.out.println("DATA PEMBELIAN : ");
        System.out.println("================");
        System.out.println("Masukan nama anda : ");
        setPembeli(buyer.nextLine());

        System.out.println("Masukan alamat anda : ");
        setAlamat(buyer.nextLine());

        System.out.println("Masukan jumlah buku yang ingin dibeli = ");
        setPembelian(buyer.nextInt());

        System.out.println("================ \n");
    }

    public void setPembeli(String nama) {
        namaPembeli = nama;
    }
    public void setAlamat(String alamat) {
        alamatPembeli = alamat;
    }
    public void setPembelian(int pembelian) {
        banyakPembelian = pembelian;
    }
    public void hitungBayar() {
        bayarBuku = hargaBuku * banyakPembelian;
    }
    public void hitungSisa() {
        sisaBuku = stokbuku - banyakPembelian;
    }

    public void kuitansi() {
        System.out.println("DATA BUKU YANG DIBELI");
        System.out.println("================");
        System.out.println("Judul buku : "+judulBuku);
        System.out.println("Nama pengarang : "+pengarangBuku);
        System.out.println("Harga buku = RP."+hargaBuku);
        System.out.println("Stok buku yang tersedia = "+stokbuku);
        System.out.println("================ \n");

        System.out.println("DATA PEMBELI");
        System.out.println("=================");
        System.out.println("Nama pembeli : "+namaPembeli);
        System.out.println("Alamat pembeli : "+alamatPembeli);
        System.out.println("Jumlah buku yang dibeli = "+banyakPembelian);
        System.out.println("================ \n");

        System.out.println("KUITANSI PEMBELIAN");
        System.out.println("=================");
        System.out.println("Nama pembeli : "+namaPembeli);
        System.out.println("Alamat pembeli : "+alamatPembeli);
        System.out.println("Jumlah buku yang dibeli = "+banyakPembelian);
        System.out.println("Jumlah harga yang harus dibayar = RP."+bayarBuku);
        System.out.println("================ \n");

        System.out.println("UPDATE STOK BUKU");
        System.out.println("=================");
        System.out.println("Judul buku : "+judulBuku);
        System.out.println("Nama pengarang : "+pengarangBuku);
        System.out.println("Harga buku = RP."+hargaBuku);
        System.out.println("Sisa buku adalah = "+sisaBuku);
        System.out.println("================");
    }
}
