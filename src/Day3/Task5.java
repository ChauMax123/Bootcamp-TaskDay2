package Day3;

class Vehicle {
    String changingGear(){
        return "changing gear.....";
    }
    String steeringInfo(){
        return "sexy steering";
    }
    String gearType1="This car is Automatic :D";
    String gearType2="Have to push the gear Manually :((";

}
class Car extends Vehicle{
    String speed(){
        return " Day3.Car is speeding....... be careful";
    }


}
class Ferrari extends Car{
    String carInfo(){
        return "Come to Latvia and Drive Day3.Ferrari with open roof..";
    }
    String name= "Day3.Ferrari";

}
public class Task5 {
    public static void main (String args[]){
        Ferrari frr =new Ferrari();
        System.out.println(frr.name + " has " + frr.steeringInfo() +" and "+ frr.gearType1 + frr.speed());
        System.out.println("P.S. " +frr.carInfo() );


    }
}
