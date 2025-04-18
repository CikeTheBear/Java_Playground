public class Vehicle {

    String make;
    String model;
    String color;
    int speed;



    public Vehicle(String make, String model, String color){

        this.make = make;
        this.model = model;
        this.color = color;
        this.speed = 0;
        System.out.println("Vehicle created!");


    }


    public void accelerate() {

        this.speed += 5;
        System.out.println("The car is accelerating!");
        
    }

    public void brake() {

        this.speed -= 5;
        System.out.println("The car is braking!");
        
    }


    public void turn(String direction) {

        System.out.println("Turning " + direction + "!");
        
    }

    public int getSpeed() {

        return speed;

    }
}
