import java.lang.*;
import java.util.*;

class student
{
public static void main(String args[])
{
	int sroll, sclass, m1, m2, m3, m4, m5;
	String ssec, sname;
	Scanner obj = new Scanner(System.in);

	System.out.println("Enter Student record");
	
	System.out.println("Enter your Student Roll Number :- ");
	sroll =obj.nextInt();
	obj.nextLine();

	System.out.println("Enter Student name :- ");
	sname =obj.nextLine();

	System.out.println("Enter Student Class :- ");
	sclass =obj.nextInt();

	System.out.println("Enter Student Section:-");
	ssec =obj.nextLine();
	obj.nextLine();

	System.out.println("Enter the Mark for Tamil :-");
	m1 =obj.nextInt();

	System.out.println("Enter the Mark for English :-");
	m2 =obj.nextInt();

	System.out.println("Enter the Mark for Maths :-");
	m3 =obj.nextInt();

	System.out.println("Enter the Mark for Science :-");
	m4 =obj.nextInt();

	System.out.println("Enter the Mark for Social :-");
	m5 =obj.nextInt();
	
	int total = m1+m2+m3+m4+m5;
	int avg  = total/5;
	
	System.out.println("Record of the Student");
	System.out.println("--------------------------");
	System.out.println("Name of the Student :- "+sname);
	System.out.println("Roll of the Student :- "+sroll);
	System.out.println("Class of the Student :- "+sname +ssec);
	System.out.println("Total of the Student :- "+total);
	System.out.println("Average of the Student :- "+avg);

	
	
}
}	


