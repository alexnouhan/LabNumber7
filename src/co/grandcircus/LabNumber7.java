package co.grandcircus;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LabNumber7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(nameValidator(scan, "Enter a name: "));
		
		System.out.println(emailValidator(scan, "Enter an email address: "));
		
		System.out.println(phoneValidator(scan, "Enter a phone number: "));
		
		System.out.println(dateValidator(scan, "Enter a date (dd/mm/yyyy): "));
		
		scan.close();
	}

	public static String nameValidator(Scanner scan, String prompt) {
		String name = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			name = scan.next();
			if (Pattern.matches("^[A-Z][a-z]{1,30}", name)) {
				isValid = true;
			} else {
				System.out.println("Not a valid name! Try again: ");
			}
			scan.nextLine();
		}
		return name;
	}
	
	public static String emailValidator(Scanner scan, String prompt) {
		String email = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			email = scan.next();
			if (Pattern.matches("[A-Za-z0-9]{5,30}@[A-Za-z0-9]{5,10}\\.[A-Za-z0-9]{2,3}", email)) {
				isValid = true;
			} else {
				System.out.println("Not a valid email! Try again: ");
			}
			scan.nextLine();
		}
		return email;
	}
	public static String phoneValidator(Scanner scan, String prompt) {
		String phone = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			phone = scan.next();
			if (Pattern.matches("\\d{3}-\\d{3}-\\d{4}", phone)) {
				isValid = true;
			} else {
				System.out.println("Not a valid phone number! Try again: ");
			}
			scan.nextLine();
		}
		return phone;
	}
	public static String dateValidator(Scanner scan, String prompt) {
		String date = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			date = scan.next();
			if (Pattern.matches("[0-3][1-9]\\/[0-3][1-9]\\/\\d{4}", date)) {
				isValid = true;
			} else {
				System.out.println("Not a valid date! Try again: ");
			}
			scan.nextLine();
		}
		return date;
	}


}
