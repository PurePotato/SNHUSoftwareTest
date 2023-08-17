package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void test() {
		try {
		Contact con1 = new Contact("234", "Caitlyn", "Murphy", "7778889999", "Atlanta,GA");
		
		System.out.println(con1.getContactID());
		System.out.println(con1.getFirstName());
		System.out.println(con1.getLastName());
		System.out.println(con1.getPhone());
		System.out.println(con1.getAddress());
		}catch (Exception e){
			fail(e.getMessage());
		}
	}
	   @Test 
	void testCreateContactSuccess() { 
	Contact contact = new Contact("123456", "Omar", "Toledo", "5645 Pacific blvd", "5616998563"); 
	assertTrue(contact != null); 
	assertTrue(contact.getContactID().equals("123456")); 
	assertTrue(contact.getFirstName().equals("Omar")); 
	assertTrue(contact.getFirstName().equals("Toledo"));
	assertTrue(contact.getFirstName().equals("645 Pacific blvd"));
	assertTrue(contact.getFirstName().equals("5616998563"));
	} 

	@Test 
	void testCreateContactContactIdFails() { 
	  Assertions.assertThrows(IllegalArgumentException.class, () -> { 
	  new Contact("12345678901", "Omar", "Toledo", "5645 Pacific blvd ", "5616998563"); 
	    });  
	} 

	 

	@Test 
	void testCreateContactFirstNameFails() { 
	  Assertions.assertThrows(IllegalArgumentException.class, () -> { 
	  new Contact("123456", "Omarrrrrrrrrrr", "Toledo", "1111 E Road Street", "4802929112"); 
	    });  

	} 

	 

	@Test 

	void testCreateContactLastNameFails() { 

	  Assertions.assertThrows(IllegalArgumentException.class, () -> { 

		  new Contact("123456", "Omar", "Toledooooooo", "1111 E Road Street", "4802929112");});  

	} 

	 

	@Test 

	void testCreateContactAddressFails() { 

	  Assertions.assertThrows(IllegalArgumentException.class, () -> { 

		  new Contact("123456", "Omar", "Toledo", "151 George Washington Boulevard, D.C.", "4802929112");

	    });  

	} 

	 

	@Test 

	void testCreateContactNumberToLongFails() { 

	  Assertions.assertThrows(IllegalArgumentException.class, () -> { 

		  new Contact("123456", "Omar", "Toledo", "5645 Pacific blvd", "56169985630000");

	    });  

	} 

	 
	@Test 

	void testCreateContactNumberToShortFails() { 

	  Assertions.assertThrows(IllegalArgumentException.class, () -> { 

		  new Contact("123456", "Omar", "Toledo", "5645 Pacific blvd", "56169985");

	    });  

	} 
 

}
