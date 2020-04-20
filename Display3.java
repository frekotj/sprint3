import java.awt.*;
import javax.swing.*;

public class Display3 extends JFrame {

    int WIDTH = 1320;
    int HEIGHT = 1320;
    int X_POS = (WIDTH / 2) -   100;
    int Y_POS = (HEIGHT / 2) - 200;

    public Display3(){
        super("Rectangle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH,HEIGHT);
        setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawRect(X_POS, Y_POS, 250, 250);
        g.setColor(Color.BLUE);
    }

    public static void main(String[] args){
        Display3 display = new Display3();
    }
}