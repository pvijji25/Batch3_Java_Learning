package day8;

import multiplein.Car;


@FunctionalInterface

interface Addition
{
    public int add (int a,int b); // this is abstract method

}
@FunctionalInterface

interface  concatenation {

    public String concat(String a, String b);
}


public class JavaEightConcepts
{

    public static void main(String[] args)
    {
         // I am defining abstract method   // a,b variables

       /* Addition obj = (a,b) -> a+b;   //lambda expression java 8 saying even its single statement no need to return
                    //this is single statement                                                   //    key word

        System.out.println(obj.add(6,7));*/

        // if i have a multiple statements if you have {} bracess

           Addition obj = (a, b) ->
           {

               System.out.println("First number: "+a);   //(+) concatenation of two strings
               System.out.println("second number: "+b);

                 // use to return key because in multiple statements lambda expression  use return statement


               return a+b;
           };
        System.out.println("sum of two numbers :" +obj.add(6,7));

    }
}

