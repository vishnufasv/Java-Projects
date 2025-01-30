class Employee {
    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return 0;
    }
}

class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager is managing employees");
    }

    void addEmployee() {
        System.out.println("HR Manager adds a new employee");
    }
}

public class Main {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        hr.addEmployee();
    }
}