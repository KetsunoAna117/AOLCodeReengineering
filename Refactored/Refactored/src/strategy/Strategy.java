package strategy;

import java.util.*;
import main.Student;

public abstract class Strategy {
	
	protected void printStudentInfo(Student student) {
		System.out.println();
		System.out.println("Student " + student.getId() + " information:");
		System.out.println(" - Name: " + student.getName());
		System.out.println(" - Phone number: " + student.getPhoneNumber());
		System.out.println(" - Email: " + student.getEmail());
	}
	
	public abstract void display(ArrayList<Student> students);
	
}
