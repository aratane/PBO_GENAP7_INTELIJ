package Praktikum1;

public class UjiBus4 {
    public static void main(String[] args) {
        Bus4 busGila = new Bus4(60);
        System.out.println("====================");
        busGila.penumpang = 61;
        busGila.getPenumpang(123);
        busGila.getAverage();
        busGila.cetak();
        System.out.println("====================");
    }
}
