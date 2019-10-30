import javax.swing.JOptionPane;
public class Percentage {

    public static void main(String[] args) {
        String NUMBERA = JOptionPane.showInputDialog("please enter ");
        String NUMBERB = JOptionPane.showInputDialog("please enter ");
        double A = Double.parseDouble(NUMBERA);
        double B = Double.parseDouble(NUMBERB);
        double X = B / A * 100;
        System.out.print("The solution to the equation is: ");
        System.out.print(X);
    }
}