import javax.swing.JFrame;

public class GuiHandlingEvent {
    public static void main(String[] args) {
        
        Gui go =new Gui();
        go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        go.setSize(300,200);
        go.setVisible(true);
    }
    
}
