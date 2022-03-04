package day3;

public class ReturningValues {
     int a=10;
     int b=30;

    //I am create method

    public void notReturning() {
        System.out.println("not Returning");

    }

    // ia m going to create a method int
    public String concat(String a, String b)
    {
        return a+b;
    }
    public int GivingBack(int a)
     //giving back is method return is keyword

    {

        return a;

    }
      public int GivingBack ()
      {

        return this.a+this.b;
      }
    public static void main(String[] args)
    {
        ReturningValues obj =new ReturningValues();
        // I am creating variable
            String c=obj.concat("vijaya","laxmi");

        System.out.println(obj.GivingBack(200));

        System.out.println(obj.GivingBack(10));
        System.out.println(c);
    }

}