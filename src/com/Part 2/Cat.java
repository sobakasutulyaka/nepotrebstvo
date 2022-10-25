package lesson2;


public class Cat extends Animal {
    public Cat (String food, String location, String property) {
        super(food, location, property);
    }

    public void makeNoise() {
        System.out.println("The cat is Meow!");
    }

    public void eat() {
        System.out.println("The cat is Eating");
    }

    public void sleep() {
        System.out.println("The cat is sleeping");
    }
}