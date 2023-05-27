package main;

import java.util.ArrayList;

public class Teacher extends Person {
	private String password;
	private ArrayList<Student> students = new ArrayList<>();
	
	public Teacher(String id, String name, String phoneNumber, String email, String password) {
		super(id, name, phoneNumber, email);
		this.password = password;
	}	
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
}
