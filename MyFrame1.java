import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame1 extends JFrame implements ActionListener {
     MyFrame1() {
        setSize(480, 320);
        setTitle("Options");
        getContentPane().setLayout(new FlowLayout());
        JTextField myTextfield =  new JTextField(30);
        getContentPane().add(myTextfield);
        JButton btn1 = new JButton("Perimeter");
        JButton btn2 = new JButton("Robbery");
        JButton btn4 = new JButton("Fire Company");
        JButton btn5 = new JButton("Snow Emergency");
        FlowLayout flLeft = new FlowLayout(FlowLayout.CENTER);
        JPanel pnl = new JPanel(flLeft);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);

        pnl.add(btn1);
        pnl.add(btn2);
        pnl.add(btn4);
        pnl.add(btn5);


        setContentPane(pnl);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Perimeter")) {
            System.out.println("Perimeter");
            Frame frame = new MyFrame4();
        }
        else if(e.getActionCommand().equals("Robbery")) {
            System.out.println("Robbery");
        }
        else if(e.getActionCommand().equals("Fire Company")){
            System.out.println("Fire Company");
        }
        else if(e.getActionCommand().equals("Snow Emergency")){
            System.out.println("Snow Emergency");

        }
    }

    public static void main(String[] args) {

        new MyFrame1();
    }
}
