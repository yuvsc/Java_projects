import java.util.*;

public class Driver {
	public static void main (String args[]) {
		MonetaryCoin coin1 = new MonetaryCoin();
		MonetaryCoin coin2 = new MonetaryCoin();
		MonetaryCoin coin3 = new MonetaryCoin();
		
		coin1.set_value(1);
		coin2.set_value(2);
		coin3.set_value(3);
		
		System.out.println("flipping coin 1:");
		coin1.flip();
		System.out.println();
		
		System.out.println("flipping coin 2:");
		coin2.flip();
		System.out.println();
		
		System.out.println("flipping coin 3:");
		coin3.flip();
		System.out.println();
		
		int result = coin1.get_value() + coin2.get_value() + coin3.get_value();

		System.out.println("adding all coins: "+coin1.get_value()+ " + "+coin2.get_value()+ " + "+coin3.get_value()+ " = " +result);
		
		
	}
}