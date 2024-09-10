import javax.swing.JOptionPane;
public class Swing {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
       // System.out.println("Hello, " + name); 
        String outputString = "Hello,"+ name;
        JOptionPane.showMessageDialog(null,outputString);
    }
}
