package HomeWork;

public class Q2_PrimeOrComposite
{
    public static void main(String[] args)
    {
        int num=5, temp=0;
        for(int i=2; i<num-1; i++)
        {
            if(num%i==0) {
                temp = temp + 1;
            }
        }
        if(temp>0)
        {
            System.out.println("The number is composite");
        }
        else
        {
            System.out.println("The number is prime");
        }
    }
}
