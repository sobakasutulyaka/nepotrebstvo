package lesson2;


public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;
    final static int mark = 5;

    Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public static int getMark() {
        return mark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGroup() {
        return group;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getScholarship() {
        if (averageMark == mark) return 100;
        else return 80;
    }
    void showInfo() {
        System.out.println("First name: " + this.getFirstName() + "; Last name: " + this.getLastName() + "; Group: " + this.getGroup() + "; Average mark: " + this.getAverageMark() + "; Scholarship: " + this.getScholarship());
    }

}
