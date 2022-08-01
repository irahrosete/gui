import javax.swing.*;
import java.awt.*;

public class CircleAndButton extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.blue);
        g.fillOval(100, 75, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        CircleAndButton circle = new CircleAndButton();
        frame.getContentPane().add(BorderLayout.CENTER, circle);

        JButton button = new JButton("click me");
        frame.getContentPane().add(BorderLayout.SOUTH, button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
