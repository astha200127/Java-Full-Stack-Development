                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               package Live_Class_6;
import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int n=sc.nextInt();
		if(n>50) {
			System.out.println("Given number is greater than 50");
			if(50%2==0) 
			{
				System.out.println("Number is divided by 2");
			}
			else 
			{
				System.out.println("Number is not divided by 2");
			}
		}
		else {
			System.out.println("Number is less than 50");
		}
	}

}
