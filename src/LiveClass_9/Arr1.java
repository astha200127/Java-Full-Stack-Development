package LiveClass_9;

public class Arr1
{
    public static void main(String[] args)
    {
        int sum=0;
        int arr[]={10,20,30,40,50};
        int k=30;
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
//            sum=sum+arr[i];
//            System.out.println(sum);
            if(arr[i]==k)
            {
                flag=true;
            }
            System.out.println(flag);
        }
//        System.out.println(sum);
    }
}
