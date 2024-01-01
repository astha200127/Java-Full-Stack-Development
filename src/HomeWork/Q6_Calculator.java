package HomeWork;
import java.util.Scanner;
public class Q6_Calculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Enter the key to perform the operation:");
        System.out.println("case 1: +");
        System.out.println("case 2: -");
        System.out.println("case 3: *");
        System.out.println("case 4: /");
        System.out.println("default: 0");
        int key=sc.nextInt();
        int n;
        switch (key)
        {
            case 1:
                n=num1+num2;
                break;
            case 2:
                n=num1-num2;
                break;
            case 3:
                n=num1*num2;
                break;
            case 4:
                n=num1/num2;
                break;
            default:
                n=0;
        }
        System.out.println(n);



    }
}
