import java.util.*;

public class Driver{
	public static void main (String [] args) {
		
		book buq = new book();
		novel nov = new novel();
		magazine mag = new magazine();
		technical_journal jo = new technical_journal();
		textbook text = new textbook();
		
		buq.init("book1","auth1",1);
		nov.init("book2","auth2",2);
		mag.init("book3","auth3",3);
		jo.init("book4","auth4",4);
		text.init("book5","auth5",5);
		
		buq.about_self();
		nov.about_self();
		mag.about_self();
		jo.about_self();
		text.about_self();
	}
}