package model;
public class Professor {
	private long pID;
	private String name;
	private String surname;
	private Degree degree;
	private static long counter = 10000;

	
	//getters
	public long getStID() {
		return pID;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public Degree getDegree() {
		return degree;
	}
	//setters
	public void setPID() {
		//stID = counter;
		//counter += 1;
		pID = counter++;
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
	public void setDegree(Degree InputDegree) {
		if(InputDegree != null){
			degree = InputDegree;
		}
		else {
			degree = Degree.bsc;
		}
	}
	
	// bez argumenta konstruktors
	public Professor() {
		setPID();
		setName("Testa");
		setSurname("Profesors");
		setDegree(Degree.bsc);
	}
	
	// argumenta konstruktors
	public Professor(String x, String y, Degree z) {
		setPID();
		setName(x);
		setSurname(y);
		setDegree(z);
	}
	//tostring func
	@Override
	public String toString() {
		return pID + ": " + name + " " + surname + ", " + degree;
	}
	//citas funkcijas (ja nepieciesams)
}
