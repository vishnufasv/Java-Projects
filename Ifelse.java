package JavaPrograms;

public class Ifelse {
public static void main(String[] args)
{
	int month = 4;
	String  Season ;
	
	if(month == 12 || month == 1|| month == 2)
		Season = "Winter";
	 
	else if(month == 4|| month == 3|| month == 5)
	Season = "Spring";
	
	else if(month == 6|| month == 7|| month == 8)
		Season = "Summer";
	
	else if(month == 9|| month == 10|| month == 11)
		Season = "Summer";
	
	else
		Season = "Bogus month";
	
	System.out.println("April Month is a "+ Season +" .");
	}

}
