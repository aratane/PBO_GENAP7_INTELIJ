package noEncapsulation;

import noEncapsulation.Bus;

public class UjiBus {
    public static void main(String[] args) {
        Bus busMini = new Bus();
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        busMini.cetak();

        // menambah penumpang
        busMini.penumpang = busMini.penumpang + 5;
        busMini.cetak();

        // mengurangi penumpang
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();

        // tambah jumlah penumpang
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();

        // output 16 menandakan kelebihan penumpang
    }
}
