package lesson3;

public abstract class Car {
    private String model;
    private String carClass;
    private double weight;
    Engine engine;

    public Car(String model, String carClass, double weight, Engine engine) {
        this.model = model;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarClass() {
        return this.carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract void start();

    public abstract void stop();

    public void turnLeft() {
        System.out.println("Turn left!");
    }

    public void turnRight() {
        System.out.println("Turn right!");
    }

    public abstract void showInfo();
}