package Praktikum1;

public class Bus4 {
    double penumpang, maxPenumpang, counter, penumpangBaru;

    public Bus4(double maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    public void addPenumpang(double penumpang) {
        this.penumpang = penumpang;
    }

    public void getPenumpang(int password) {
        double tambahkanOrang;
        tambahkanOrang = this.penumpang + penumpang;

        if (penumpang > maxPenumpang) {
            System.out.println("Melebihi Kapasitas !!");
            this.penumpang = 0;
            System.out.println("Penumpang direset menjadi 0");
            if (password == 123) {
                addPenumpang(0);
            }else {
                System.out.println("Password kamu salah !!");
            }
        }
    }

    public void getAverage() {
        double rataRata;
        rataRata = penumpang / maxPenumpang;
        System.out.println("Rata-rata penumpang bus adalah : "+rataRata);
    }

    public void cetak() {
        System.out.println("Jumlah penumpang bus adalah : "+penumpang);
        System.out.println("Jumlah maksimal penumpang bus adalah : "+maxPenumpang);
    }
}
