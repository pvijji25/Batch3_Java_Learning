package day1;

public class  variable
{
    //Instance variable
      int var1 =5;
      String var2 ="Hello";
      boolean var3=true ;

      static int var4 =6;

      public void method1 () {
          int a = 1;
          String b = "hi";

          System.out.println(a);
          System.out.println(b);

      }

       public static void main (String[] args)
       {
          //creating the object
           variable obj =new variable() ;
           System.out.println(obj.var1);
           System.out.println(obj.var2);
           System.out.println(obj.var3);

           System.out.println(obj.var4);

           obj.method1();

   }



}
