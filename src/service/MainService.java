package service;

import model.Student;

public class MainService {

	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println(st1); //0: Testa Students
		
		Student st2 = new Student("Ralfs", "Eglitis");
		System.out.println(st2); //1: Ralfs Eglitis
		
		Student st3 = new Student("Anna Paula", "Jauka Nejauka");
		System.out.println(st3); //2: ...
		
		Student st4 = new Student("089089asd9082", "Skirm$ante");
		System.out.println(st4); //3: unknown unknown
	}

}
