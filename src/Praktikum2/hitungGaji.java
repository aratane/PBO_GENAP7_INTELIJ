package Praktikum2;

public class hitungGaji {
    public static void main(String[] args) {
        GajiPegawai uang = new GajiPegawai();
        uang.setGaji(500000);
        uang.hitungPajak();
        uang.hitungGaji();
        uang.cetakGaji();
    }
}
