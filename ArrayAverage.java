package JavaPrograms;

// Finding the Student mark Average using Array
public class ArrayAverage {
    public static void main(String[] Args) 
    {
        double d[] = {99.1, 75.13, 80.01, 55.09};
        double result = 0;
        int i;

        for (i = 0; i < d.length; i++)
        {
            result = result + d[i];
        } 

        double average = result / d.length;
        System.out.println("Average mark of the Student is " + average);
    }
}