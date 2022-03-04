package day6;

public class TestAbstraction
{

    public static void main(String[] args)
    {
       Shape shape =new Square();
       shape.drawing();

       Shape shape1 =new Rectangle();
       shape1.drawing();

       Shape shape2 =new Circle();
       shape2.drawing();
    }
}
