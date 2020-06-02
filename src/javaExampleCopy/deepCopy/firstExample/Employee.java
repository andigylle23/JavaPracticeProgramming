package javaExampleCopy.deepCopy.firstExample;

import java.util.Date;

// Creating a concrete class to implement the interface Cloneable
public class Employee implements Cloneable {

    // Declaration
    private Long id;
    private String name;
    private Date dob;

    // Constructor
    public Employee(Long id, String name, Date dob) {
        super();
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }


    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    // Overriding the clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee clone = null;

        try {
            clone = (Employee) super.clone();

            // Copy new employee to cloned method
            clone.setDob((Date)this.getDob().clone());

        } catch(CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return clone;
    }

    // Override the toString where it will return a value without being called
    @Override
    public String toString() {
        return "Employee[" + id + ", name=" + name + ", date=" + dob + "]";
    }
}
