package day3;

public class ReferenceUse {

    //creating Zero constructor
    // i dont want pass any constructor
      ReferenceUse(){

          System.out.println("Zero constructor ");
      }
      // i am going to overload this constructor
      //one parameter constructor

      ReferenceUse(int a)
      {
          this();
          System.out.println(a);
      }
      //two  parameter constructor
        ReferenceUse(int a,int b ,int c){
          this();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }


    public static void main(String[] args) {
        ReferenceUse obj =new ReferenceUse(2,4,6);


    }

}
