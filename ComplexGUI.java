import javax.swing.JFrame;

public class ComplexGUI {
    public static void main(String[] args) {
        TunaComplexInterface tunaComplexInterface= new TunaComplexInterface();
        tunaComplexInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tunaComplexInterface.setSize(275,180);
        tunaComplexInterface.setVisible(true);
    }
}
