package TugasRumah2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tampilLabel {

    public static void main(String[] args) {
        JFrame bingkai = new JFrame();
        bingkai.setTitle("KETERANGAN LABEL");
        bingkai.setBounds(200, 200, 700, 400);

        ImageIcon gambar = new ImageIcon("C:\\Users\\Ihsan Maulana\\Documents\\IdeaProject\\PBO_GENAP7_IHSAN\\image\\igapin.png");
        Image image = gambar.getImage();
        Image newimg = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        gambar = new ImageIcon(newimg);

        JLabel label = new JLabel();
        label.setBounds(50, 10, 900, 100);
        label.setText("Label 1 : Label berupa teks saja");
        label.setHorizontalTextPosition(JLabel.LEFT);
        label.setVerticalTextPosition(JLabel.TOP);

        JLabel label2 = new JLabel();
        label2.setBounds(50, 80, 900, 100);
        label2.setText("Label 2 : Label berupa icon di sebelah kiri teks");
        label2.setIcon(gambar);
        label2.setHorizontalTextPosition(JLabel.RIGHT);
        label2.setVerticalTextPosition(JLabel.CENTER);

        JLabel label3 = new JLabel();
        label3.setBounds(50, 200, 900, 100);
        label3.setIcon(gambar);

        JLabel label4 = new JLabel();
        label4.setBounds(50, 270, 900, 100);
        label4.setText("Label 3 : Label berupa icon di atas teks");
        label4.setHorizontalTextPosition(JLabel.LEFT);
        label4.setVerticalTextPosition(JLabel.BOTTOM);

        //

        bingkai.add(label);
        bingkai.add(label2);
        bingkai.add(label3);
        bingkai.add(label4);
        bingkai.setLayout(null);
        bingkai.setVisible(true);
        bingkai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void labelMouseClicked(java.awt.event.MouseEvent evt) {
        System.out.print("Hallo");
    }
    public void label1MouseClicked(java.awt.event.MouseEvent evt) {
        System.out.print("Hallo");
    }
    public void label2MouseClicked(java.awt.event.MouseEvent evt) {
        System.out.print("Hallo");
    }
}


