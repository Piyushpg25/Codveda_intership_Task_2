// Employee Model class

public class Employee {

    // Variables
    private int id;
    private String name;
    private double salary;
    private String department;

    // Constructor
    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Get Id
    public int getId() {
        return id;
    }

    // Set name
    public void setName(String name) {
        this.name = name;
    }

    // Set salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Set department
    public void setDeparment(String department) {
        this.department = department;
    }

    // Display Employee Details
    public void displayEmployee() {
        System.out.println(
            "ID: " + id +
            ", Name: " + name +
            ", Salary: " + salary +
            ", Department: " + department
        );
    }

}