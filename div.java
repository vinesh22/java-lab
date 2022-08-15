import javax.swing.JButton;
import javax.swing.JFrame;
// import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.*;

public class div extends JFrame implements ActionListener {
    JTextField t1, t2, t3;
    JLabel l1, l2, l3;
    JButton b1;

    public div() {
        setTitle("divide");
        setSize(800, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1 = new JLabel("number1:");
        t1 = new JTextField(20);
        add(l1);
        add(t1);
        l2 = new JLabel("number2:");
        t2 = new JTextField(20);
        add(l2);
        add(t2);
        l3 = new JLabel("result");
        t3 = new JTextField(20);
        add(l3);
        add(t3);
        b1 = new JButton("Divide");
        b1.addActionListener(this);
        add(b1);
        setVisible(true);

    }

    public static void main(String[] args) {
        new div();
    }

    public void actionPerformed(ActionEvent e) {
        try {
            long num1 = Long.parseLong(t1.getText());
            long num2 = Long.parseLong(t2.getText());
            if (num2 == 0) {
                throw new ArithmeticException("divide by zero");
            }
            long i = num1 / num2;
            t3.setText(String.valueOf(i));
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(this, n.getMessage());
        }
    }
}
