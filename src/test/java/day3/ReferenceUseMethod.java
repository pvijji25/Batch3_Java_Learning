package day3;

public class ReferenceUseMethod
{
    // i am going to give non return type method
         public  void method1(){

             System.out.println(" no parameter method");

         }

    public  void method1(int a)
    {
        this.method1();
        System.out.println(a);


    }

    public static void main(String[] args)
    {
        ReferenceUseMethod obj=new ReferenceUseMethod();
          obj.method1(10);

    }



}
