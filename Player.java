package kimesh.GoodFellas;

public class Player {
	private String ID;
	private String name;
	private String surname;
	
	public Player() {
		
	}
	
	public Player(String ID, String name, String surname) {
		super();
		this.ID = ID;
		this.name = name;
		this.surname = surname;
	}
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	@Override
	public String toString() {
		return "\nPlayer- \nID: " + ID + " \nName: " + name + " \nSurname: " + surname;
	}

	public static void main(String[] args) {
		Player p1 = new Player("nag001" ,"Kimesh", "Nagiah");
		System.out.println(p1.toString());
		
		

	}

}
