package Praktikum2;

public class GajiPegawai {
    private double gajiKotor, pajak, gajiBersih;
    private double potongan = 75000;
    private String nama = "Ihsan";

    public void setGaji(double gaji) {
        gajiKotor = gaji;
    }
    public void hitungPajak() {
        pajak = 0.2 * gajiKotor;
    }
    public void hitungGaji() {
        gajiBersih = gajiKotor - pajak - potongan;
    }
    public String namaPegawai() {
        return nama;
    }
    public double getGajiKotor() {
        return gajiKotor;
    }
    public double getPajak() {
        return pajak;
    }
    public double getPotongan() {
        return potongan;
    }
    public double getGajiBersih() {
        return gajiBersih;
    }

    public void cetakGaji() {
        System.out.println("Nama pegawai : "+nama);
        System.out.println("Gaji kotor "+nama+" adalah : RP."+gajiKotor);
        System.out.println("Pajak gaji adalah : RP."+pajak);
        System.out.println("Potongan gaji adalah : RP."+potongan);
        System.out.println("Gaji bersih "+nama+" adalah : RP."+gajiBersih);
    }
}
