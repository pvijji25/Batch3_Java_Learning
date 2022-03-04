package day5;

public class Loops {
    public static void main(String[] args) {

        //For Loop - want to print 1-10 numbers
         // syntax for For loop
        // For (initialization ;condition checking; incrementing)

          for(int i = 1;i<=10; i++)
           {
               if(i==5)
               {continue;

               }

               System.out.println(i);
           }


           int i =1;
          /*while (i<=10){

               System.out.print(i);
               i++;
           }*/


        do {
            System.out.print(i);
            i++;
        }  while (i<=10);
    }
}
