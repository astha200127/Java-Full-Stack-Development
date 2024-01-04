package OOPS_CONCEPTS.LiveClass_13;

class jungle
{
    void makenoise()
    {
        System.out.println("jungle sound");
    }
}
class cat extends jungle
{
    void makenoise()
    {
        System.out.println("meow meow");
    }
}
public class Overriding
{
    public static void main(String[] args)
    {
        cat c=new cat();
        System.out.print("The child object: ");
        c.makenoise();
        jungle j=new jungle();
        System.out.print("The parent object: ");
        j.makenoise();

        jungle parent=new cat();
        /*
        new cat() is the object and here parent is called using object of child which is cat
        then it will be called as Runtime Polymorphism.
         */
        parent.makenoise();

    }
}
