package AddressBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook implements AddressBookIF {
    Scanner scannerObject = new Scanner(System.in);
    public Map<String, ContactPersonDetails> contactList = new HashMap<String,ContactPersonDetails>();
    public static HashMap<String, ArrayList<ContactPersonDetails>> personByCity  = new HashMap<String, ArrayList<ContactPersonDetails>>();
    public static HashMap<String, ArrayList<ContactPersonDetails>> personByState = new HashMap<String, ArrayList<ContactPersonDetails>>();
    public String addressBookName;
    public boolean isPresent = false;

    public String getAddressBookName() {
        return addressBookName;
    }
    public void setAddressBookName(String addressBookName) {
        this.addressBookName = addressBookName;
    }
    public ArrayList<ContactPersonDetails> getContact() {
        return new ArrayList<ContactPersonDetails>(contactList.values());
    }
    public void operation() {
        boolean moreChanges = true;
        do {
            System.out.println("\nChoose the operation you want to perform");
            System.out.println(
                    "1.Add To Address Book\n2.Edit Existing Entry\n3.Display Address book\n4.Delete Contact\n5.Exit Address book System");
            switch (scannerObject.nextInt()) {
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
                    deletePerson();
                    break;
                case 5:
                    moreChanges = false;
                    System.out.println("Exiting Address Book: "+this.getAddressBookName()+" !");
            }
        } while (moreChanges);
    }
    public void addContact() {
        ContactPersonDetails person = new ContactPersonDetails();
        Address address = new Address();

        System.out.println("Enter First Name: ");
        String firstName = scannerObject.next();

        contactList.entrySet().stream().forEach(entry -> {
            if(entry.getKey().equals(firstName.toLowerCase())) {
                System.out.println("Contact Already Exists");
                isPresent = true;
                return;
            }
        });
        if(isPresent == false) {
            System.out.println("Enter Last Name: ");
            String lastName = scannerObject.next();

            System.out.println("Enter Phone Number: ");
            long phoneNumber = scannerObject.nextLong();

            System.out.println("Enter Email: ");
            String email = scannerObject.next();

            System.out.println("Enter City: ");
            String city = scannerObject.next();

            System.out.println("Enter State: ");
            String state = scannerObject.next();

            System.out.println("Enter Zip Code: ");
            long zipCode = scannerObject.nextLong();

            person.setFirstName(firstName);
            person.setLastName(lastName);
            person.setphoneNumber(phoneNumber);
            person.setEmail(email);
            address.setCity(city);
            address.setState(state);
            address.setZipCode(zipCode);
            person.setAddress(address);
            addPersonToCity(person);
            addPersonToState(person);
            contactList.put(firstName.toLowerCase(), person);
        }
    }
    public void addPersonToCity(ContactPersonDetails contact) {
        if (personByCity.containsKey(contact.getaddress().getCity())) {
            personByCity.get(contact.getaddress().getCity()).add(contact);
        }
        else {
            ArrayList<ContactPersonDetails> cityList = new ArrayList<ContactPersonDetails>();
            cityList.add(contact);
            personByCity.put(contact.getaddress().getCity(), cityList);
        }
    }
    public void addPersonToState(ContactPersonDetails contact) {
        if (personByState.containsKey(contact.getaddress().getState())) {
            personByState.get(contact.getaddress().getState()).add(contact);
        }
        else {
            ArrayList<ContactPersonDetails> stateList = new ArrayList<ContactPersonDetails>();
            stateList.add(contact);
            personByState.put(contact.getaddress().getState(), stateList);
        }
    }
    public void editPerson() {
        ContactPersonDetails person = new ContactPersonDetails();

        System.out.println("Enter the first name:");
        String firstName = scannerObject.next();
        if(contactList.containsKey(firstName)) {
            person = contactList.get(firstName);

            Address address = person.getaddress();
            System.out.println("\nChoose the attribute you want to change:");
            System.out.println("1.Last Name\n2.Phone Number\n3.Email\n4.City\n5.State\n6.ZipCode");
            int choice = scannerObject.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the correct Last Name :");
                    String lastName = scannerObject.next();
                    person.setLastName(lastName);
                    break;
                case 2:
                    System.out.println("Enter the correct Phone Number :");
                    long phoneNumber = scannerObject.nextLong();
                    person.setphoneNumber(phoneNumber);
                    break;
                case 3:
                    System.out.println("Enter the correct Email Address :");
                    String email = scannerObject.next();
                    person.setEmail(email);
                    break;
                case 4:
                    System.out.println("Enter the correct City :");
                    String city = scannerObject.next();
                    address.setCity(city);
                    break;
                case 5:
                    System.out.println("Enter the correct State :");
                    String state = scannerObject.next();
                    address.setState(state);
                    break;
                case 6:
                    System.out.println("Enter the correct ZipCode :");
                    long zip = scannerObject.nextLong();
                    address.setZipCode(zip);
                    break;
            }
        }
        else {
            System.out.println("Book Does Not Exist");
        }
    }
    public void deletePerson() {
        System.out.println("Enter the first name of the person to be deleted");
        String firstName = scannerObject.next();
        if(contactList.containsKey(firstName)) {
            contactList.remove(firstName);
            System.out.println("Successfully Deleted");
        }
        else {
            System.out.println("Contact Not Found!");
        }
    }
    public void displayContents() {
        System.out.println("----- Contents of the Address Book "+this.getAddressBookName()+" -----");
        for (String eachContact : contactList.keySet()) {
            ContactPersonDetails person = contactList.get(eachContact);
            System.out.println(person);
        }
    }
}