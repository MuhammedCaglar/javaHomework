package Entites;
import Abstract.Entity;

public class Gamer implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private int dateTime;
	private String nationalityIdentity;

	
	public Gamer() {
		
	}


	public Gamer(int id, String firstName, String lastName, int dateTime, String nationalityIdentity) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateTime = dateTime;
		this.nationalityIdentity = nationalityIdentity;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateTime() {
		return dateTime;
	}
	public void setDateTime(int dateTime) {
		this.dateTime = dateTime;
	}
	public String getNationalityIdentity() {
		return nationalityIdentity;
	}
	public void setNationalityIdentity(String nationalityIdentity) {
		this.nationalityIdentity = nationalityIdentity;
	}
	
	
}
