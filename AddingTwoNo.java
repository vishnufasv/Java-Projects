import java.util.*;

public class AddTwoNumbers
{
public static void main(String[] args)
{
Scanner snega=new Scanner(System.in);

int num1=snega.nextInt();
int num2=snega.nextInt();

if((num1>=500 && num1<=520)&&(num2>=500 && num2<=520))
{

int sum=num1+num2;
System.out.println("add two numbers "+num1+ " and " +num2+ " result is " +sum);
}
else
{
System.out.println("both condition must be in the range of 500 to520");
}
}
}
