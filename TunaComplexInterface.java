import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TunaComplexInterface extends JFrame{

    private JLabel item1;
    //Consructor
    public TunaComplexInterface(){
        super("THE TITLE BAR");
        setLayout(new FlowLayout());

        item1 = new JLabel("This is a simple GUI in java");
        item1.setToolTipText("This is gonna make me an Engineer someday");
        //The above is the text that comes when you place a cursor on the icon
        add(item1);//adding the item to the window
    }
    
}
