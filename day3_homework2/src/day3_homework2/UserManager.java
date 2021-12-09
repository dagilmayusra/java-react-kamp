package day3_homework2;

public class UserManager {
	
	public void getUserInformation(User user) {
		System.out.println("Id: " + user.getId());
		System.out.println("Name: " + user.getName());
		System.out.println("LastName: " + user.getLastName());
	}
	
	public void getUserList(User[] users) {
		for(User user: users) {
			getUserInformation(user);
		}
	}
	
	public void getInformation(User user) {
		System.out.println(user.getName() + " is an user");
	}

}
