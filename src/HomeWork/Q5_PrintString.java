package HomeWork;

import java.util.Scanner;
public class Q5_PrintString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number between 1 to 10");
        int num=sc.nextInt();
        String num1;
        switch(num)
        {
            case 1:
                num1="One";
                break;
            case 2:
                num1="Two";
                break;
            case 3:
                num1="Three";
                break;
            case 4:
                num1="Four";
                break;
            case 5:
                num1="Five";
                break;
            case 6:
                num1="Six";
                break;
            case 7:
                num1="Seven";
                break;
            case 8:
                num1="Eight";
                break;
            case 9:
                num1="Nine";
                break;
            case 10:
                num1="Ten";
                break;
            default:
                num1="Invalid";
        }
        System.out.println(num1);
    }
}
