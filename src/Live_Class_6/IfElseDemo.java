package Live_Class_6;
import java.util.Scanner;
public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int n1=sc.nextInt();
		System.out.println("Enter the second number:");
		int n2=sc.nextInt();
		
		//Can we execute if block without else?
		//Yes, but if can execute if without else but else cannot be executed without else
		//if-else statement
		if(n1+n2==20) {
			System.out.println("Mai to jaa rha hu NH24 se");
		}
		else
		{
			System.out.println("Mai to jaa rha hu NH12 se");
		}
		
	}

}
