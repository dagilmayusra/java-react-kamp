package eCommerceDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.business.abstracts.UsersService;
import eCommerceDemo.core.GoogleService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.Users;

public class UsersManager implements UsersService {

	List<String> mailList = new ArrayList<String>();
	List<Users> userList = new ArrayList<Users>();
	
	private UserDao userDao;
	private GoogleService googleService;
	
	public UsersManager(UserDao userDao, GoogleService googleService) {
		super();
		this.userDao= userDao;
		this.googleService=googleService;
	}
	
	@Override
	public void signIn(Users user) {
		if(mailVerification(user)==true && nameVerification(user)==true && passwordVerification(user)==true){
			this.userDao.signIn(user);
			userList.add(user);
		}
		else {
			System.out.println("Lütfen Tüm Bilgileri Doldurunuz");
		}
		
	}

	@Override
	public void logIn(Users user) {
		if(userList.contains(user) && user.geteMail() != null && user.getPassword() != null){
			this.userDao.logIn(user);
		}
		else {
			System.out.println("Yanlýþ eposta adresi veya þifre");
		}
		
	}

	@Override
	public void signInWithGoogle(Users user) {
		if(mailVerification(user) == true && nameVerification(user)==true && passwordVerification(user)==true){
			this.googleService.signInWithGoogle(user);
			userList.add(user);
		}
		else {
			System.out.println("Lütfen Google Hesabýnýzla Oturum Açýn");
		}
		
	}

	@Override
	public boolean mailVerification(Users user) {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);

	    Matcher matcher = pattern.matcher(user.geteMail());
		if(matcher.matches()==true && mailList.contains(user.geteMail())==false){
			mailList.add(user.geteMail());
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public boolean passwordVerification(Users user) {
		String regex = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9\\\\s]).{6,}"; 
		Pattern pattern = Pattern.compile(regex);

	    Matcher matcher = pattern.matcher(user.getPassword());
		if(matcher.matches()==true){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public void delete(Users user) {
		if(userList.contains(user)) {
			this.userDao.delete(user);
		} else {
			System.out.println("Henüz oturum açmadýnýz!");
		}
		
	}
	
	@Override
	public boolean nameVerification(Users user) {
		String regex = "[0-9a-zA-Z]{2,}";
		Pattern pattern = Pattern.compile(regex);

	    Matcher matcher = pattern.matcher(user.getFirstName());
	    Matcher matcherLastName = pattern.matcher(user.getLastName());
		if(matcher.matches()==true && matcherLastName.matches()==true){
			return true;
		}
		else{
			return false;
		}
	}

}
