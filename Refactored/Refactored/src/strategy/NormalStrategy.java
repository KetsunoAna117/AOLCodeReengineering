package strategy;

import java.util.ArrayList;

import main.Student;

public class NormalStrategy extends Strategy {

	@Override
	public void display(ArrayList<Student> students) {
		System.out.println("Printing in normal order:");
		for (Student student : students) {
			printStudentInfo(student);
		}
	}
	
}
