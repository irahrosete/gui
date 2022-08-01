import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui implements ActionListener {
    private JButton button;

    public static void main(String[] args) {
        SimpleGui gui = new SimpleGui();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button  = new JButton("click me");
        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked!");
    }
}
