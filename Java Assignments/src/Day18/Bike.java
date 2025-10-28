package Day18;

public class Bike implements VehicleInterface
{
    public int tires(){
        return 2;
    }
    @Override
    public void start() {
        System.out.println("Bike starts with kick");
    }
    @Override
    public void stop() {
        System.out.println("Car stops with hand brakes");
    }
}
