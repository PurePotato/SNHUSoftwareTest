package task;

public class Task {
/*The task object shall have a required unique task ID String 
 * that cannot be longer than 10 characters. The task ID shall
 *  not be null and shall not be updatable.
The task object shall have a required name String field 
that cannot be longer than 20 characters. The name field 
shall not be null.
The task object shall have a required description 
String field that cannot be longer than 50 characters.
 The description field shall not be null.*/
	
	String taskID;
	String taskName;
	String taskDescription;
	
	public Task(String taskID, String taskName, String taskDescription) {
		if(taskID.length() > 10 || taskID == null) {
			throw new IllegalArgumentException("Invalid Task ID");
			}
		this.taskID = taskID;
		this.setTaskDescription(taskDescription);
		this.setTaskName(taskName);
	}

	public void setTaskName(String taskName) {
		if(taskName.length() >20 || taskName == null) {
			throw new IllegalArgumentException("Invalid Task Name");
			}
		this.taskName = taskName;
	}
	
	public void setTaskDescription(String taskDescription) {
		if(taskDescription.length() > 50 || taskDescription == null) {
			throw new IllegalArgumentException("Invalid Task Description");
			}
		this.taskDescription = taskDescription;
	}
	
	
	public String getTaskName() {
		return taskName;
	}
	
	public String getTaskDescription() {
		return taskDescription;
	}
	
	public String getTaskID() {
		return taskID;
	}
	@Override
	public String toString() {
		return "Task ID:" + taskID + ", Name=" + taskName + ", Description=" + taskDescription ;
	}
}
