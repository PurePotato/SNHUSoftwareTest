package task;

import java.util.ArrayList;
import task.Task;

public class TaskService {
	public ArrayList<Task> taskList;
	public TaskService() {
		taskList = new ArrayList<>();
	}
	//Adds new Task to taskList array
	public boolean addTask(Task newTask) {
		boolean exists = false;
		for(Task task : taskList) {
			if(task.getTaskID().equalsIgnoreCase(newTask.getTaskID())) {
				exists = true;
				break;
			}
		}
		if(!exists) {
			taskList.add(newTask);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean deleteTask(String taskID) {
		boolean exists = false;
		for(Task task : taskList) {
			if(task.getTaskID().equalsIgnoreCase(taskID)){
				taskList.remove(taskID);
				exists = true;
				break;
			}
		}
		return exists;
		}
	
	
	public boolean updateTask(String taskID, String newTaskName, String newTaskDescription) {
		boolean update = false;
		for(Task task : taskList) {
			if(task.getTaskID().equalsIgnoreCase(taskID)) {
				task.setTaskName(newTaskName);
				task.setTaskDescription(newTaskDescription);
				update = true;
				break;
			}
		}
		return update;
	}
	
	public void taskListInfo() {
		for(Task t: taskList) {
			System.out.println(t.toString());
		}
	}
}
