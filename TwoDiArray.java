package JavaPrograms;

// Print the element left to right
public class TwoDiArray 
								{

    public static void main(String[] args) 
    {
        int twodi[][] = new int[4][5]; // Initialize the 2D array with 4 rows and 5 columns
        int i, j, k = 0;

        // Fill the 2D array with values
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twodi[i][j] = k;
                k++;
            }
        }

        // Print the 2D array in a grid format
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(twodi[i][j] + " "); // Print each element followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}