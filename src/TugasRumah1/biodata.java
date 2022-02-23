package TugasRumah1;
import javax.swing.*;
import java.awt.*;

public class biodata {

    public static void main(String[] args) {
        profil siswa = new profil();
        siswa.cetak();

        JFrame bingkai = new JFrame();
        bingkai.setTitle("PROFIL SISWA");
        bingkai.setBounds(200, 200, 400, 200);

        ImageIcon gambar = new ImageIcon("C:\\Users\\Ihsan Maulana\\Documents\\IdeaProject\\PBO_GENAP7_IHSAN\\image\\igapin.png");
        Image image = gambar.getImage();
        Image newimg = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        gambar = new ImageIcon(newimg);


        JLabel tanda;

        tanda = new JLabel("<html>" +
                "NIS           : "+siswa.NIS+"<br>" +
                "Nama          : "+siswa.nama+"<br>" +
                "Jurusan       : "+siswa.program_Studi+"<br>" +
                "Tempat Lahir  : "+siswa.tempat_Lahir+"<br>" +
                "Tanggal Lahir : "+siswa.tanggal_Lahir+"<br>" +
                "Jenis Kelamin : "+siswa.jenis_Kelamin+"<br>" +
                "</html>");
        tanda.setBounds(50, 30, 900, 100);
        tanda.setIcon(gambar);
        tanda.setHorizontalTextPosition(JLabel.RIGHT);
        tanda.setVerticalTextPosition(JLabel.TOP);

        bingkai.add(tanda);
        bingkai.setLayout(null);
        bingkai.setVisible(true);
        bingkai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
