package Lab2;

import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;


/**
 * This DisplayName class takes the complete name and email as {@link String} from user checks for email
 * @author srizna
 *
 */
public class DisplayName {
	String initial;
	String first_name;
	String last_name;
	String email;
	String fullname;
	private int choice;
	String[] name;
	

	/**
	 * This method takes user's email.
	 */
	public void enterEmail() {
		System.out.println("Enter your valid email:");
		Scanner mail = new Scanner(System.in);
		email = mail.next();
		if (checkEmail(email)) {
			System.out.println("valid");
		} else {
			enterEmail();
		}
	}
	

	/**
	 * This method takes the user's input.
	 */
	public void enterInputName() {
		System.out.println("Enter your initial:Mr/Ms/Mrs");
		Scanner init = new Scanner(System.in);
		initial = init.next();
		if (initial.equalsIgnoreCase("Ms") || initial.equalsIgnoreCase("Mr")
				|| initial.equalsIgnoreCase("Mrs"))

		{
			System.out.println("Enter your FirstName:");
			Scanner first = new Scanner(System.in);
			first_name = first.next();
			System.out.println("Enter your LastName:");
			Scanner second = new Scanner(System.in);
			last_name = second.next();
			enterEmail();

		} else {
			System.out.println("invalid");
			enterInputName();
		}
	}

	/**
	 * This method checks for validation of  email.
	 * @author srizna
	 * @param email:the input as email.
	 * @return: true if valid email,false if invalid.
	 */
	private boolean checkEmail(String email) {
		// TODO Auto-generated method stub
		if (email
				.matches("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b"))
			return true;
		else {

			return false;
		}

	}

	
	

	/**
	 * This method splits the complete name given by user and stored it into {@link Array} of type {@link String}
	 * @author srizna
	 * @return: the splited name as {@link Array} of type {@link String}.
	 */
	public String[] splitName() {
		fullname = initial +" "+first_name +" "+last_name;
		name = fullname.split(" ");
		
		return (name);
	}
	

	/**
	 * This method provides option to the users to perform different operations.
	 * 
	 */
	public void chooseOption() {
		String[] singlename=splitName(); 
		System.out.println("Enter the number to view your name separately:"
				+ "\n" + "1.To view FullName" + "\n"
				+ "2.To view initial address name only" + "\n"
				+ "3.To view FirstName only" + "\n" + "4.To view LastName only"
				+ "\n" + "5.To view all operations" + "\n" + "6.To Exit");
		Scanner menu_entered = new Scanner(System.in);
		choice = menu_entered.nextInt();
		
		switch (choice) {

		case 1:
			System.out.println(fullname);
			
			break;
		
		 case 2: 
			 
			 if(singlename.length>1){
				 System.out.println("first initial"+"\t" + singlename[0].toUpperCase());
			 }else{
				 System.out.println("the array is empty");
			 }
		  break; 
		 case 3: 
			 System.out.println("Your FirstName is"+"\t" + (singlename[1]).toUpperCase());
			 break;
		 case 4: 
			 System.out.println("Your LastName is"+"\t" + (singlename[2]).toUpperCase());
			 break;
		 case 5:
			 System.out.println("Your FullName Length is"+"\t" +namelength(fullname));
			 System.out.println("Your FirstName is of Length "+"\t"+namelength(first_name));
			 System.out.println("Your LastName is of Length "+"\t"+namelength(last_name));
			 System.out.println("Position of FirstName is at:"+"\t"+ fullname.indexOf(singlename[1]));
			 System.out.println("Position of LastName is at:"+"\t"+ fullname.indexOf(singlename[2]));
			 break;
		 case 6:
			 System.out.println("Thank you..");
			 break;
		 
		}
	}

	/**
	 * This method takes the {@link String} argument and calculates the length of provided parameter
	 * @author srizna
	 * @param name_type: the name passed as argument.
	 * @return:the length of type integer. 
	 */
	private int namelength(String name_type) {
		// TODO Auto-generated method stub
		int full_length=name_type.length();
		return full_length;
	}

	public static void main(String[] arg) {
		DisplayName obj = new DisplayName();
		obj.enterInputName();
		obj.chooseOption();
		


	}

}
