package service;

import model.Student;
import model.Degree;
import model.Professor;
import model.Course;

public class MainService {

	public static void main(String[] args) {
		System.out.println("--------STUDENTI---------");
		Student st1 = new Student();
		System.out.println(st1); //0: Testa Students
		
		Student st2 = new Student("Ralfs", "Eglitis");
		System.out.println(st2); //1: Ralfs Eglitis
		
		Student st3 = new Student("Anna Paula", "Jauka Nejauka");
		System.out.println(st3); //2: Anna Paula Jauka Nejauka
		
		Student st4 = new Student("089089asd9082", "Skirm$ante");
		System.out.println(st4); //3: unknown unknown
		System.out.println("--------PROFESORI--------");
		Professor p1 = new Professor("Lady", "Blackwater", Degree.phD);
		System.out.println(p1); //0: Lady Blackwater, phD
		
		Professor p2 = new Professor();
		System.out.println(p2); //1: unknown unknown
		
		Professor p3 = new Professor("Sirski", "Max!millian", Degree.dr);
		System.out.println(p3); // 
		
		Course c1 = new Course();
		System.out.println(c1);
		
		Course c2 = new Course("JAVA programmesana", 6, p3);
		System.out.println(c2);
		
		Course c3 = new Course("Informācijas sistēmu analīze un projektēšana", 10, p1);
		System.out.println(c3);
	}

}
