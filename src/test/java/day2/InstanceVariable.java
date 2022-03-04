package day2;

public class InstanceVariable {


   // I am creating  Initialize variable ;
    // Iam creating constructor;


   // Initialize variable
    int a;
    String b;

     // creating parametrized constructor
      InstanceVariable(int a, String b) {
         this.a = a;
         this. b = b;
      }

      // creating zero or non parametrized constructor
          InstanceVariable(){
          System.out.println("Zero constructor");



          }

       public static void main (String[] args){

          InstanceVariable obj = new InstanceVariable();
          System.out.println(obj.a);
           System.out.println(obj.b);
    }




    }