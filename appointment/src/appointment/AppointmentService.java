package appointment;

import java.util.ArrayList;



public class AppointmentService {
	public ArrayList<Appointment> appointmentList;
	public AppointmentService() {
		appointmentList = new ArrayList<>();
	}
	//Adds new Contact to contactList array
	public boolean addAppointment(Appointment newAppointmentInfo) {
		boolean exists = false;
		for(Appointment appointment : appointmentList) {
			if(appointment.getAppointmentID().equalsIgnoreCase(newAppointmentInfo.getAppointmentID())) {
				exists = true;
				break;
			}
		}
		if(!exists) {
			appointmentList.add(newAppointmentInfo);
			return true;
		}else {
			return false;
		}
	}
	//Deletes existing Contact from contactList array	
	public boolean deleteAppointment(String appointmentID) {
		boolean exists = false;
		for(Appointment appointment : appointmentList) {
			if(appointment.getAppointmentID().equalsIgnoreCase(appointmentID)) {
				appointmentList.remove(appointment);
				exists = true;
				break;
			}
		}
		return exists;
	}
}
