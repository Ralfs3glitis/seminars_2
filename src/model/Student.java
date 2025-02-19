package model;

public class Student {
	//1. mainigie
	private long stID;
	private String name;
	private String surname;
	
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
	/*
	public void setStID(long InputID) {
		stID = InputID;
	}
	*/
	public void setName(String InputName) {
		if(InputName != null){
			name = InputName;
		}
		else {
			name = "unknown";
		}
	}
	public void setSurname(String InputSname) {
		if(InputSname != null){
			surname = InputSname;
		}
		else {
			surname = "unknown";
		}
	}
	
	// bez argumenta konstruktors
	
	
	//konstruktors ar argumentiem
	public Student(String x, String y) {
		stID += 1;
		name = x;
		surname = y;
	}
	
}

