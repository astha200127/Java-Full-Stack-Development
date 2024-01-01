package LiveClass_10;

public class STP
{
    public static void main(String[] args)
    {
        String s1="Ashwani";
        System.out.println(s1);
        String s2="Upadhyay";
        System.out.println(s2);
        System.out.println(s1==s2);
        String s3="Ashwani";
        System.out.println(s3);
        System.out.println(s1==s3);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
