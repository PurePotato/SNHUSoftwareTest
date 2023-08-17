package appointment;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import appointment.Appointment;

class AppointmentServiceTest {
	AppointmentService appointmentService = new AppointmentService();
	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	void testAddAppointmentDuplicateIdFail() { 
		Date appointmentDate = new Date();
		Appointment appt1 = new Appointment("A00001", appointmentDate, "Appointment Description"); 
		Appointment appt2 = new Appointment("A00001", appointmentDate, "Appointment Description"); 		
		assertTrue(appointmentService.addAppointment(appt1)); 
		assertFalse(appointmentService.addAppointment(appt2)); 
		} 
	@Test 
	void testGetAppointmentAndDeleteSuccess() { 
		Date appointmentDate = new Date();
		Appointment appt1 = new Appointment("A00001", appointmentDate, "Appointment Description");
		assertTrue(appointmentService.addAppointment(appt1));
		assertTrue(appointmentService.deleteAppointment(appt1.appointmentID));

	} 
	

}
