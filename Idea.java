import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Idea implements ActionListener {
    JButton panelb1, panelb2, sw1, sw2;
    JPanel panel1, panel2;

    public Idea() {
        JFrame frame = new JFrame("Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setVisible(true);

        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.setBackground(Color.magenta);
        panel1.setBounds(10, 10, 250, 250);
        frame.add(panel1);
        panelb1 = new JButton("Click");
        panelb1.addActionListener(this);
        panel1.add(panelb1);

        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.setBackground(Color.cyan);
        panel2.setBounds(10, 10, 250, 250);
        frame.add(panel2);
        panelb2 = new JButton("Click");
        panelb2.addActionListener(this);
        panel2.add(panelb2);

        sw1 = new JButton("Panel 1");
        sw1.setBounds(280, 10, 80, 25);
        sw1.addActionListener(this);
        frame.add(sw1);

        sw2 = new JButton("Panel 2");
        sw2.setBounds(370, 10, 80, 25);
        sw2.addActionListener(this);
        frame.add(sw2);

    }

    public static void main(String[] args) {
        new Idea();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelb1) {
            System.out.println("Panel 1");
        }
        if (e.getSource() == panelb2) {
            System.out.println("Panel 2");
        }
        if (e.getSource() == sw1) {
            panel2.setVisible(false);
            panel1.setVisible(true);
        }
        if (e.getSource() == sw2) {
            panel1.setVisible(false);
            panel2.setVisible(true);
        }
    }
}
