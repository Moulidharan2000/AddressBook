package AddressBook;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args)  {

        AddressBook addressBook = new AddressBook();
        addressBook.operation();
        addressBook.addContact();
        addressBook.editPerson();
        addressBook.deletePerson();
        addressBook.displayContents();
       
        
	}

		
}

