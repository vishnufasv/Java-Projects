import java.util.*;

class year
{
public static void main(String[] args)
{

Scanner obj=new Scanner(System.in);
System.out.println("Enter the Year");
int a = obj.nextInt();
if(a%4==0)
{
System.out.println(a+" is Leap Year");
}
else
{
System.out.println(a+" is not Leap Year");
}
}}