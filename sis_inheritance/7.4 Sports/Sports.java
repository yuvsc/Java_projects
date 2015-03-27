public class Sports {
	private String name = "" ;
	private int numPlayers = 0 ;
	
	public Sports () {
		name = "swimming";
		numPlayers = 1;
		System.out.println("This is "+name+". Players: "+numPlayers);
	}
	
	public void setName (String n) {
		this.name = n;
	}
	
	public String getName () {
		return name ;
	}	
	
	public void setNum (int n) {
		this.numPlayers = n;
	}
	
	public int getNum () {
		return numPlayers ;
	}
}

class SportType extends Sports {
	private String type = "" ;
	private boolean ball = false;
	
	public SportType () {
		type = "water";
		ball = false;
		System.out.println("Type "+type+". balls? "+ball);
	}
	
	public String getType () {
		return type ;
	}
	
	public boolean getIfBall () {
		return ball ;
	}
	
	public void setTypeAndBall (String t, boolean b){
		this.type = t;
		this.ball = b;
	}
	
}

class Swimming extends SportType {
	private int laps = 0;
	
	public Swimming () {
		System.out.println("Lap number: "+laps);
	}
	
	/*public void getSport() { 
		System.out.println("Hi! I'm " + getName() +" and I'm a " + getType() + " sport! Do I use balls?: " + getIfBall()
		+ ". There are " + getNum() + " people who play this sport at once." ) ;
	}*/
}