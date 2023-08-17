package contact;

import java.util.ArrayList;

public class ContactService {
	
	public ArrayList<Contact> contactList;
	public ContactService() {
		contactList = new ArrayList<>();
	}
	//Adds new Contact to contactList array
	public boolean addContact(Contact newContactInfo) {
		boolean exists = false;
		for(Contact contact : contactList) {
			if(contact.getContactID().equalsIgnoreCase(newContactInfo.getContactID())) {
				exists = true;
				break;
			}
		}
		if(!exists) {
			contactList.add(newContactInfo);
			return true;
		}else {
			return false;
		}
	}
	//Deletes existing Contact from contactList array	
	public boolean deleteContact(String contactID) {
		boolean exists = false;
		for(Contact contact : contactList) {
			if(contact.getContactID().equalsIgnoreCase(contactID)) {
				contactList.remove(contact);
				exists = true;
				break;
			}
		}
		return exists;
	}
	//Updates existing Contact First Name in contactList array
	public boolean updateContactFirstName(String contactID, String newFirst) {
		boolean update = false;
		for(Contact con : contactList) {
			if(con.getContactID().equalsIgnoreCase(contactID)) {
				con.setFirstName(newFirst);
				update = true;
				break;
			}
		}
		return update;
	}
	//Updates existing Contact Last Name in contactList array
	public boolean updateContactLastName(String contactID, String newLast) {
		boolean update = false;
		for(Contact con : contactList) {
			if(con.getContactID().equalsIgnoreCase(contactID)) {
				con.setLastName(newLast);
				update = true;
				break;
			}
		}
		return update;
	}
	//Updates existing Contact Phone Number in contactList array
	public boolean updateContactPhone(String contactID, String newPhone) {
		boolean update = false;
		for(Contact con : contactList) {
			if(con.getContactID().equalsIgnoreCase(contactID)) {
				con.setPhoneNumber(newPhone);
				update = true;
				break;
			}
		}
		return update;
	}
	//Updates existing Contact Address in contactList array
	public boolean updateContactAddress(String contactID, String newAddress) {
		boolean update = false;
		for(Contact con : contactList) {
			if(con.getContactID().equalsIgnoreCase(contactID)) {
				con.setAddress(newAddress);
				update = true;
				break;
			}
		}
		return update;
	}
	//Lists all contacts in the contactList array
	public void contactListInfo() {
		for(Contact c: contactList) {
			System.out.println(c.toString());
		}
	}
}
