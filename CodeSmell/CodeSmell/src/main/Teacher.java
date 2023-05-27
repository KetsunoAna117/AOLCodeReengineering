package main;

import java.util.ArrayList;

public class Teacher implements Comparable<Teacher> {
	private String id;
	private String name;
	private String phoneNumber;
	private String email;
	
	private String password;
	private ArrayList<Student> students = new ArrayList<>();
	
	public Teacher(String id, String name, String phoneNumber, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
	}
	
	@Override
	public int compareTo(Teacher t) {
		return this.name.compareTo(t.name);
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
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
