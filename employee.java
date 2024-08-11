import java.util.Date;

public class employee {
    // Fields
    private int id;
    private String name;
    private String address;
    private double salary;
    private Date doj;

    // Constructor
    public employee(int id, String name, String address, double salary, Date doj) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.doj = doj;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Date of Joining: " + doj);
    }

    public static void main(String[] args) {
        // Creating a Date object for Date of Joining
        Date doj = new Date();

        // Creating an Employee object
        employee emp = new employee(101, "John Doe", "123 Main St, City", 75000, doj);

        // Displaying employee details
        emp.displayEmployeeDetails();
    }
}

