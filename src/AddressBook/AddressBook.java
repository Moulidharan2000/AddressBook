package AddressBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {
	Scanner scannerObject = new Scanner(System.in);
	ArrayList<ContactPersonDetails> contactList = new ArrayList<ContactPersonDetails>();
	
	public void operation() {

        boolean moreChanges = true;
        while(moreChanges)   {

            System.out.println("\nChoose the operation you want to perform");
            System.out.println("1.Add To Address Book"
            		+ "\n2.Edit Existing Entry\n"
            		+ "3.Display Address book"
            		+ "\n4.Exit Address book System");
            int num = scannerObject.nextInt();
            switch (num) {
                case 1:
                    addContact();
                    break;
                case 2:
                    editPerson();
                    break;
                case 3:
                    displayContents();
                    break;
                case 4:
                    moreChanges = false;
                    System.out.println("Exit");
            }

        }
    }
    public void addContact() {
        ContactPersonDetails person = new ContactPersonDetails();
        Address address = new Address();


        System.out.println("Enter First Name: ");
        String firstName = scannerObject.nextLine();

        System.out.println("Enter Last Name: ");
        String lastName = scannerObject.nextLine();

        System.out.println("Enter City: ");
        String city = scannerObject.nextLine();

        System.out.println("Enter State: ");
        String state = scannerObject.nextLine();

        System.out.println("Enter Zip Code: ");
        long zipCode = scannerObject.nextLong();
        

        System.out.println("Enter Phone Number: ");
        long phoneNumber = scannerObject.nextLong();

        System.out.println("Enter Email: ");
        String email = scannerObject.nextLine();




        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setphoneNumber(phoneNumber);
        person.setEmail(email);
        address.setCity(city);
        address.setState(state);
        address.setZipCode(zipCode);
        person.setAddress(address);
        contactList.add(person);

    }
    public void editPerson() {

        System.out.println("Enter the first name:");
        String firstName = scannerObject.next();
        Iterator<ContactPersonDetails> iterator = contactList.listIterator();

        while(iterator.hasNext()) {

            ContactPersonDetails person = iterator.next();

            if(firstName.equals(person.getFirstName()) ) {

                Address address = person.getaddress();
                System.out.println("\nChoose the attribute you want to change:");
                System.out.println("1.Last Name\n2.Phone Number\n3.Email\n4.City\n5.State\n6.ZipCode");
                int choice = scannerObject.nextInt();

                switch(choice) {
                    case 1:
                        System.out.println("Enter the correct Last Name :");
                        String lastName = scannerObject.next();
                        person.setFirstName(lastName);
                        break;
                    case 2:
                    	 System.out.println("Enter the correct City :");
                         String city = scannerObject.next();
                         address.setCity(city);
                         break;
                    case 3:                     
                        System.out.println("Enter the correct State :");
                        String state = scannerObject.next();
                        address.setState(state);
                        break;
                        
                    case 4:
                    	System.out.println("Enter the correct ZipCode :");
                        long zip = scannerObject.nextLong();
                        address.setZipCode(zip);
                        break;
                        
                    case 5:
                        System.out.println("Enter the correct Phone Number :");
                        long phoneNumber = scannerObject.nextLong();
                        person.setphoneNumber(phoneNumber);
                        break;
                        
                    case 6:
                    	 System.out.println("Enter the correct Email Address :");
                         String email = scannerObject.next();
                         person.setEmail(email);
                         break;
                }

            }
        }

    }
    public void displayContents() {

        Iterator<ContactPersonDetails> iterator = contactList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
