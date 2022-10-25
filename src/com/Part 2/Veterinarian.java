package lesson2;


public class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println("Animal: " + animal.getClass().getSimpleName() + "; Food: " + animal.getFood() + "; Location " + animal.getLocation());
    }
}
