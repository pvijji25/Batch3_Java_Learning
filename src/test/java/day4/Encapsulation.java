package day4;

public class Encapsulation
{
    //creating some variables
    // everything in private

     private int a=10;
    private String b="java";


    // private is access modifier
    //int data type
    // a is variable
    //10 assian value

    // I am going use read only
    // I am  going to use to getter

    // here we are  using getter and setter

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getB() {
        return b;



    }
}
