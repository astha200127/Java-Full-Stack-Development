package OOPS_CONCEPTS.LiveClass_14;

class A
{
    String city;
}
class B extends A
{
 String city;
 void print()
 {
     super.city="Agra";
     city="Delhi";
     System.out.println("The city in the parent is :"+super.city);
     System.out.println("The child city is: "+this.city);
 }
}
public class Test1
{
    public static void main(String[] args)
    {
     B b=new B();
     b.print();
    }
}
