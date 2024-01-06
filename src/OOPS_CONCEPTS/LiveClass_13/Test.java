package OOPS_CONCEPTS.LiveClass_13;

class Shape
{
    void draw()
    {
        System.out.println("drawing shape");
    }
}
class Circle extends Shape {
    void draw()
    {
       // super.draw();  //super. ka matlab hai parent class ka method call karwa do
                      // this. la matlab hai current class ka matlab call karwa do
        System.out.println("Drawing circle");
    }
}
class Rectangle extends Shape{
    void draw()
    {
    System.out.println("Drawing Rectangle");
    }
}
public class Test
{
    public static void main(String[] args)
    {
        Shape shape=new Shape();
        shape.draw();
        Circle circle=new Circle();
        circle.draw();
        Rectangle rectangle=new Rectangle();
        rectangle.draw();

        Shape shape1=new Circle();
        Shape shape2=new Rectangle();
        shape1.draw();
        shape2.draw();
    }
}

