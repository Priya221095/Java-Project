package Day18;

public class InterfaceCalling
{
    public static void main(String[] args){
        VehicleInterface car = new Car();
        VehicleInterface bike = new Bike();
        System.out.println("Car tires: " + car.tires());
        car.start();
        car.stop();
        System.out.println("Bike tires: " + bike.tires());
        bike.start();
        bike.stop();
    }
}
