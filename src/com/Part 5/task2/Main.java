package lesson5.task2;

public class Main {
    public static void main(String[] args) {

        Array<String> list = new Array<>();
        list.add("a","b","c","d","i","f","j","k","l");
        list.print();
        list.remove(1);
        list.print();
        list.remove("1");
        list.remove("2");
        list.remove("3");
        list.remove("4");
        list.print();
        System.out.println(list.get(1));
        list.clear();
        list.add("H", "e","l","l","o","!");
        list.print();
    }

}