import java.util.*;

public class Driver{
	public static void main (String [] args) {
		
		Doctor doc = new Doctor();
		Administrator admin = new Administrator();
		Surgeon surg = new Surgeon();
		Receptionist recep = new Receptionist();
		Janitor jan = new Janitor();
		
		doc.set_name("Mr. Doc");
		doc.about_self();
		doc.work();
		
		admin.set_name("Mrs. Admin");
		admin.about_self();
		admin.work();
		
		surg.set_name("Mr. Surg");
		surg.about_self();
		surg.work();
		
		recep.set_name("Mrs. Receptionist");
		recep.about_self();
		recep.work();
		
		jan.set_name("Mr. Janitor");
		jan.about_self();
		jan.work();
		
		doc.set_name("boblolz");
		doc.about_self();
		
	}
}