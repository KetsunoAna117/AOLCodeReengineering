package strategy;

import java.util.ArrayList;
import java.util.Collections;

import main.Student;

public class RandomStrategy extends Strategy {

	@Override
	public void display(ArrayList<Student> students) {
		System.out.println("Printing in random order:");
		
		ArrayList<Student> shuffledStudents = new ArrayList<>();
		shuffledStudents.addAll(students);
		Collections.shuffle(shuffledStudents);
		
		for (Student student : shuffledStudents) {
			printStudentInfo(student);
		}
	}

}
