package emailapp;
import java.util.Scanner;



public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity= 500;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String companySuffix = "army.com";
	
	//Constructor to receive the first name and last name
	//Ask for the department
	//Generate a random password 
	//set the mailbox capacity
	//set the alternate email
	//change the password
	
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName=lastName;

		
		this.department=setDepartment();
		
		
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is :" + this.password);
		
		
		email= firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "."+ companySuffix;
		
	}
	
	
	private String setDepartment() {
		System.out.println("New Worker: " + firstName + ". department Codes: \n 1: for Sales \n 2: for Development \n 3: for Accounting \n 0: for None \n Enter Department Code");
		Scanner in = new Scanner(System.in);
		int depChoice= in.nextInt();
		if (depChoice == 1) { return "Sales";}
		else if(depChoice == 2) {return "Dev";}
		else if (depChoice == 3) {return "Account";}
		else {return "";}
		
		
	}

private String randomPassword(int length) {
	String passwordSet = "ABCEDFGHIJKLMNOQRSTUWXYZ123456789";
	char[] password = new char[length];
	for(int i=0;i<length;i++) {
		int rand = (int) (Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(rand);
	
	}
	
	return new String(password);
}
public void setMailboxCapacity(int capacity) {
	this.mailboxCapacity = capacity;
}

public void setAlternateEmail(String altEmail) {
	this.alternateEmail= altEmail;
	
}
public void changePassword(String password) {
	this.password=password;
}
public int getMailboxCapacity() {return mailboxCapacity; }
public String getAlternateEmail() {return alternateEmail;}
public String getPassword() {return password;}



public String showInfo () {
	return "DISPLAY NAME: " + firstName + " " +lastName+
		    "\nCompany Email: " + email +
			"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
}


}
