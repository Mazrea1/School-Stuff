package MyFirstProject.src.com.stthom.javaapp;

public class Person {
	
	private String FirstName;
	private String LastName;

	public Person() {
	}

	public Person(String firstName, String lastName) {
		FirstName = firstName;
		LastName = lastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public String getName() {
		return this.FirstName + " " + this.LastName;
	}

}
