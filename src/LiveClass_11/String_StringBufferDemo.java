package LiveClass_11;

public class String_StringBufferDemo
{
    public static void main(String[] args)
    {
        String s1="Hello";
        s1.concat("World");
        System.out.println(s1);
        String s2=s1.concat("World");
        System.out.println(s2);
        System.out.println(s1==s2);

        StringBuffer sb=new StringBuffer("SAKSHI");
        sb.append("KUMARI");
        System.out.println(sb);
    }
}
