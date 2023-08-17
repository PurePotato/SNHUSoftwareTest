package appointment;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class AppointmentTests {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testCreateTaskSuccess() { 
		Appointment appointment = new Appointment("A00001", new Date(), "Appointment Description");  
		assertTrue(appointment != null); 
		assertTrue(appointment.getAppointmentID().equals("A00001")); 
		assertTrue(appointment.getAppointmentDate().equals(appointment.getAppointmentDate())); 
		assertTrue(appointment.getAppointmentDescription().equals("Appointment Description")); 
	} 
	
	@Test
    public void testAppointmentID() {
        Appointment appointment = new Appointment("A00002", new Date(), "Appointment Description");
        assertEquals("A00002", appointment.getAppointmentID());
    }

	@Test
    public void testAppointmentDate() {
        Date appointmentDate = new Date();
        Appointment appointment = new Appointment("A00001", appointmentDate, "Appointment Description");
        assertEquals(appointmentDate, appointment.getAppointmentDate());
    }
	
	@Test
    public void testAppointmentDescription() {
        Date appointmentDate = new Date();
        Appointment appointment = new Appointment("A00001", appointmentDate, "Appointment Description");
        assertEquals("Appointment Description", appointment.getAppointmentDescription());
    }
    
	@Test 
	public void testCreateAppointmentIDFails() { 
		Date appointmentDate = new Date();
        Appointment appointment = new Appointment("A00001", appointmentDate, "Appointment Description");
		Assertions.assertThrows(IllegalArgumentException.class, () -> { 
			new Appointment("A00001", appointmentDate, "Appointment Description"); 
          });
	}
	
	@Test 
	public void testCreateAppointmentDateFails() { 
		Date appointmentDate = new Date();
        Appointment appointment = new Appointment("A00001", appointmentDate, "Appointment Description");
		Assertions.assertThrows(IllegalArgumentException.class, () -> { 
			new Appointment("A00001", appointmentDate, "Appointment Description"); 
          });
	}

}
