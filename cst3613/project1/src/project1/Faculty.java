package project1;

public class Faculty extends Employee {




    protected String officeHours;
    protected String rank;

    public Faculty(String name) {
        this(name, "9-5PM", "Employee");
    }
    public Faculty(String name, double salary, String office, MyDate dateHired) {
        super(name);
        this.salary = salary;			//add constructor that is found on the superclass
        this.office = office;
        this.dateHired = dateHired;
    }
    public Faculty(String name, String officeHours, String rank) {
        super(name);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Class: " + this.getClass().getName();
    }
}