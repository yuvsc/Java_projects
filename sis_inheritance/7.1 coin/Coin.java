import java.util.*;

public class Coin {
	
	public void flip() {
		Random randomNum = new Random();
		if(randomNum.nextInt(2) == 0){
			System.out.println("You flipped heads!");
		} else {
			System.out.println("You flipped tails!");
		}
	}
	
}