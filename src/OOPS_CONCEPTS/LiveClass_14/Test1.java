package OOPS_CONCEPTS.LiveClass_14;

class animal
{
    String name;
}
class Dog extends animal
{
 String name;
 void print()
 {
     super.name="Animal";
     name="Jypsy";
     System.out.println("The dog in the parent is :"+super.name);
     System.out.println("The child city is: "+this.name);
 }
}
public class Test1
{
    public static void main(String[] args)
    {
     Dog d=new Dog();
     d.print();
    }
}
