class Vehicle1 {
    String make;
    String model;
    int year;
    String fuelType;

    double calculateFuelEfficiency(double distance, double fuelUsed) {
        return distance / fuelUsed;
    }

    double distanceTraveled(double speed, double time) {
        return speed * time;
    }

    double maxSpeed() {
        return 0;
    }
}

class Truck extends Vehicle {
    @Override
    double maxSpeed() {
        return 80;
    }
}

class Car extends Vehicle {
    @Override
    double maxSpeed() {
        return 120;
    }
}

class Motorcycle extends Vehicle {
    @Override
    double maxSpeed() {
        return 150;
    }
}

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();
        System.out.println("Truck Max Speed: " + truck.maxSpeed());

        Car car = new Car();
        System.out.println("Car Max Speed: " + car.maxSpeed());

        Motorcycle motorcycle = new Motorcycle();
        System.out.println("Motorcycle Max Speed: " + motorcycle.maxSpeed());
    }
}