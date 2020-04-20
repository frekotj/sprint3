import java.awt.*;
import javax.swing.*;

public class Display5 extends JFrame {

    int WIDTH = 1320;
    int HEIGHT = 1320;
    int X_POS = (WIDTH / 2) - 350;
    int Y_POS = (HEIGHT / 2) - 500;

    public Display5(){
        super("Rectangle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH,HEIGHT);
        setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawRect(X_POS, Y_POS, 750, 750);
        g.setColor(Color.BLUE);
    }

    public static void main(String[] args){
        Display5 display = new Display5();
    }
}