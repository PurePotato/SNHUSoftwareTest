package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	ContactService contactService = new ContactService();
			@Test 

			void testAddContactDuplicateIdFail() { 

			Contact contact1 = new Contact("123457", "Omar", "Toledo", "1112 E Road Street", "5613665975"); 
			Contact contact2 = new Contact("123457", "Nicholas", "Renna", "1111 E Road Street", "4802929112"); 		
			assertTrue(contactService.addContact(contact1)); 
			assertFalse(contactService.addContact(contact2)); 
			} 
			 

			@Test 

			void testGetContactAndUpdateSuccess() { 

			Contact contact1 = new Contact("1234", "Omar", "Toledo", "1111 E Road Street", "5616998652"); 
			assertTrue(contactService.addContact(contact1)); 

			//Now update using the setters 
			assertTrue(contactService.updateContactFirstName(contact1.contactID, "Erin"));
			assertTrue(contactService.updateContactLastName(contact1.contactID, "Glass"));
			assertTrue(contactService.updateContactPhone(contact1.contactID, "3849204444"));
			assertTrue(contactService.updateContactFirstName(contact1.contactID, "1133 E Road Street"));
			}
			 

			@Test 

			void testGetContactAndDeleteSuccess() { 

			//create a contact contact1 
				Contact contact1 = new Contact("1234", "Omar", "Toledo", "1111 E Road Street", "5616998652"); 
				assertTrue(contactService.addContact(contact1));
				assertTrue (contactService.deleteContact(contact1.contactID)); 
			} 
	}

