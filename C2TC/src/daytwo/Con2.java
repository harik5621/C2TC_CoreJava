package daytwo;
import java.util.Scanner;

public class Con2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(age>18) {
			System.out.println("You eligible for voting");
		}
		else {
			System.out.println("You not eligible for voting");
		}
		
	}

}
