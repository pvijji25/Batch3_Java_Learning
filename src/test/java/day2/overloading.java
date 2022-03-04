package day2;

public class overloading {

    //constructor overloading
    //Zero constructor

    overloading(){


        System.out.println("Zero constructor");
    }

       //one parameter constructor
      overloading(int a)
      {
        System.out.println(a);
      }
       overloading(String b){

           System.out.println(b);

       }
    //two parameter constructor
    overloading(int a,int b){

        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        overloading obj=new overloading();
        overloading obj1=new overloading(10 );
        overloading obj2=new overloading(20,30 );
    }

}
