
class Employee {
    int empId;
    String empName;
    double empSalary;
    String empDesignation;
    String empGender;
    String empCity;


    public Employee(int empId, String empName, double empSalary, String empDesignation, String empGender, String empCity) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empDesignation = empDesignation;
        this.empGender = empGender;
        this.empCity = empCity;
    }

    
    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSalary);
        System.out.println("Employee Designation: " + empDesignation);
        System.out.println("Employee Gender: " + empGender);
        System.out.println("Employee City: " + empCity);
        System.out.println("-----------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
                Employee[] employees = new Employee[5];

               employees[0] = new Employee(1, "John Doe", 50000, "Software Engineer", "Male", "New York");
        employees[1] = new Employee(2, "Jane Smith", 60000, "Project Manager", "Female", "Los Angeles");
        employees[2] = new Employee(3, "Alice Johnson", 55000, "QA Engineer", "Female", "Chicago");
        employees[3] = new Employee(4, "Bob Brown", 70000, "Senior Developer", "Male", "Houston");
        employees[4] = new Employee(5, "Charlie Davis", 45000, "Junior Developer", "Male", "Phoenix");


        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}