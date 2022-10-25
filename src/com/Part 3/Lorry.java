package lesson3;

public class Lorry extends Car {
    private double tonnage;

    public Lorry(String model, String carClass, double weight, Engine engine, double tonnage) {
        super(model, carClass, weight, engine);
        this.tonnage = tonnage;
    }

    public void start() {
        System.out.println("Lorry start!");
    }

    public void stop() {
        System.out.println("Lorry stop!");
    }

    public void showInfo() {
        System.out.println("Model: " + this.getModel() + "; Car class: " + this.getCarClass() + "; Weight: " + this.getWeight() + "; Power: " + this.getEngine().getPower() + "; Manufacturer: " + this.getEngine().getManufacturer() + "; Tonnage: " + this.tonnage);
    }
}