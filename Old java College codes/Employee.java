public class Employee {
    
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String fName, String lName, double salary) {
        firstName = fName;
        lastName = lName;
        setMonthlySalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fName) {
        firstName = fName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lName) {
        lastName = lName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double salary) {
        if (salary > 0) {
            monthlySalary = salary;
        } else {
            monthlySalary = 0.0;
        }
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise() {
        monthlySalary = monthlySalary * 1.10;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("pratik", "farate", 5000);
        Employee e2 = new Employee("Rohit", "Sharma", 6000);

        System.out.println(e1.getFirstName() + " " + e1.getLastName() + " - Yearly Salary: " + e1.getYearlySalary());
        System.out.println(e2.getFirstName() + " " + e2.getLastName() + " - Yearly Salary: " + e2.getYearlySalary());

        e1.giveRaise();
        e2.giveRaise();

        System.out.println("After 10% raise:");
        System.out.println(e1.getFirstName() + " " + e1.getLastName() + " - Yearly Salary: " + e1.getYearlySalary());
        System.out.println(e2.getFirstName() + " " + e2.getLastName() + " - Yearly Salary: " + e2.getYearlySalary());
    }
}
