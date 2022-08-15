import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class mouse extends MouseAdapter {
    JFrame f;
    JLabel l;

    mouse() {
        f = new JFrame();
        f.setSize(400, 200);
        f.setTitle("mouse events");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l = new JLabel();
        l.setFont(new Font("arial", Font.BOLD, 22));
        l.setForeground(Color.BLUE);
        f.setLayout(null);
        f.add(l);
        l.setBounds(100, 65, 200, 100);
        f.addMouseListener(this);
        f.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("mouse clicked");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("mouse Exited");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("mouse Released");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("mouse Pressed");
    }

    public void mouseMoved(MouseEvent e) {
        l.setText("mouse Moved");
    }

    public void mouseDragged(MouseEvent e) {
        l.setText("mouse Dragged");
    }

    public static void main(String[] args) {
        new mouse();
    }

}