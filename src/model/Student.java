package model;

public class Student {
	//1. mainigie
	private long stID;
	private String name;
	private String surname;
	
	private static long counter = 0;
	
	//getters
	public long getStID() {
		return stID;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	
	//setters
	public void setStID() {
		//stID = counter;
		//counter += 1;
		stID = counter++;
	}
	public void setName(String InputName) {
		if(InputName != null && InputName.matches("[A-Z]{1}[a-z]{3,10}([ ][A-Z]{1}[a-z]{3,10})?")){
			name = InputName;
		}
		else {
			name = "unknown";
		}
	}
	public void setSurname(String InputSname) {
		if(InputSname != null && InputSname.matches("[A-Z]{1}[a-z]{3,10}([ ][A-Z]{1}[a-z]{3,10})?")){
			surname = InputSname;
		}
		else {
			surname = "unknown";
		}
	}
	
	// bez argumenta konstruktors
	public Student() {
		setStID();
		setName("Testa");
		setSurname("Students");
	}
	
	// argumenta konstruktors
	public Student(String x, String y) {
		setStID();
		setName(x);
		setSurname(y);
	}
	//tostring func
	@Override
	public String toString() {
		return stID + ": " + name + " " + surname;
	}
	//citas funkcijas (ja nepieciesams)
	
}

