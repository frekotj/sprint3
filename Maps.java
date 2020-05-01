import javax.swing.JEditorPane;
import javax.swing.JFrame;
public class Maps extends JFrame {
    public static void main(String args[]) {
        new Maps().start();
    }

    void start() {
        try {
            String html;
            html = ("https://www.mapquestapi.com/staticmap/v4/getmap?size=600,500&type=map&pois=blue-2,40.630375,-75.381636|blue-1,40.630851,-75.381618|blue-3,40.631596,-75.383281|blue-4,40.63025,-75.383388|blue-5,40.631602,-75.383281|blue-6,40.631628,-75.383279|blue-7,40.630898,-75.376722|blue-8,40.628832,-75.377598|blue-9,40.630261,-75.384302|blue-10,40.631596,-75.383281|blue-11,40.62958,-75.381674|blue-12,40.6312,-75.380431|blue-13,40.629918,-75.383306|blue-14,40.618818,-75.382051|blue-15,40.618821,-75.382151|blue-16,40.618764,-75.379927|blue-17,40.61882,-75.382101|blue-18,40.6176,-75.383617|blue-19,40.631308,-75.381597|blue-20,40.630261,-75.384302|blue-21,40.632813,-75.387412|blue-22,40.629172,-75.381687|&zoom=15&center=40.625190763565,-75.38204669952393&imagetype=JPEG&key=qg9Amh5PSlB1MvcBzb8l3NLGrtK15NF7");
            JEditorPane ed1 = new JEditorPane("Text/html", html);
            add(ed1);
            setVisible(true);
            setSize(600, 600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Some problem has occured" + e.getMessage());
        }
    }
}