class Employee1 {
    String name;
    String address;
    double salary;
    String jobTitle;

    double calculateBonus() {
        return salary * 0.1;
    }

    String generatePerformanceReport() {
        return "Performance report for " + name;
    }

    void manageProject() {
        System.out.println(name + " is managing a project");
    }
}

class Manager extends Employee {
    @Override
    double calculateBonus() {
        return salary * 0.2;
    }
}

class Developer extends Employee {
    @Override
    void manageProject() {
        System.out.println(name + " is developing a project");
    }
}

class Programmer extends Employee {
    @Override
    void manageProject() {
        System.out.println(name + " is programming a project");
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Alice";
        manager.salary = 80000;
        System.out.println("Manager Bonus: " + manager.calculateBonus());

        Developer developer = new Developer();
        developer.name = "Bob";
        developer.manageProject();

        Programmer programmer = new Programmer();
        programmer.name = "Charlie";
        programmer.manageProject();
    }
}