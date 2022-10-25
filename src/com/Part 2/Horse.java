package lesson2;


public class Horse extends Animal {
    public Horse (String food, String location, String property) {
        super(food, location, property);
    }

    public void makeNoise() {
        System.out.println("The horse is Neighing");
    }

    public void eat() {
        System.out.println("The horse is Eating");
    }

    public void sleep() {
        System.out.println("The horse is sleeping");
    }
}