package encapsulationWithAssesorAndMutator;


public class Bus3 {
    int penumpang, maxPenumpang, penumpangBaru;

    public Bus3(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    public void addPenumpang(int penumpangBaru) {

        this.penumpangBaru = penumpang;
    }

    public void getPenumpang(int password) {
        int tambahkanOrang;
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

    public void cetak() {
        System.out.println("Penumpang bus adalah : "+penumpang);
        System.out.println("Penumpang maksimal bus adalah : "+maxPenumpang);
    }

}
