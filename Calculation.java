import java.lang.*;
import java.util.*;

class Calculation
{
	public static void main(String args[])
	{
	
	double x, y;
	Scanner obj = new Scanner(System.in);

	System.out.println("Calculate the Values");
	System.out.println("---------------------");
	
	System.out.println("Enter Frist Number :- ");
	x =obj.nextDouble();
 	System.out.println("Enter Second Number :- ");
	y =obj.nextDouble();
	
	 System.out.println("Now What is do you need to do with this");
	
	double add = x+y;
	double sub = x-y;
	double mul = x*y;
	double divi = x/y;
	System.out.println("Addition of the Given Value :- "+add);
	System.out.println("Subraction of the Given Value :- "+sub);
	System.out.println("Multiplication f the Given Value :- "+mul);
		System.out.println("Division of the Given Value :- "+divi);
}
}