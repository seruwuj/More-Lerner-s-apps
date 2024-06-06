import javax.swing.JOptionPane;


public class Interface {

    public static void main(String[] args) {

        String fn = JOptionPane.showInputDialog("Enter first number");
        String sn = JOptionPane.showInputDialog("Enter second");

        //Channges numbers to integers
        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);
        int sum = num1+num2;

        JOptionPane.showMessageDialog(null,"The answer is "+ sum,"THE TITLE",JOptionPane.PLAIN_MESSAGE);
    }
}