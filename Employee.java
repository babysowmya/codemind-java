import javax.swing.JOptionPane;
class Employe{
    int id,salary;
    String name;
    Employe(){ // constructor
        name = JOptionPane.showInputDialog("Enter your name: ");
        id = Integer.parseInt(JOptionPane.showInputDialog("Enter your id:"));
        salary = Integer.parseInt(JOptionPane.showInputDialog("Enter your salary:"));
    }
    void showDetails(){ //instance method
        String outputString = "ID: " + id +"\nName:" + name +"\nSalary:" +salary;
        JOptionPane.showMessageDialog(null,outputString);
    }
}
public class Employee {
    public static void main(String[] args) {
        Employe e1 = new Employe();
        e1.showDetails();
        Employe e2 = new Employe();
        e2.showDetails();
    }

}