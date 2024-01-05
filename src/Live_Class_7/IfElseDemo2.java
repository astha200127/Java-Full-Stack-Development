package Live_Class_7;
import java.util.Scanner;
public class IfElseDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int x=sc.nextInt();
		if(x>10) 
		{
			System.out.println("Number is greater than 10");
		}
		else if(x<10)
		{
			System.out.println("Number is lesser than 10");
		}
		else 
		{
			System.out.println("Number is equal to 10");
		}
		System.out.println("Final Destination Reached");
	}

}
