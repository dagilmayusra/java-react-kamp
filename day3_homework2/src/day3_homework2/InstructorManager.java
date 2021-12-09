package day3_homework2;

public class InstructorManager {

	public void getInstructorInformation(Instructor instructor) {
		System.out.println("Id: " + instructor.getId());
		System.out.println("Name: " + instructor.getName());
		System.out.println("LastName: " + instructor.getLastName());
		System.out.println("Course: " + instructor.getCoursesGiven());
	}
	
	public void getInstructorList(Instructor[] instructors) {
		for(Instructor instructor: instructors) {
			getInstructorInformation(instructor);
		}
	}
	
	public void getInformation(User user) {
		System.out.println(user.getName() + " is an user");
	}
}
