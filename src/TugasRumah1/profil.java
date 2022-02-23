package TugasRumah1;

public class profil {
    int NIS;
    String nama, program_Studi, tempat_Lahir, tanggal_Lahir, jenis_Kelamin;

    public profil() {
        NIS = 2208678;
        nama = "Ihsan Maulana";
        program_Studi = "Rekayasa Perangkat Lunak";
        tempat_Lahir = "Bandung";
        tanggal_Lahir = "14-10-2004";
        jenis_Kelamin = "Laki-Laki";
    }

    public void cetak() {
        System.out.println("NIS : "+NIS);
        System.out.println("Nama : "+nama);
        System.out.println("Jurusan : "+program_Studi);
        System.out.println("Tempat Lahir : "+tempat_Lahir);
        System.out.println("Tanggal Lahir : "+tanggal_Lahir);
        System.out.println("Jenis Kelamin : "+jenis_Kelamin);
    }
}
