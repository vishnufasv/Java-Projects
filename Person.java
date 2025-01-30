class Person {
    String firstName;
    String lastName;

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    String employeeId;
    String jobTitle;

    String getEmployeeId() {
        return employeeId;
    }

    @Override
    String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.firstName = "John";
        emp.lastName = "Doe";
        emp.jobTitle = "Software Engineer";
        System.out.println(emp.getLastName());
    }
}