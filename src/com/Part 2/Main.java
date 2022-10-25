package lesson2;

public class Main {
   
    public static void main(String[] args) {
        Phone phone1 = new Phone("+79009006464", "A", 205);
        Phone phone2 = new Phone("+78008847585", "B");
        Phone phone3 = new Phone();

        phone1.showInfo();
        phone2.showInfo();
        phone3.showInfo();

        phone1.receiveCall("Vladimir");
        phone1.receiveCall("Yrii", "+78547859852");
        phone1.sendMessage("+72547458598", "+79578459575", "+79527539854");
    }
}
