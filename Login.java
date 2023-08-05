import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {
    JFrame frame;
    JPanel panel;
    JLabel label, passwordLabel, logMessage;
    JButton button;
    JTextField username;
    JPasswordField passwordField;

    Login() {
        frame = new JFrame("Another GUI");
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 180);
        frame.add(panel);
        label = new JLabel("User");
        label.setBounds(10, 20, 80, 25);
        panel.add(label);
        username = new JTextField();
        username.setBounds(100, 20, 165, 25);
        panel.add(username);
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);
        passwordField = new JPasswordField();
        passwordField.setBounds(100, 50, 165, 25);
        panel.add(passwordField);
        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(this);
        panel.add(button);
        logMessage = new JLabel();
        logMessage.setBounds(10, 110, 300, 25);
        panel.add(logMessage);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String id,pass;
        id=username.getText();
        pass=passwordField.getText();
        System.out.println("User : "+id);
        System.out.println("Password : "+pass);
        if(id.equals("Faizan")&&pass.equals("Farhan")){
            logMessage.setText("Login Successful");
        }
        else
            logMessage.setText("Incorrect Parameters");
    }
}
