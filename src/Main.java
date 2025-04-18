

public class Main {
    public static void main(String[] args) {
        
        Car colorado = new Car();
        colorado.make = "Chevrolet";
        colorado.model = "Colorado";
        colorado.color = "Red";

        colorado.accelerate();

        
        Car mustang = new Car("Ford", "Mustang", "Red");


        mustang.turn();

        
        
        System.out.println(colorado);
        System.out.println(mustang);




    }
}
