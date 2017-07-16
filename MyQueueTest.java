package project3;

import static org.junit.Assert.*;
import org.junit.Test;

/** This class consists of the unit tests for 
 * testing the MyQueue class.
 * @author Kelly Xie
 * @author Joanna Klukowska recitation notes
 */
public class MyQueueTest {
	
	/* Test the default constructor.
	 * Create an object of MyQueue, assign it to a reference variable, 
	 * and test if the reference variable points to null.
	 */
	@Test
	public void testMyQueue() {
		try {
			MyQueue<Integer> testQueue = new MyQueue<Integer>();
			assertNotNull("Default constructor returned null reference.", testQueue);
		
		}
		catch (Exception e) {
			fail("testMyQueue failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}
	
	/* Test the default constructor.
	 * Create an object of MyQueue and assign it to a reference variable, 
	 * and then test if the object is empty.
	 */
	@Test
	public void testMyQueue2() {
		try {
			MyQueue<Integer> testQueue = new MyQueue<Integer>();
			assertNull("Default constructor returned empty.", testQueue.peek());
		
		}
		catch (Exception e) {
			fail("testMyQueue2 failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}
	
	/* Test the default constructor with a
	 * data type other than Integer. (i.e. String type)
	 */
	@Test
	public void testMyQueue3() {
		try {
			MyQueue<String> testQueue = new MyQueue<String>();
			String data = new String("Hello World");
			testQueue.offer(data);
			assertEquals("Default constructor returned expected value.", data, 
					testQueue.peek());
		
		}
		catch (Exception e) {
			fail("testMyQueue3 failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}
	
	/* Test the peek method.
	 * Store data as nodes to the test queue, and then
	 * retrieve the top element.
	 * Check that method retrieves but does not remove the
	 * head of this queue.
	 */
	@Test
	public void testPeek() {
		try {
			MyQueue<Integer> testQueue = new MyQueue<Integer>();
			Integer data = new Integer("123");
			testQueue.offer(data);
			Integer data2 = new Integer("456");
			testQueue.offer(data2);
			Integer data3 = new Integer("789");
			testQueue.offer(data3);
			assertEquals("Peek method returns expected value.", 
					data, testQueue.peek());
		
		}
		catch (Exception e) {
			fail("testPeek failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}
	
	/* Test the peek method.
	 * Retrieve the top element of an empty queue.
	 * Check that method returns null when the queue is empty.
	 */
	@Test
	public void testPeek2() {
		try {
			MyQueue<Integer> testQueue = new MyQueue<Integer>();
			assertNull("Peek method on an empty queue returned null.", testQueue.peek());
		
		}
		catch (Exception e) {
			fail("testPeek2 failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}
	
	/* Test the poll method.
	 * Check that method returns null if queue is empty.
	 */
	@Test
	public void testPoll() {
		try {
			MyQueue<Integer> testQueue = new MyQueue<Integer>();
			assertNull("Poll method on an empty queue returned null.", testQueue.poll());
		
		}
		catch (Exception e) {
			fail("testPoll failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}
	
	/* Test the poll method.
	 * Attempt to retrieve and remove
	 * the top element from a queue with 1 node.
	 * This should empty the queue.
	 */
	@Test
	public void testPoll2() {
		try {
			MyQueue<Integer> testQueue = new MyQueue<Integer>();
			Integer data = new Integer("123456");
			testQueue.offer(data);
			assertNotNull("Queue is not empty.", testQueue.peek());
			assertEquals("Poll method returns expected value.", 
					data, testQueue.poll()); // remove element
			assertNull("Queue is now empty.", testQueue.peek());
			
		}
		catch (Exception e) {
			fail("testPoll2 failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}
	
	/* Test the poll method.
	 * Add elements to the queue. Continuously retrieve and remove
	 * the top element. The method should return the value 
	 * of the last added node in FIFO order.
	 */
 	@Test
	public void testPoll3() {
 		try {
			MyQueue<Integer> testQueue = new MyQueue<Integer>();
			Integer data = new Integer("123");
			testQueue.offer(data);
			Integer data2 = new Integer("456");
			testQueue.offer(data2);
			Integer data3 = new Integer("789");
			testQueue.offer(data3);
			
			assertEquals("Before pop, peek method returns top element in the queue.", 
					data, testQueue.peek());
			// remove third added element
			assertEquals("Pop method returns expected value.", data, testQueue.poll());
			assertEquals("After pop, peek method returns the new top element in the queue.", 
					data2, testQueue.peek());
			// remove second added element
			assertEquals("Pop method returns expected value.", data2, testQueue.poll());
			assertEquals("After pop, peek method returns the new top element in the queue.", 
					data3, testQueue.peek());
			// remove first added element
			assertEquals("Pop method returns expected value.", data3, testQueue.poll());
			assertNull("Queue is now empty.", testQueue.peek());
		
		}
		catch (Exception e) {
			fail("testPoll3 failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}
	
	/* Test the offer method.
	 * Check whether method returns a boolean value.
	 */
	@Test
	public void testOffer() {
		try {
			MyQueue<Integer> testQueue = new MyQueue<Integer>();
			Integer data = new Integer("4321");
			assertTrue("Poll method returned a boolean.", 
					testQueue.offer(data) == true || testQueue.offer(data) == false);
		
		}
		catch (Exception e) {
			fail("testPoll failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}
	
	/* Test the offer method.
	 * Add an element to the queue, and test if the object is empty
	 * and if the node has been successfully inserted into the queue.
	 */
	@Test
	public void testOffer2() {
		try {
			MyQueue<Integer> testQueue = new MyQueue<Integer>();
			Integer data = new Integer("9");
			testQueue.offer(data);
			assertNotNull("Queue is not empty.", testQueue.peek());
			
			// check that queue should have 1 element
			int countElements = 0;
			while (testQueue.peek() != null) {
				testQueue.poll();
				countElements++;
			}
			assertEquals("Queue has expected number of elements.", 1, countElements);
			
		}
		catch (Exception e) {
			fail("testPush failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}
	
	/* Test the offer method.
	 * Add multiple elements to the queue, and test whether 
	 * the total number of elements inserted is correct.
	 */
	@Test
	public void testOffer3() {
		try {
			MyQueue<Integer> testQueue = new MyQueue<Integer>();
			Integer data = new Integer("123");
			testQueue.offer(data);
			Integer data2 = new Integer("456");
			testQueue.offer(data2);
			Integer data3 = new Integer("789");
			testQueue.offer(data3);
			Integer data4 = new Integer("98765");
			testQueue.offer(data4);
			Integer data5 = new Integer("54321");
			testQueue.offer(data5);
			
			// check that stack should have 5 elements at this point
			int countElements = 0;
			while (testQueue.peek() != null) {
				testQueue.poll();
				countElements++;
			}
			assertEquals("Queue has expected number of elements.", 5, countElements);
		
		}
		catch (Exception e) {
			fail("testOffer3 failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}
	
	/* Test the offer method.
	 * Check if method successfully throws a
	 * ClassCastException.
	 */
	@Test
	public void testOffer4() {
		try {
			MyQueue<String> testQueue = new MyQueue<String>();
			Object data = new Integer(12345);
			testQueue.offer((String)data);

		}
		catch (Exception e) {
			System.err.println("Error: ClassCastException thrown.");
		}
	}
	
	/* Test the offer method.
	 * Check if method successfully rejects
	 * insertion of null nodes.
	 * The method should throw a
	 * NullPointerException.
	 */
	@Test
	public void testOffer5() {
		try {
			MyQueue<Integer> testQueue = new MyQueue<Integer>();
			testQueue.offer(null);
			
			// check that queue should be empty at this point
			int countElements = 0;
			while (testQueue.peek() != null) {
				testQueue.poll();
				countElements++;
			}
			assertEquals("Queue has expected number of elements.", 0, countElements);
		
		}
		catch (Exception e) {
			fail("Error: Offer method did not handle NullPointerException.");
		}
	}

}
