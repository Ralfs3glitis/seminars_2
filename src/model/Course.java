package model;

public class Course {
	
	private long cID;
	private String title;
	private int creditPoints;
	private Professor professor;
	private static long counter = 1;

	
	//getters
	public long getcID() {
		return cID;
	}
	public String getTitle() {
		return title;
	}
	public int getCreditPoints() {
		return creditPoints;
	}
	public Professor getProfessor() {
		return professor;
	}
	//setters
	public void setCID() {
		//stID = counter;
		//counter += 1;
		cID = counter++;
	}
	public void setTitle(String InputName) {
		if(InputName != null && InputName.matches("[A-Z]{1}[a-z]{3,20}([ ][a-z]{3,20})?")){
			title = InputName;
		}
		else {
			title = "unknown";
		}
	}
	public void setCreditPoints(int InputCreditPoints) {
		if(InputCreditPoints >= 0){
			creditPoints = InputCreditPoints;
		}
		else {
			creditPoints = 0;
		}
	}
	public void setProfessor(Professor Inputprof) {
		professor = Inputprof;
	}
	
	// bez argumenta konstruktors
	public Course() {
		setCID();
		setTitle("Testa");
		setCreditPoints(0);
		setProfessor(new Professor());
	}
	
	// argumenta konstruktors
	public Course(String x, int y, Professor z) {
		setCID();
		setTitle(x);
		setCreditPoints(y);
		setProfessor(z);
	}
	//tostring func
	@Override
	public String toString() {
		return cID + ": " + title + " - " + creditPoints + "KP " + " pasniedz, " + professor;
	}
	//citas funkcijas (ja nepieciesams)
	
}
