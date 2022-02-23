package Latihan4;
import javax.swing.JFrame;

public class CreateFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("CREATE TITLE");
        frame.setBounds(200,200,300,150);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
