import javax.swing.*;
import java.awt.*;
// import javax.swing.event.*;
import java.awt.event.*;

public class cal extends JFrame implements ActionListener {
    JTextField t1;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    // JPanel p, ui;
    String v = "";
    String v1 = "0";
    String op = "";

    public cal() {
        setTitle("labcal");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setLayout(new );
        JPanel p = new JPanel(new BorderLayout(5, 5));
        t1 = new JTextField(40);
        t1.setText(v);
        p.add(t1, BorderLayout.NORTH);
        // add(p);
        JPanel ui = new JPanel(new GridLayout(5, 3, 5, 5));
        b1 = new JButton("1");
        b1.addActionListener(this);
        ui.add(b1);
        b2 = new JButton("2");
        b2.addActionListener(this);
        ui.add(b2);
        b3 = new JButton("3");
        b3.addActionListener(this);
        ui.add(b3);
        b4 = new JButton("4");
        b4.addActionListener(this);
        ui.add(b4);
        b5 = new JButton("5");
        b5.addActionListener(this);
        ui.add(b5);
        b6 = new JButton("6");
        b6.addActionListener(this);
        ui.add(b6);
        b7 = new JButton("7");
        b7.addActionListener(this);
        ui.add(b7);
        b8 = new JButton("8");
        b8.addActionListener(this);
        ui.add(b8);
        b9 = new JButton("9");
        b9.addActionListener(this);
        ui.add(b9);
        b10 = new JButton("0");
        b10.addActionListener(this);
        ui.add(b10);
        b11 = new JButton("+");
        b11.addActionListener(this);
        ui.add(b11);
        b12 = new JButton("-");
        b12.addActionListener(this);
        ui.add(b12);
        b13 = new JButton("*");
        b13.addActionListener(this);
        ui.add(b13);
        b14 = new JButton("/");
        b14.addActionListener(this);
        ui.add(b14);
        b15 = new JButton("clear");
        b15.addActionListener(this);
        b16 = new JButton("=");
        b16.addActionListener(this);
        ui.add(b16);
        ui.add(b15);
        p.add(ui, BorderLayout.CENTER);
        add(p);
        setVisible(true);
    }

    public static void main(String[] args) {
        new cal();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String a = e.getActionCommand();
        switch (a) {
            case "1": {
                v = v + "1";
                t1.setText(v);
            }
                break;

            case "2": {
                v = v + "2";
                t1.setText(v);
            }
                break;

            case "3": {
                v = v + "3";
                t1.setText(v);
            }
                break;

            case "4": {
                v = v + "4";
                t1.setText(v);
            }
                break;

            case "5": {
                v = v + "5";
                t1.setText(v);
            }
                break;

            case "6": {
                v = v + "6";
                t1.setText(v);
            }
                break;

            case "7": {
                v = v + "7";
                t1.setText(v);
            }
                break;

            case "8": {
                v = v + "8";
                t1.setText(v);
            }
                break;

            case "9": {
                v = v + "9";
                t1.setText(v);
            }
                break;

            case "0": {
                v = v + "0";
                t1.setText(v);
            }
                break;

            case "+": {
                op = "+";
                v1 = t1.getText();
                v = "";
            }
                break;

            case "-": {
                op = "-";
                v1 = t1.getText();
                v = "";
            }
                break;

            case "*": {
                op = "*";
                v1 = t1.getText();
                v = "";
            }
                break;

            case "/": {
                op = "/";
                v1 = t1.getText();
                v = "";
            }
                break;
            case "clear": {
                op = "";
                v = "";
                t1.setText(v);
            }
            case "=": {
                try {
                    switch (op) {
                        case "+": {
                            v = t1.getText();
                            if (v == "") {
                                v = "0";
                            }
                            long i = Long.parseLong(v1) + Long.parseLong(v);
                            t1.setText(String.valueOf(i));
                            v = "";
                        }
                            break;
                        case "-": {
                            v = t1.getText();
                            if (v == "") {
                                v = "0";
                            }
                            long i = Long.parseLong(v1) - Long.parseLong(v);
                            t1.setText(String.valueOf(i));
                            v = "";
                        }
                            break;

                        case "*": {
                            v = t1.getText();
                            if (v == "") {
                                v = "0";
                            }
                            long i = Long.parseLong(v1) * Long.parseLong(v);
                            t1.setText(String.valueOf(i));
                            v = "";
                        }
                            break;

                        case "/": {
                            v = t1.getText();
                            if (v == "") {
                                v = "0";
                            }
                            if (v == "0") {
                                throw new ArithmeticException("divide by zero");
                            }
                            long i = Long.parseLong(v1) / Long.parseLong(v);
                            t1.setText(String.valueOf(i));
                            v = "";
                        }
                            break;
                    }
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                } catch (NumberFormatException m) {
                    JOptionPane.showMessageDialog(this, m.getMessage());
                }
            }
        }

    }
}
