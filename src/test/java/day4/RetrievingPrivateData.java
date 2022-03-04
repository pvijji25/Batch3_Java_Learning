package day4;

public class RetrievingPrivateData
{
    public static void main(String[] args)
    {
     Encapsulation obj =new Encapsulation();
        System.out.println(obj.getA());

        System.out.println(obj.getB());

        obj.setA(20);
        obj.setB("java");

        System.out.println(obj.getA());
        System.out.println(obj.getB());

    }
}
    // when i was running the application it will print out  10 and java
    // this will be  coming from getters