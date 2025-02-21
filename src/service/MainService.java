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
		
		allStudents.addAll(Arrays.asList(st1, st2, st3, st4));
		System.out.println(allStudents);
		
		System.out.println("--------PROFESORI--------");
		
		Professor p1 = new Professor("Lady", "Blackwater", Degree.phD);
		//System.out.println(p1); //0: Lady Blackwater, phD
		
		Professor p2 = new Professor();
		//System.out.println(p2); //1: unknown unknown
		
		Professor p3 = new Professor("Sirski", "Max!millian", Degree.dr);
		//System.out.println(p3); // 
		
		allProfessors.addAll(Arrays.asList(p1, p2, p3));
		System.out.println(allProfessors);
		
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
		
		allGrades.addAll(Arrays.asList(g1, g2, g3));
		System.out.println(allGrades);
		
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

}
