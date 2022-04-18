package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private String courses;
	private String studentID;
	private int gradeYear;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Students First Name: ");
		this.firstName = in.nextLine();

		System.out.println("Enter the Students Last Name: ");
		this.lastName = in.nextLine();

		System.out
				.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\n Please Enter the students class level");
		this.gradeYear = in.nextInt();

		setStudentID();

		in.close();
	}

	private void setStudentID() {

		id++;
		this.studentID = gradeYear + " " + id;
	}

	public void enroll() {

		do {
			System.out.print("Please Enter the Course that you want to enroll in (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();

			if (!course.equalsIgnoreCase("Q")) {
				courses = courses + "\n  " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {

				break;
			}

			in.close();

		} while (1 != 0);

	}

	public void viewBalance() {

		System.out.println("Your Balance is: $" + tuitionBalance);
	}

	public void payTuition() {

		viewBalance();
		System.out.print("Enter the payment amount: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();

		in.close();
	}

	public String showInfo() {

		return "Name: " + firstName + " " + lastName + "\nGrade: " + gradeYear + "\nStudent ID: " + studentID
				+ "\nCourses Enrolled: " + courses + "\nBalance: $" + tuitionBalance;
	}

}
