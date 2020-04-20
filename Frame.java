import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame4 extends JFrame implements ActionListener{

    MyFrame4() {
        setSize(480, 320);
        setTitle("Perimeter");
        // first we create three buttons
        JButton btn1 = new JButton("50 Square Meters");
        JButton btn2 = new JButton("150 Square Meters");
        JButton btn3 = new JButton("250 Square Meters");
        JButton btn4 = new JButton("500 Square Meters");
        JButton btn5 = new JButton("750 Square Meters");
        // then we create a panel to hold the buttons
        JPanel pnl = new JPanel();
        BoxLayout layout = new BoxLayout(pnl, BoxLayout.Y_AXIS);
        pnl.setLayout(layout);
        // we add the three buttons to the panel
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);


        pnl.add(btn1);
        pnl.add(btn2);
        pnl.add(btn3);
        pnl.add(btn4);
        pnl.add(btn5);

        // finally we set the panel as the content pane of the frame
        setContentPane(pnl);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("50 Square Meters")) {
            System.out.println("50 Square Meters");
            Display display = new Display();
        }
        else if(e.getActionCommand().equals("150 Square Meters")){
            System.out.println("150 Square Meters");
            Display2 display = new Display2();
        }
        else if(e.getActionCommand().equals("250 Square Meters")){
            System.out.println("250 Square Meters");
            Display3 display = new Display3();
        }
        else if(e.getActionCommand().equals("500 Square Meters")){
            System.out.println("500 Square Meters");
            Display4 display = new Display4();
        }
        else if(e.getActionCommand().equals("750 Square Meters")){
            System.out.println("750 Square Meters");
            Display4 display = new Display4();
        }
    }




    public static void main(String[] args) {

        new MyFrame4();
    }


}