import java.util.*;

public class Person {
	public String name;
	public String hair_color;
	public int age;
	
	public int in;
	public String nat;
	public String occ;
	
	Scanner scan = new Scanner(System.in);
	
	public Person() {
		
		
		System.out.print("name: ");
		name = scan.nextLine();
		System.out.print("hair color: ");
		hair_color = scan.nextLine();
	}
}

class People extends Person{
	public People() {
		System.out.print("Nationality: ");
		nat = scan.nextLine();
		System.out.print("Occupation: ");
		occ = scan.nextLine();
		System.out.print("Income: ");
		in = scan.nextInt();
		System.out.print("Age: ");
		age = scan.nextInt();
		
		System.out.println("I am "+name+ ". My hair is "+ hair_color+ ". I am "+age+" years old. I am a "+occ+". I get $"+in+". My nationality is: "+nat);

	}
}