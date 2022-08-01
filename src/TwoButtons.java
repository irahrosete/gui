import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.BorderLayout.*;

public class TwoButtons {
    private JFrame frame;
    private JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton colorButton = new JButton("change colour");
        colorButton.addActionListener(new ColorListener());

        JButton labelButton = new JButton("change label");
        labelButton.addActionListener(new LabelListener());

        label = new JLabel("I'm a label");
        MyDrawPanel panel = new MyDrawPanel();

        frame.getContentPane().add(SOUTH, colorButton);
        frame.getContentPane().add(EAST, labelButton);
        frame.getContentPane().add(WEST, label);
        frame.getContentPane().add(CENTER, panel);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    class ColorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }

    class LabelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Ouch!");
        }
    }
}
