package JavaPrograms;

public class Switch {

	public static void main(String[] args) {
		int month = 10;
			String Season;
				switch (month) {
				case 12:
				case 1:
				case 2:
					Season = "Winter .";
				break;
				
				
				case 3:
				case 4:
				case 5:
					Season = "Spring .";
				break;

				case 6:
				case 7:
				case 8:
					Season = "Summer .";
				break;

				case 9:
				case 10:
				case 11:
					Season = "Autumn .";
				break;
				default:
					Season = "Bogus Month";				
				}
				System.out.println("Ocotbor  is a " +Season);

	}

}
