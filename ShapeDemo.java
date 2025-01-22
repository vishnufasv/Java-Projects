import java.io.*;

abstract class Shape 
{
    abstract void area(); 
}

class Square extends Shape
 {
    double side;

    Square(double side) 
{
        this.side = side;
    }

    void area() 
{
        System.out.println("Square Area: " + (side * side));
    }
}

class Rectangle extends Shape 
{
    double length, width;

    Rectangle(double length, double width) 
{
        this.length = length;
        this.width = width;
    }

    void area() 
{
        System.out.println("Rectangle Area: " + (length * width));
    }
}

class Parallelogram extends Shape 
{
    double base, height;

    Parallelogram(doublebase, double height) 
{
        this.base = base;
        this.height = height;
    }

    void area() 
{
        System.out.println("Parallelogram Area: " + (base * height));
    }
}

public class ShapeDemo 
{
    public static void main(String[] args) 
{
        Shape square = new Square(5);              
Shape rectangle = new Rectangle(4, 6); 
        Shape parallelogram = new Parallelogram(8, 5); 
        square.area();
        rectangle.area();
        parallelogram.area();
    }
}
