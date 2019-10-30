import java.util.Scanner;

public class ShowUserName {

    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.print(" please enter your name ");

    String name = scan.nextLine();

    System.out.println("hello," + name);


    }
}

// 1.import
// 2.scanner
// 3. message to user
// 4.scan input
// 5. print to user