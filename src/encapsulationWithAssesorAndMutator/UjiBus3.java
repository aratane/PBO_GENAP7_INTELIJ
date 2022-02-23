package encapsulationWithAssesorAndMutator;

public class UjiBus3 {
    public static void main(String[] args) {
        Bus3 busSedang = new Bus3(30);
        busSedang.penumpang = 10;
        busSedang.getPenumpang(1);
        busSedang.cetak();
        System.out.println("========================");

        busSedang.penumpang = 5;
        busSedang.getPenumpang(23);
        busSedang.cetak();
        System.out.println("========================");

        busSedang.penumpang = 200;
        busSedang.getPenumpang(123);
        busSedang.cetak();
        System.out.println("========================");
    }
}
