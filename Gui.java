import java.awt.FlowLayout;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Handler;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
class Gui extends JFrame{

    private JButton reg; //reg stands for regular class
    private JButton custom;

public  Gui() {
    super("THE TITLE");
    setLayout(new FlowLayout());

    reg= new JButton("reg Button");
    add(reg);

    Icon b = new ImageIcon(getClass().getResource("b.png"));
        Icon x = new ImageIcon(getClass().getResource("x.png"));
        custom = new JButton("custom", b);
        custom.setRolloverIcon(x);
        add(custom);;

    HandlerClass handler = new HandlerClass();
    reg.addActionListener(handler);
    custom.addActionListener(handler);
}
private class HandlerClass implements ActionListener{
    public void actionPerformed(ActionEvent event){
        JOptionPane.showMessageDialog(null,String.format("%s",event.getActionCommand()));
    }
 }
}
