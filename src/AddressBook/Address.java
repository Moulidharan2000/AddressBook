package AddressBook;

public class Address {
	
	public String city, state;
	public int zipCode;
	
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	public String toString() {
		return "\nCity : "+city+"\nState : "+state+"\nPostal Code : "+zipCode;
	}

}
