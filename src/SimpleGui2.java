import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.BorderLayout.*;

public class SimpleGui2 implements ActionListener {
    private JFrame frame;

    public static void main(String[] args) {
        SimpleGui2 gui = new SimpleGui2();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("change colours");
        button.addActionListener(this);

        MyDrawPanel panel = new MyDrawPanel();

        frame.getContentPane().add(SOUTH, button);
        frame.getContentPane().add(CENTER, panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }
}
