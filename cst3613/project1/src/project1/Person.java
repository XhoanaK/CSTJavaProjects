package project1;

public class Person {

    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    public Person(String name) {
        this.name = name;		   //Constructor 
    }
  
   // keep a constructor with out any parameter. 
    //public Person() { }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    										//since all values are protected or private we use setters and getters
    										//to get info from the class
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Class: " + this.getClass().getName();
    }
}