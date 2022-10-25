package lesson2;


public abstract class Animal {
    public String food;
    public String location;
        public String property;
    public Animal (String food, String location, String property) {
        this.food = food;
        this.location = location;
        this.property = property;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public abstract void makeNoise();
    public abstract void eat();
    public abstract void sleep();

}