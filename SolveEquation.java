import javax.swing.JOptionPane;
public class SolveEquation {

    public static void main(String[] args) {
        String variablesA = JOptionPane.showInputDialog ("please enter variable A");
        String variablesB = JOptionPane.showInputDialog ("please enter variable");
        double A = Double.parseDouble(variablesA);
        double B = Double.parseDouble(variablesB);
        double X = -B/A;
        System.out.print("The solution to the equation is: ");
        System.out.print(X);

    }
}
