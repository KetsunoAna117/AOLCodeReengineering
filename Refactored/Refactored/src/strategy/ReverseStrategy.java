package strategy;

import java.util.ArrayList;

import main.Student;

public class ReverseStrategy extends Strategy {

	@Override
	public void display(ArrayList<Student> students) {
		System.out.println("Printing in reverse order:");		
		for (int i=students.size()-1; i >= 0; i--) {
			printStudentInfo(students.get(i));
		}
	}
	
}
