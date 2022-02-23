package Latihan6;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class LabelIcon {

    private JLabel label;

    public LabelIcon() {
        JFrame frame = new JFrame();
        frame.setTitle("Label Icon");
        frame.setBounds(200, 200, 350, 200);

        ImageIcon image = new ImageIcon("C:\\Users\\Ihsan Maulana\\Documents\\IdeaProject\\PBO_GENAP7_IHSAN\\image\\igapin.png");
        label = new JLabel();
        label.setBounds(25, 25, 325, 100);
        label.setText("SMK IGASAR PINDAD BANDUNG");
        label.setIcon(image);
        label.setHorizontalTextPosition(SwingConstants.LEFT);
        label.setVerticalTextPosition(SwingConstants.TOP);

        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        LabelIcon frame = new LabelIcon();
    }
}
