package lesson3;

public class SportCar extends Car {

    private double speedLimit;

    public SportCar(String model, String carClass, double weight, Engine engine, int speedLimit) {
        super(model, carClass, weight, engine);
        this.speedLimit = speedLimit;
    }

    public void start() {
        System.out.println("SportCar start!");
    }

    public void stop() {
        System.out.println("SportCar stop!");
    }

    public void showInfo() {
        System.out.println("Model: " + this.getModel() + "; Car class: " + this.getCarClass() + "; Weight: " + this.getWeight() + "; Power: " + this.getEngine().getPower() + "; Manufacturer: " + this.getEngine().getManufacturer() + "; Speed limit: " + this.speedLimit);
    }
}