package task;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;


class TaskTest {
	@Test 
public void testCreateTaskSuccess() { 

	Task task = new Task("123456", "Task1", "Task1 Description");  
	assertTrue(task != null); 
	assertTrue(task.getTaskID().equals("123456")); 
	assertTrue(task.getTaskName().equals("Task1")); 
	assertTrue(task.getTaskDescription().equals("Task1 Description")); 

} 
	@Test 
	public void testCreateTaskTaskIdFails() { 
         Assertions.assertThrows(NullPointerException.class, () -> { 
              new Task(null, "Task", "Task1 descr"); 
            });     
    } 
 
	@Test 
	public void testCreateTaskTaskIdLongFails() { 
         Assertions.assertThrows(IllegalArgumentException.class, () -> { 
              new Task("123456789012345", "Task", "Task1 descr"); 
            });     
    } 
	
	@Test 
	public void testCreateTaskNameFails() { 
	
		Assertions.assertThrows(IllegalArgumentException.class, () -> { 
            new Task("123456", "This is a very long task name for the taskname test. ", "task description"); 
          }); 
} 
 
	@Test 
	public void testCreateTaskDescriptionFails() { 
		Assertions.assertThrows(IllegalArgumentException.class, () -> { 
            new Task("1234", "Task1", "eu volutpat odio facilisis mauris sit amet massa vitae tortor condimentum lacinia quis vel eros donec ac odio tempor orci dapibus ultrices in iaculis nunc sed augue lacus viverra vitae congue eu consequat ac felis donec et odio pellentesque diam volutpat commodo sed egestas egestas fringilla phasellus faucibus scelerisque eleifend"); 
          });
} 


}
