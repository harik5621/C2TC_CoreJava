package daytwo;
import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1:");
        int n1 = sc.nextInt();
        System.out.println("Enter number2:");
        int n2 = sc.nextInt();
        System.out.println("Enter the operation to be done (+|-|*|/):");
        char op = sc.next().charAt(0); // Read the first character from user input

        switch (op) {
            case '+':
                ans = n1 + n2;
                break;
            case '-':
                ans = n1 - n2;
                break;
            case '*':
                ans = n1 * n2;
                break;
            case '/':
                ans = n1 / n2;
                break;
            default:
                ans = 0;
                break;
        }

        System.out.println("Answer: " + ans);
    }

}
