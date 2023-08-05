import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUITest implements ActionListener {
    int c=0;
    JLabel label;

    GUITest(){

        JFrame frame = new JFrame("My First GUI");
        JButton button=new JButton("Click Me");
        button.addActionListener(this);

        label=new JLabel("No of Clicks = "+c);

        JPanel panel=new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args){
        new GUITest();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        c++;
        label.setText("No of Clicks = "+c);
    }
}
