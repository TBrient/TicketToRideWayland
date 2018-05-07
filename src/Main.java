/**
 * Created by student on 5/7/18.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by michael_hopps on 5/4/18.
 */
public class Main extends JPanel {

    public Main(int w, int h ) {
        setSize(WIDTH, HEIGHT);


    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;


    }


    public static final int WIDTH = 1000, HEIGHT = 800;
    public static void main(String[] args) {

        JFrame window = new JFrame("Ticket To Ride Wayland");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        window.setBounds(0, 0, WIDTH, HEIGHT + 22); //(x, y, w, h) 22 due to title bar.

        JPanel panel = new Main(WIDTH, HEIGHT);

        panel.setFocusable(true);
        panel.grabFocus();

        window.add(panel);
        window.setVisible(true);
        window.setResizable(false);
    }
}