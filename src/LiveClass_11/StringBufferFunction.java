package LiveClass_11;

public class StringBufferFunction
{
    public static void main(String[] args)
    {
        StringBuffer sb= new StringBuffer("Amisha");
        //append()
        sb.append("Jain");
        System.out.println(sb);

        //insert()
        sb.insert(2, 123);
        System.out.println(sb);

        //reverse()
        sb.reverse();
        System.out.println(sb);

        //replace()
        sb.replace(6, 11, "hello");
        System.out.println(sb);

        StringBuffer sb1=new StringBuffer();
        System.out.println(sb1.capacity());
    }
}
