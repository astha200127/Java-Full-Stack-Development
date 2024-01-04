package OOPS_CONCEPTS.LiveClass_12;

public class StaticVariableDemo
{
    static int a=10;

    public static void main(String[] args)
    {
        System.out.println(a);
        System.out.println(StaticVariableDemo.a);
        StaticVariableDemo obj=new StaticVariableDemo();
        System.out.println(obj.a);
        obj.a=100;
        System.out.println(obj.a);
        StaticVariableDemo obj1=new StaticVariableDemo();
        obj1.a=333;
        System.out.println(obj1.a);
        System.out.println(obj.a);

    }

}
class B{
    public void demo(){
       // System.out.println(a);
        System.out.println(StaticVariableDemo.a);

    }
}