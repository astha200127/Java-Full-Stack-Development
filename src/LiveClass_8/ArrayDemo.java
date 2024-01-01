package LiveClass_8;
public class ArrayDemo
{
    public static void main(String[] args)
    {
        int arr[]=new int[10];
        for(int i=1; i<10; i++)
        {
            //Setting value through loop
            arr[i]=i;
            System.out.println(arr[i]);
        }
        System.out.println("===========================");

        for(int a:arr)
        {
            //accessing each element using for each
            System.out.println(a);
        }
        System.out.println("Length of array:"+arr.length);
    }
}