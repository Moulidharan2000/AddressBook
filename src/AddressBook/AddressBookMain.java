package AddressBook;

import java.util.Scanner;

public class AddressBookMain {

    

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactPersonDetails person = new ContactPersonDetails();
		Address address = new Address();
		System.out.println("WELCOME TO ADDRESS BOOK PROGRAM");
		
		ContactPersonDetails person1 = new ContactPersonDetails();
        Address address1 = new Address();
        Scanner scannerObject = new Scanner(System.in);

        System.out.print("Enter First Name : ");
        String firstName = scannerObject.next();

        System.out.print("Enter Last Name : ");
        String lastName = scannerObject.next();
        
        System.out.print("Enter City : ");
        String city = scannerObject.next();

        System.out.print("Enter State : ");
        String state = scannerObject.next();

        System.out.print("Enter Phone Number : ");
        long phoneNumber = scannerObject.nextLong();

        System.out.print("Enter Email : ");
        String email = scannerObject.next();
        
        System.out.print("Enter Zip Code : ");
        long zipCode = scannerObject.nextLong();

        scannerObject.close();

        person1.setFirstName(firstName);
        person1.setLasteName(lastName);
        person1.setphoneNumber(phoneNumber);
        person1.setEmail(email);
        address1.setCity(city);
        address1.setState(state);
        address1.setZipCode(zipCode);
        person1.setAddress(address1);

        AddressBook addressBook = new AddressBook();
        addressBook.addContacts(person1);
        addressBook.displayContents();
        
	}

		
}

