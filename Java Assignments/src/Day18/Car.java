package Day18;

public class Car implements VehicleInterface
{
  public int tires(){
      return 4;
  }
  @Override
    public void start() {
        System.out.println("Car starts with key");
    }
    @Override
    public void stop() {
        System.out.println("Car stops with brakes");
    }
}
