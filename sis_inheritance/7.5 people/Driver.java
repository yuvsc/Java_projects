import java.util.*;

public class Driver {
	
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String c = "y";
		while ((c.compareToIgnoreCase("y")) == 0 ) {
			People person = new People();
			System.out.print("\nDo you want to continue to enter people? Y/N: ");
			c = scan.nextLine();
		}
	}
}