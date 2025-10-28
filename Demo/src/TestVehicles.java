 class Vehicles {
    String vehicle_name= "Car"; // Global variable

    void vehicleDetails(){ // using camelCase for method naming
        int model= 402;         // local variable
        double mileage= 25.2;

        System.out.println("Vehicle_name: "+vehicle_name);
        System.out.println("Model: "+model);
        System.out.println("Mileage: "+mileage);
    }
}
public class TestVehicles{ // using PascalCase for class naming
    public static void main(String[]args){
        Vehicles obj = new Vehicles(); // creating object
        obj.vehicleDetails();      // calling method
    }
}