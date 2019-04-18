package project1;
public class Staff extends Employee {

    protected String title;

    public Staff(String name) {
        this(name, "none");

    }
    public Staff(String name, double salary, String office, MyDate dateHired) {
        super(name);
        this.salary = salary;
        this.office = office;
        this.dateHired = dateHired;
    }

    public Staff(String name, String title) {
        super(name);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Class: " + this.getClass().getName();
    }
}