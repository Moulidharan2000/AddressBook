package AddressBook;

import java.util.ArrayList;
import java.util.Iterator;

public class AddressBook {
		ArrayList<ContactPersonDetails> contactList = new ArrayList<ContactPersonDetails>();
		
		public void addContacts(ContactPersonDetails person) {
			contactList.add(person);
	    }
	    public void displayContents() {

	        Iterator<ContactPersonDetails> iterator = contactList.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
}
