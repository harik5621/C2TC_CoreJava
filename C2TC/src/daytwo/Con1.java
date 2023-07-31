package daytwo;
import java.util.Scanner;

public class Con1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks sub1:");
		int mark1=sc.nextInt();
		System.out.println("Enter your marks sub2:");
		int mark2=sc.nextInt();
		System.out.println("Enter your marks sub3:");
		int mark3=sc.nextInt();
		System.out.println("Enter your marks sub4:");
		int mark4=sc.nextInt();
		System.out.println("Enter your marks sub5:");
		int mark5=sc.nextInt();
		int avg=(mark1+mark2+mark3+mark4+mark5)/5;
		if(avg>90) {
			System.out.println("O");
		}
		else if(avg>80 && avg<90) {
			System.out.println("A+");
			
		}
		else if(avg>70 && avg<80) {
			System.out.println("A");
			
		}
		else if(avg>60 && avg<70) {
			System.out.println("B+");
			
		}
		else if(avg>50 && avg<60) {
			System.out.println("B");
			
		}
		
	}

}
