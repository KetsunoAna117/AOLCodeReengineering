package strategy;

import java.util.ArrayList;
import java.util.Collections;

import main.Student;

public class SortedStrategy extends Strategy {

	@Override
	public void display(ArrayList<Student> students) {
		System.out.println("Printing in sorted name order:");
		
		ArrayList<Student> sortedStudents = new ArrayList<>();
		sortedStudents.addAll(students);
		Collections.sort(sortedStudents);
		
		for (Student student : sortedStudents) {
			printStudentInfo(student);
		}
	}
	
}
