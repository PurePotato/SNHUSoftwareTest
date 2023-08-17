package appointment;
import java.util.Date;
/*Appointment Class Requirements

The appointment object shall have a required unique appointment ID string that cannot be longer than 10 characters. The appointment ID shall not be null and shall not be updatable.
The appointment object shall have a required appointment Date field. The appointment Date field cannot be in the past. The appointment Date field shall not be null.
Note: Use java.util.Date for the appointmentDate field and use before(new Date()) to check if the date is in the past.
The appointment object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.
Appointment Service Requirements

The appointment service shall be able to add appointments with a unique appointment ID.
The appointment service shall be able to delete appointments per appointment ID.*/


public class Appointment {
	String appointmentID;
	Date appointmentDate;
	String appointmentDescription;
	
	public Appointment(String appointmentID, Date appointmentDate, String appointmentDescription) {
		if(appointmentID.length() <= 10 && appointmentID != null) {
			this.appointmentID = appointmentID;
			}
		this.setAppointmentDescription(appointmentDescription);
		this.setAppointmentDate(appointmentDate);
	}

	public void setAppointmentDate(Date appointmentDate) {
		if(appointmentDate.before(new Date()) || appointmentDate == null) {
			throw new IllegalArgumentException("Invalid Date");
			}
		this.appointmentDate = appointmentDate;
	}
	
	public void setAppointmentDescription(String appointmentDescription) {
		if(appointmentDescription.length() > 50 || appointmentDescription == null) {
			throw new IllegalArgumentException("Invalid Appointment Description");
			}
		this.appointmentDescription = appointmentDescription;
	}
	
	
	public String getAppointmentID() {
	       return appointmentID;
	   }
	public Date getAppointmentDate() {
	       return appointmentDate;
	   }
	public String getAppointmentDescription() {
	       return appointmentDescription;
	   }
	@Override
	public String toString() {
		return "Task ID:" + appointmentID + ", Name=" + appointmentDate + ", Description=" + appointmentDescription ;
	}

	
}
