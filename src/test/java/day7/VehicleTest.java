package day7;

public class VehicleTest
{
    public static void main(String[] args)
    {
         Vehicle obj=new BMW();
         String nameBMW =obj.VehicleName();
        System.out.println(nameBMW);
        System.out.println(obj.Registration());



        Vehicle obj1=new Tesla();
        String nameTesla =obj1.VehicleName();
        System.out.println(nameTesla);
        System.out.println(obj1.Registration());



        Vehicle obj2 =new Audi();
        String nameAudi = obj2.VehicleName();
        System.out.println(nameAudi);
        System.out.println(obj2.Registration());


    }

}
