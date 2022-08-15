import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class traffic extends JFrame implements ItemListener {
    JLabel x, y;
    JPanel p1, p2;
    JRadioButton b1, b2, b3;

    public traffic() {
        setLayout(new GridLayout(2, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);
        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        x = new JLabel();
        x.setFont(new Font("arial", Font.BOLD, 20));
        p1.add(x);
        add(p1);
        p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        y = new JLabel("select: ");
        p2.add(y);
        ButtonGroup bg = new ButtonGroup();
        b1 = new JRadioButton("red");
        b1.setBackground(Color.RED);
        p2.add(b1);
        bg.add(b1);
        b1.addItemListener(this);
        b2 = new JRadioButton("yellow");
        b2.setBackground(Color.YELLOW);
        p2.add(b2);
        bg.add(b2);
        b2.addItemListener(this);
        b3 = new JRadioButton("green");
        b3.setBackground(Color.GREEN);
        p2.add(b3);
        bg.add(b3);
        b3.addItemListener(this);
        add(p2);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        JRadioButton r = (JRadioButton) e.getSource();
        switch (r.getText()) {
            case "red": {
                x.setText("Stop");
                x.setForeground(Color.RED);
            }
                break;
            case "yellow": {
                x.setText("READY");
                x.setForeground(Color.YELLOW);
            }
                break;
            case "green": {
                x.setText("GO");
                x.setForeground(Color.GREEN);
            }
                break;
        }
    }

    public static void main(String[] args) {
        new traffic();
    }
}
