package OOPS_CONCEPTS.LiveClass_14;
class Test
{
    Test()
    {
        super();
        System.out.println("Main test hu...");
    }
}
public class Demo extends Test
{
    int a;
    Demo()
    {
        this(10);
        System.out.println("Child...");
    }
    public Demo(int i)
    {
        super();
        System.out.println("Arg...");
    }

    public static void main(String[] args)
    {
        Demo demo=new Demo();
    }
}
