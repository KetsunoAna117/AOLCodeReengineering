package main;
import java.util.*;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	ArrayList<Teacher> teachers = new ArrayList<>();
	Teacher currentTeacher;
	
	void printStudentInfo(Student student) {
		System.out.println();
		System.out.println("Student " + student.getId() + " information:");
		System.out.println(" - Name: " + student.getName());
		System.out.println(" - Phone number: " + student.getPhoneNumber());
		System.out.println(" - Email: " + student.getEmail());
	}
	
	void printStudentsMenu() {
		if (currentTeacher.getStudents().size() == 0) {
			System.out.println("There are no students yet!\n");
			return;
		}
		
		System.out.println("======== Print Students Menu ========");
		System.out.println("1. Print normally");
		System.out.println("2. Print in reverse order");
		System.out.println("3. Print sorted by name");
		System.out.println("4. Print in random order");
		
		ArrayList<Student> students = currentTeacher.getStudents();
		
		int strategy;
		
		do {
			System.out.print(">> ");
			strategy = scan.nextInt();
			scan.nextLine();
		} while (strategy < 1 || strategy > 4);
		
		System.out.println();
		
		if (strategy == 1) {
			System.out.println("Printing in normal order:");
			for (Student student : students) {
				printStudentInfo(student);
			}
		}
		else if (strategy == 2) {
			System.out.println("Printing in reverse order:");		
			for (int i=students.size()-1; i >= 0; i--) {
				printStudentInfo(students.get(i));
			}
		}
		else if (strategy == 3) {
			System.out.println("Printing in sorted name order:");
			
			ArrayList<Student> sortedStudents = new ArrayList<>();
			sortedStudents.addAll(students);
			Collections.sort(sortedStudents);
			
			for (Student student : sortedStudents) {
				printStudentInfo(student);
			}
		}
		else {
			System.out.println("Printing in random order:");
			
			ArrayList<Student> shuffledStudents = new ArrayList<>();
			shuffledStudents.addAll(students);
			Collections.shuffle(shuffledStudents);
			
			for (Student student : shuffledStudents) {
				printStudentInfo(student);
			}
		}
		
		System.out.println("\nPress enter to continue");
		scan.nextLine();
	}
	
	Teacher getTeacherFromCredential(String email, String password) {
		for (Teacher teacher : teachers) {
			if (teacher.getEmail().equals(email) && teacher.getPassword().equals(password)) {
				return teacher;
			}
		}
		
		return null;
	}
	
	void mainMenu() {
		System.out.println("\nLogin success!");
		
		while (true) {
			System.out.println("\n======== Menu ========");
			System.out.println("1. Add new student");
			System.out.println("2. Print all students");
			System.out.println("3. Logout");
			
			int choice;
			
			do {
				System.out.print(">> ");
				choice = scan.nextInt();
				scan.nextLine();
			} while (choice < 1 || choice > 3);
			
			System.out.println();
			
			if (choice == 1) {
				System.out.println("======== Add new student ========");
				
				String id, name, phoneNumber, email;
				
				System.out.print("Enter student id: ");
				id = scan.nextLine();
				System.out.print("Enter student name: ");
				name = scan.nextLine();
				System.out.print("Enter student phone number: ");
				phoneNumber = scan.nextLine();
				System.out.print("Enter student email: ");
				email = scan.nextLine();
				
				currentTeacher.addStudent(new Student(id, name, phoneNumber, email));
			}
			else if (choice == 2) {
				printStudentsMenu();
			}
			else {
				System.out.println("\nGoodbye!");
				return;
			}
		}
	}
	
	void loginMenu() {
		String email, password;
		
		while (true) {
			System.out.println("======== Teacher Login ========");
			
			System.out.print("Enter your email: ");
			email = scan.nextLine();
			
			System.out.print("Enter your password: ");
			password = scan.nextLine();
			
			
			Teacher teacher = getTeacherFromCredential(email, password);
			
			if (teacher != null) {
				currentTeacher = teacher;
				break;
			}
			else {
				System.out.println("\nLogin credential invalid, please try again!\n");
			}
		}
		
		mainMenu();
	}
	
	Main() {
		// Add mock up teacher data
		teachers.add(new Teacher("T001", "juan", "08324675744", "juan@gmail.com", "1234"));
		teachers.add(new Teacher("T002", "hans", "083244325744", "hans@gmail.com", "password"));
		teachers.add(new Teacher("T003", "delta", "083644525244", "delta@gmail.com", "1234"));
		teachers.add(new Teacher("T004", "steven", "085241335464", "steven@gmail.com", "password"));
				
		loginMenu();
	}
	
	public static void main(String[] args) {		
		new Main();
	}
}
