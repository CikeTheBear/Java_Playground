public class SportsCar extends Car {
    
    int turboBoost = 0;


    public SportsCar(String make, String model, String color){
        super(make, model, color);
        turboBoost = 0;
        System.out.println("SportsCar created!");
    }



    public void activateTurboBoost(){
        super.accelerate();
        this.turboBoost += 50;
        super.speed += turboBoost;
        System.out.println("Turbo Boost activated!");
    }

}
