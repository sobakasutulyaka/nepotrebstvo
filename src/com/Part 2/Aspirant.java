package lesson2;

public class Aspirant extends Student{
    String study;

    Aspirant(String firstName, String lastName, String group, double averageMark, String study) {
        super(firstName, lastName, group, averageMark);
        this.study = study;
    }

    @Override
    public int getScholarship() {
        if (averageMark == mark) return 200;
        else return 180;
    }
}