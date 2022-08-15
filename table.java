import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class table extends JFrame {
    public table() {
        setSize(500, 500);
        setLayout(new GridLayout(0, 3));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            FileInputStream fs = new FileInputStream("text.txt");
            Scanner sc = new Scanner(fs).useDelimiter(",");
            String s;
            String[] arr;
            while (sc.hasNextLine()) {
                s = sc.nextLine();
                arr = s.split(",");
                for (String i : arr) {
                    add(new JLabel(i));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new table();
    }
}
