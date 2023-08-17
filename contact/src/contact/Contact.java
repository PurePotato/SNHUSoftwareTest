package contact;

public class Contact {
	String contactID;
	String firstName;
	String lastName;
	String phone;
	String address; 
	//Constructor
	public Contact(String contactID,String firstName,String lastName,String phone,String address) {
		if(contactID.length() <= 10 && contactID != null) {
		this.contactID = contactID;
		}
		this.setAddress(address);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhoneNumber(phone);
	}
	
	public String getContactID() {
		return contactID;
		}

		public void setContactID(String contactID) {
			if(contactID.length() <= 10 && contactID != null) {
				this.contactID = contactID;
				}
		}

		public String getFirstName() {
		return firstName;
		}

		public void setFirstName(String firstName) {
			if(firstName.length() <= 10 && firstName != null) {
				this.firstName = firstName;
				}
		}

		public String getLastName() {
		return lastName;
		}

		public void setLastName(String lastName) {
			if(lastName.length() <= 10 && lastName != null) {
				this.lastName = lastName;
				}
		}

		public String getPhone() {
		return phone;
		}

		public void setPhoneNumber(String phoneNumber) {
			phoneNumber.matches("\\d{10}") ;
		}

		public String getAddress() {
		return address;
		}

		public void setAddress(String address) {
			if(address.length() <= 30 && address != null) {
				this.address = address;
				}
		}
		//Prints the Contact Information for each contact
		@Override
		public String toString() {
			return "Contact ID:" + contactID + ", First Name=" + firstName + ", Last Name=" + lastName
					+ ", Phone Number=" + phone + ", Address=" + address ;
		}
}
