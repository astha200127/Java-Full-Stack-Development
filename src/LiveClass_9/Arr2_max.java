package LiveClass_9;

public class Arr2_max
{
    public static void main(String[] args)
    {
       int arr[]={10,88,23,45,99};
       int max=arr[0];
       for(int i=1; i<arr.length; i++)
       {
           max=arr[i];
       }
        System.out.println(max);
    }
}
