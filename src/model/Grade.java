package model;

public class Grade {
	private long gID;
	private int grValue;
	private Student student;
	private Course course;
	private int counter = 0;
	
	
	public long getgID() {
		return gID;
	}
	public void setgID() {
		gID = counter++;
	}
	
	public int getGrValue() {
		return grValue;
	}
	public void setGrValue(int grValue) {
		if(grValue > 0 && grValue <= 10) {
			this.grValue = grValue;
		}
		else {
			this.grValue = 0;
		}
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		if(student != null) {
			this.student = student;
		}
		else {
			this.student = new Student();
		}
	}
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		if(course != null) {
			this.course = course;
		}
		else {
			this.course = new Course();
		}
	}
	
	public Grade() {
		setgID();
		setGrValue(0);
		setStudent(new Student());
		setCourse(new Course());
	}
	public Grade(int inputGrValue, Student inputStudent, Course inputCourse) {
		setgID();
		setGrValue(inputGrValue);
		setStudent(inputStudent);
		setCourse(inputCourse);
	}
	public String toString() {
		return gID + ": " + grValue + " (" + course.getTitle() + ") -> " + student.getName().charAt(0) + ". " + student.getSurname();
	}
	
	
	
	
}
