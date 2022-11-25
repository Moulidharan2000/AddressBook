package AddressBook;

public class AddressBookMain {
	public static void main(String[] args)  {
		
		System.out.print("Welcome To The Address Book Program");
		
        AddressBook addressBook = new AddressBook();
        addressBook.operation();
        addressBook.addContact();
        addressBook.editPerson();
        addressBook.deletePerson();
        addressBook.displayContents();
       AddressBookDirectory Directory = new AddressBookDirectory();
       Directory.operationDirectory();
       
        
	}

		
}

