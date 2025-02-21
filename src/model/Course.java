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
		if(InputName != null){
			title = InputName;
		}
		else {
			title = "unknown";
		}
	}
	public void setCreditPoints(int InputCreditPoints) {
		if(InputCreditPoints <= 30 && InputCreditPoints > 0){
			creditPoints = InputCreditPoints;
		}
		else {
			creditPoints = 1;
		}
	}
	public void setProfessor(Professor Inputprof) {
		if(professor == null) {
			professor = Inputprof;
		}
		else {
			professor = new Professor();
		}
	}
	
	// bez argumenta konstruktors
	public Course() {
		setCID();
		setTitle("Testa");
		setCreditPoints(1);
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
		return cID + ". " + creditPoints + "KP: " + title + " - pasniedz prof. " + professor.getName().charAt(0)+ ". " + professor.getSurname();
	}
	//citas funkcijas (ja nepieciesams)
	
}
