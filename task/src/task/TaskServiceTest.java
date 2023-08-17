package task;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaskServiceTest {
	TaskService taskService = new TaskService();
	@Test
	void testAddTaskDuplicateIdFail() { 
		Task task1 = new Task("123457", "Omar", "Toledo"); 
		Task task2 = new Task("123457", "Nicholas", "Renna"); 
		assertTrue(taskService.addTask(task1)); 
		assertFalse(taskService.addTask(task2)); 
		} 

@Test 
void testGetTaskAndUpdateSuccess() { 
	Task task1 = new Task("1234", "Tasnk Name", "Task description"); 
	assertTrue(taskService.addTask(task1)); 
	task1.setTaskName("New task name");
	assertTrue(task1.getTaskName() == "New task name");
}
 
@Test 
void testUpdateSuccess() { 
	Task task1 = new Task("1234", "Tasnk Name", "Task description"); 
	assertTrue(taskService.addTask(task1)); 
	taskService.updateTask(task1.taskID,"New task name", "New task Description");
	assertTrue(task1.getTaskName() == "New task name");
	assertTrue(task1.getTaskDescription() == "New task Description");
}
 

@Test 
void testGetTaskAndDeleteSuccess() { 
Task task1 = new Task("1234", "Tasnk Name", "Task description"); 
assertTrue(taskService.addTask(task1)); 
assertTrue(taskService.deleteTask(task1.taskID)); 
} 
@Test
void testPrint() {
	Task task1 = new Task("1234", "Tasnk Name", "Task description"); 
	Task task2 = new Task("5678", "Task Name", "Task description2"); 
	taskService.addTask(task1);
	taskService.addTask(task2);
	taskService.taskListInfo();
}
}

