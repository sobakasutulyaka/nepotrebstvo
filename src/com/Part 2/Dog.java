package lesson2;


public class Dog extends Animal {
    public Dog(String food, String location, String property) {
        super(food, location, property);
    }

    public void makeNoise() {
        System.out.println("The dog is Woof!");
    }

    public void eat() {
        System.out.println("The dog is Eating");
    }

    public void sleep() {
        System.out.println("The dog is sleeping");
    }
}