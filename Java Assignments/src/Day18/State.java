package Day18;

public class State extends Country
{
    String name = "Maharshtra";
    int area = 300;
    int rank = 3;

    State()
    {
        // Accessing parent Constructor using super keyword
        super();
        System.out.println("State constructor called");
    }
     void stateDetails(){
         System.out.println("Name of the state: " + name);
         // Accessing parent Variable using super keyword
         System.out.println("Name of the country: " + super.name);
         System.out.println("Area of the state: " + area + " sq km");
         System.out.println("Rank of the state: " + rank + "rd");
     }
     void show(){
        super.display();   // Calling of parent Method using super keyword
     }
}

