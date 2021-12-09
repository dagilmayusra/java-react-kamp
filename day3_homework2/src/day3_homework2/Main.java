package day3_homework2;

public class Main {

	public static void main(String[] args) {

		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setCoursesGiven("Java");
		
		Instructor instructor2 = new Instructor();
		instructor2.setId(2);
		instructor2.setName("instructor2");
		instructor2.setLastName("Engin");
		instructor2.setCoursesGiven("Java");
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Yüsra");
		student1.setLastName("Dağılma");
		student1.setCourseTaken("Java");
		
		Student student2 = new Student();
		student1.setId(2);
		student1.setName("Student2");
		student1.setLastName("Yüsra");
		student1.setCourseTaken("C#");
		
		InstructorManager instructorManager = new InstructorManager();
		Instructor[] instructors = {instructor1, instructor2};
		instructorManager.getInformation(instructor1);
		instructorManager.getInstructorInformation(instructor2);
		instructorManager.getInstructorList(instructors);
		
		StudentManager studentManager = new StudentManager();
		Student[] students = {student1, student2};
		studentManager.getInformation(student1);
		studentManager.getStudentInformation(student2);
		studentManager.getStudentList(students);
		
		
		UserManager userManager = new UserManager();
		User[] users = {student1, student2, instructor1, instructor2};
		userManager.getInformation(student1);
		userManager.getInformation(instructor1);
		userManager.getUserInformation(student1);
		userManager.getUserInformation(instructor1);
		userManager.getUserList(users);

	}

}
