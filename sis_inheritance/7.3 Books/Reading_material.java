import java.util.*;

public class Reading_material {
	private String name;
	private String author;
	private int pageNum;
	
	public void set_name(String n) {
		this.name = n;
	}	
	public String get_name() {
		return this.name;
	}
	
	public void set_author(String a) {
		this.author = a;
	}	
	public String get_author() {
		return this.author;
	}
	
	public void set_pageNum(int num) {
		this.pageNum = num;
	}	
	public int get_pageNum() {
		return this.pageNum;
	}
	
	public void init(String name, String auth, int page){
		set_name(name);
		set_author(auth);
		set_pageNum(page);
	}
	
}

class book extends Reading_material{
	public void about_self() {
		System.out.println(get_name() +" by: "+ get_author() + ". "+get_pageNum() + " pages. A book");
	}
}

class novel extends Reading_material{
	public void about_self() {
		System.out.println(get_name() +" by: "+ get_author() + ". "+get_pageNum() + " pages. A novel");
	}
}

class magazine extends Reading_material{
	public void about_self() {
		System.out.println(get_name() +" by: "+ get_author() + ". "+get_pageNum() + " pages. A magazine");
	}
}

class technical_journal extends Reading_material{
	public void about_self() {
		System.out.println(get_name() +" by: "+ get_author() + ". "+get_pageNum() + " pages. A technical journal");
	}
}

class textbook extends Reading_material{
	
	public void about_self() {
		System.out.println(get_name() +" by: "+ get_author() + ". "+get_pageNum() + " pages. A textbook");
	}
}