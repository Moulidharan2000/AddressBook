package AddressBook;

public class ContactPersonDetails {
	String firstName, lastName, email;
	long phoneNumber ;
	Address address;
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public long phoneNumber() {
		return phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public Address getaddress() {
		return address;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastename(String lastName) {
		this.lastName = lastName;
	}
	public void setphoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String toString() {
		return "Person Details : \nFirstName : \n"+firstName+" "+lastName+"\nAddress : "+address+"\nPhone Number : "+phoneNumber+"\nEmail : "+email;
	}
	

}
