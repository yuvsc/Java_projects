import java.util.*;

public class Employee {
	
	private String name = "";
	public void set_name(String n) {
		this.name = n;
	}
	
	public String get_name(){
		return this.name;
	}
	
}

class Doctor extends Employee {
	
	private String name;
	
	public void set_name(String n) {
		this.name = n;
	}
	
	public void about_self() {
		System.out.print("Hi! My name is "+get_name());
		System.out.println(". I am a doctor!");
		System.out.println("jk my name is "+name);
	}
	
	public void work() {
		System.out.println("I am seeing sick people right now...\n");
	}
}

class Administrator extends Employee {
	public void about_self() {
		System.out.print("Hi! My name is "+get_name());
		System.out.println(". I am an Administrator!");
	}
	
	public void work() {
		System.out.println("I am telling people what to do right now...\n");
	}
}

class Surgeon extends Employee {
	public void about_self() {
		System.out.print("Hi! My name is "+get_name());
		System.out.println(". I am a Surgeon!");
	}
	
	public void work() {
		System.out.println("I am cutting people up right now...\n");
	}
}

class Receptionist extends Employee {
	public void about_self() {
		System.out.print("Hi! My name is "+get_name());
		System.out.println(". I am a Receptionist!");
	}
	
	public void work() {
		System.out.println("I am receptionizing right now...\n");
	}
}

class Janitor extends Employee {
	public void about_self() {
		System.out.print("Hi! My name is "+get_name());
		System.out.println(". I am a Janitor!");
	}
	
	public void work() {
		System.out.println("I am cleaning right now...\n");
	}
}