package service;

import model.Student;
import model.Degree;
import model.Professor;

import java.util.ArrayList;
import java.util.Arrays;

import model.Course;
import model.Grade;

public class MainService {

	private static ArrayList<Student> allStudents = new ArrayList<Student>();
	private static ArrayList<Professor> allProfessors = new ArrayList<Professor>();
	private static ArrayList<Course> allCourses = new ArrayList<Course>();
	private static ArrayList<Grade> allGrades = new ArrayList<Grade>();
	//ctrl + space to fill
	
	
	public static void main(String[] args) {
		
		System.out.println("--------STUDENTI---------");
		
		Student st1 = new Student();
		//System.out.println(st1); //0: Testa Students
		
		Student st2 = new Student("Ralfs", "Eglitis");
		//System.out.println(st2); //1: Ralfs Eglitis
		
		Student st3 = new Student("Anna Paula", "Jauka Nejauka");
		//System.out.println(st3); //2: Anna Paula Jauka Nejauka

		Student st4 = new Student("089089asd9082", "Skirm$ante");
		//System.out.println(st4); //3: unknown unknown
		Student st5 = new Student("Blooduh", "Lukass");
		
		allStudents.addAll(Arrays.asList(st1, st2, st3, st4, st5));
		
		System.out.println(allStudents);
		
		System.out.println("--------PROFESORI--------");
		
		Professor p1 = new Professor("Lady", "Blackwater", Degree.phD);
		//System.out.println(p1); //0: Lady Blackwater, phD
		
		Professor p2 = new Professor();
		//System.out.println(p2); //1: unknown unknown
		
		Professor p3 = new Professor("Sirski", "Max!millian", Degree.dr);
		//System.out.println(p3); // 
		
		allProfessors.addAll(Arrays.asList(p1, p2, p3));
		
		try {
			System.out.println("1000. profesors: " + retrieveProfessorById(1000));
			createProfessor("Karlis", "Immers", Degree.mg);
			createProfessor("Raita", "Rollande", Degree.dr);
			createProfessor("Juris", "Zagars", Degree.dr);
			System.out.println(allProfessors);
			System.out.println("pirms: " + retrieveProfessorById(1001));
			updateProfessorById(1001, "Karina", "Krinkele", Degree.dr);
			System.out.println("pec: " + retrieveProfessorById(1001));
			deleteProfessorById(1000);
			System.out.println("Pec dzesanas: ");
			System.out.println(allProfessors);
			System.out.println("profesori ar doktora gradu: " + filterProfessorByDegree(Degree.dr));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("--------KURSI---------");
		
		Course c1 = new Course();
		//System.out.println(c1);
		
		Course c2 = new Course("JAVA programmesana", 6, p3);
		//System.out.println(c2);
		
		Course c3 = new Course("Informācijas sistēmu analīze un projektēšana", 10, p1);
		//System.out.println(c3);
		
		allCourses.addAll(Arrays.asList(c1, c2, c3));
		System.out.println(allCourses);
		
		System.out.println("--------ATZIMES---------");
		
		Grade g1 = new Grade();
		//System.out.println(g1);
		
		Grade g2 = new Grade(10, st2, c2);
		//System.out.println(g2);
		
		Grade g3 = new Grade(8, st3, c3);
		//System.out.println(g3);
		Grade g4 = new Grade(2, st3, c3);
		Grade g5 = new Grade(3, st2, c2);
		Grade g6 = new Grade(4, st1, c1);
		Grade g7 = new Grade(6, st4, c3);
		allGrades.addAll(Arrays.asList(g1, g2, g3, g4, g5, g6, g7));
		System.out.println(allGrades);
		try {
			System.out.println("videja atzime studentam ar id 0: " + StudentAvg(0));
			System.out.println("videja atzime studentam ar id 1: " + StudentAvg(1));
			System.out.println("videja atzime studentam ar id 2: " + StudentAvg(2));
			System.out.println("videja atzime studentam ar id 3: " + StudentAvg(3));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	//CRUD
	//C-create
	public static void createProfessor(String name, String surname, Degree degree) throws Exception{
		//parbaudam vai jau eksistee
		for(Professor tempP : allProfessors) {
			if(tempP.getName().equals(name) && tempP.getSurname().equals(surname) && tempP.getDegree().equals(degree)) {
				throw new Exception("profesors jau eksiste");
			}
		}
		//Professor newProfessor = new Professor(name, surname, degree);
		//allProfessors.add(newProfessor)
		allProfessors.add(new Professor(name, surname, degree));
	}
	//R - retrieve
	public static Professor retrieveProfessorById(int id) throws Exception {
		if(id < 0) {
			throw new Exception("id nevar but negativs");
		}
		for(Professor tempP : allProfessors) {
			if(tempP.getPID() == id) {
				return tempP;
			}
		}
		throw new Exception("Profesors ar noradito id neeksiste");
	}
	//U - update
	public static void updateProfessorById(int id, String inputName, String inputSurname, Degree inputDegree) throws Exception{
		Professor foundProfessor = retrieveProfessorById(id);
		if(inputName != null && !foundProfessor.getName().equals(inputName)) {
			foundProfessor.setName(inputName);
		}
		if(inputSurname != null && !foundProfessor.getSurname().equals(inputSurname)) {
			foundProfessor.setSurname(inputSurname);
		}
		if(inputDegree != null && !foundProfessor.getDegree().equals(inputDegree)) {
			foundProfessor.setDegree(inputDegree);
		}
		
	}
	//D - delete
	public static void deleteProfessorById(int id) throws Exception{
		Professor foundProfessor = retrieveProfessorById(id);
		allProfessors.remove(foundProfessor);
	}
	
	public static ArrayList<Professor> filterProfessorByDegree(Degree inputDegree) throws Exception{
		if(inputDegree == null) {
			throw new Exception("nav pareizi ievadits grads");
		}
		ArrayList<Professor> results = new ArrayList<Professor>();
		for(Professor tempP : allProfessors) {
			if(tempP.getDegree() == inputDegree) {
				//add to list
				results.add(tempP);
			}
		}
		return results;
	}
	//aprekina videjo ja padot studenta id
	public static float StudentAvg(int inputID) throws Exception {
		Student foundStudent = null;
		float sum = 0;
		int gradeAmount = 0;
		if(inputID < 0) {
			throw new Exception("id nevar but negativs");
		}
		
		for(Student tempS : allStudents) {
			if(tempS.getStID() == inputID) {
				foundStudent = tempS;
			}
		}
		for(Grade tempG : allGrades) {
			if(tempG.getStudent() == foundStudent) {
				sum += tempG.getGrValue();
				gradeAmount += 1;
			}
		}
		if(gradeAmount == 0) {
			throw new Exception("Studentam nav atzimes");
		}
		return sum/gradeAmount;
		
	}
	
}
