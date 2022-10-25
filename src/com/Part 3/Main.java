package lesson3;

public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine(140, "Opel");
        Engine engine2 = new Engine(125, "Ford");

        Car[] cars = new Car[2];

        cars[0] = new Lorry("lorry", "N1", 3.5, engine1, 1.5);
        cars[1] = new SportCar("sportCar", "F", 2, engine2, 250);

        for (Car car : cars) {
            car.showInfo();
            car.start();
            car.turnLeft();
            car.turnRight();
            car.stop();
        }
    }
}
