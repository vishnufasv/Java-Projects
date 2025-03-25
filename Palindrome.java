package basicprograms;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		String a ="amma";
	    String b = new StringBuilder(a).reverse().toString();
	    System.out.print(a.equals(b));
	}

}
