class Anima1 {
    void move() {
        System.out.println("Animal moves");
    }
}

class Cheetah extends Animal {
    @Override
    void move() {
        System.out.println("Cheetah runs");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myCheetah = new Cheetah();
        myCheetah.move();
    }
}