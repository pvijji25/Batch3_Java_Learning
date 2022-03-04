package day2;

public class Method_OverLoading{


    public static int add  (int a,int b){
        return a+b;

     }
      public static int add (int a, int b, int c){
        return a+b+c;

      }
      public static String add (String a, String b){
        return a+b;

      }
       public static double add (double a ,double b){
        return a+b;
       }



    public static void main(String[] args) {
        System.out.println(add(20,30));
        System.out.println(add(20,30,40));
        System.out.println(add("vijaya","laxmi"));
        System.out.println(add(20.5,30.6));
    }

}


