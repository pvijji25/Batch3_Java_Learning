package day2;

public class Day2_Method_Overloading {
    public void sum(int a, int b) {

        System.out.println(a + b);
    }

    public void sum(int a, int b, int c) {
        System.out.println(a + b + c);

    }

    public void sum(String a, String b) {

        System.out.println(a + b);


    }

    public void sum(double a, double b) {

        System.out.println(a + b);
    }


    public static void main(String[] args) {


        Day2_Method_Overloading Method = new Day2_Method_Overloading();

        Method.sum(3, 4);
        Method.sum(5, 6, 7);
        Method.sum("vijaya ", " laxmi");
        Method.sum(30.5, 40.6);

    }
}








