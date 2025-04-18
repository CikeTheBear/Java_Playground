

public class Main {
    public static void main(String[] args) {
        

    SportsCar ferrari = new SportsCar("Ferrari", "F8 Tributo", "Red");

    ferrari.activateTurboBoost();

    System.out.println(ferrari.model + " is running at " + ferrari.getSpeed() + " mph");
    }
}
