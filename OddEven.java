import java.util.*;

public class OddEven
{
public static void main(String[] args)
{
Scanner ab=new Scanner(System.in);
int a=ab.nextInt();
if(a>=0)
{
if(a%2==0)
{
System.out.println("The number is even number");
}

else if (a%2!=0)
{
System.out.println("The number is odd number");
}
}
else{
System.out.println("invalid number. please enter a valid integer");
}
}
}