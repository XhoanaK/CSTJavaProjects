package project1;
public class Student extends Person {

    public static final String FRESHMAN = "Freshman";    //final- no one can change them
    public static final String SOPHOMORE = "Sophomore";  // static- saves memory
    public static final String JUNIOR = "Junior"; //need to be private
    public static final String SENIOR = "Senior";

    protected String status;

    
    public Student(String name) {
        super(name);
    }

    public Student(String name, String status) {
        super(name);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Class: " + this.getClass().getName();
    }
}