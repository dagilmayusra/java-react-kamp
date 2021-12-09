package day3_homework2;

public class StudentManager extends UserManager {
	
	public void getStudentInformation(Student student) {
		System.out.println("Id: " + student.getId());
		System.out.println("Name: " + student.getName());
		System.out.println("LastName: " + student.getLastName());
		System.out.println("Course: " + student.getCourseTaken());
	}
	
	public void getStudentList(Student[] students) {
		for(Student student: students) {
			getStudentInformation(student);
		}
	}
	public void getInformation(User user) {
		System.out.println(user.getName() + " is an user");
	}
}
