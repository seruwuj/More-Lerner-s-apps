import javax.swing.JFrame;

public class EventHandler {
    public static void main(String[] args) {
        TunaEventHandler tunaEventHandler = new TunaEventHandler();
        tunaEventHandler.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tunaEventHandler.setSize(350,100);
        tunaEventHandler.setVisible(true);
    }  
}
