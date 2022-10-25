package lesson2;

public class Phone {
    private String number;
    private String model;
    private double weight;

    Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone() {}


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("Call from " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Звонок " + name + ". Номер: " + number);
    }

    void sendMessage(String... numbers) {
        System.out.print("Сообщение отправлено: ");
        for (String number : numbers) {
            System.out.print(number + "; ");
        }
    }

    void showInfo() {
        System.out.println("Номер: " + this.getNumber() + " Модель: " + this.getModel() + " Weight: " + this.getWeight());
    }
}
