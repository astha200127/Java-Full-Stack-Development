package Live_Class_5;
import java.util.Scanner;
public class NamePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name:");
		String fName=sc.next();
		System.out.println("Enter the last name:");
		String lName=sc.next();
		String name=fName+" "+lName;
		System.out.println(name);
	}

}
