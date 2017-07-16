package project3;

import static org.junit.Assert.*;

import org.junit.Test;

/** This class consists of the unit tests for 
 * testing the MyStack class.
 * @author Kelly Xie
 * @author Joanna Klukowska recitation notes
 */
public class MyStackTest {
	
	/* Test the default constructor.
	 * Create an object of MyStack, assign it to a reference variable, 
	 * and test if the reference variable points to null.
	 */
	@Test
	public void testMyStack() {
		try {
			MyStack<Integer> testStack = new MyStack<Integer>();
			assertNotNull("Default constructor returned null reference.", testStack);
		
		}
		catch (Exception e) {
			fail("testMyStack failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}
	
	/* Test the default constructor.
	 * Create an object of MyStack and assign it to a reference variable, 
	 * and then test if the object is empty.
	 */
	@Test
	public void testMyStack2() {
		try {
			MyStack<Integer> testStack = new MyStack<Integer>();
			assertTrue("Default constructor returned empty.", testStack.empty());
		
		}
		catch (Exception e) {
			fail("testMyStack2 failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}
	
	/* Test the default constructor with a
	 * data type other than Integer. (i.e. String type)
	 */
	@Test
	public void testMyStack3() {
		try {
			MyStack<String> testStack = new MyStack<String>();
			String data = new String("Hello World");
			testStack.push(data);
			assertEquals("Default constructor returned expected value.", data, 
					testStack.peek());
		
		}
		catch (Exception e) {
			fail("testMyStack3 failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}
	
	/* Test the empty method for correct boolean return value.
	 */
	@Test
	public void testEmpty() {
		try {
			MyStack<Integer> testStack = new MyStack<Integer>();
			// check if the result of empty is a boolean
			assertTrue("Empty method returned a boolean.", 
					testStack.empty() || !testStack.empty());
		
		}
		catch (Exception e) {
			fail("testEmpty failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}
	
	/* Test the empty method on an empty stack.
	 */
	@Test
	public void testEmpty2() {
		try {
			MyStack<Integer> testStack = new MyStack<Integer>();
			assertTrue("Stack is empty.", testStack.empty());
		
		}
		catch (Exception e) {
			fail("testEmpty2 failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}
	
	/* Test the empty method.
	 * Create an object of the class and assign it to a reference variable; 
	 * add an element to the stack; test if the object is empty.
	 */
	@Test
	public void testEmpty3() {
		try {
			MyStack<Integer> testStack = new MyStack<Integer>();
			Integer data = new Integer("98765");
			testStack.push(data);
			assertFalse("Stack is not empty.", testStack.empty());
			
		}
		catch (Exception e) {
			fail("testEmpty3 failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}
	
	/* Test the peek method.
	 * Store data as nodes to the test stack, and then
	 * retrieve the top element in the stack.
	 */
	@Test
	public void testPeek() {
		try {
			MyStack<Integer> testStack = new MyStack<Integer>();
			Integer data = new Integer("123");
			testStack.push(data);
			Integer data2 = new Integer("456");
			testStack.push(data2);
			Integer data3 = new Integer("789");
			testStack.push(data3);
			assertEquals("Peek method returns expected value.", 
					data3, testStack.peek());
		
		}
		catch (Exception e) {
			fail("testPeek failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}
	
	/* Test the peek method.
	 * Retrieve the top element of an empty stack.
	 * This should throw an EmptyStackException.
	 */
	@Test
	public void testPeek2() {
		try {
			MyStack<Integer> testStack = new MyStack<Integer>();
			testStack.peek();
		
		}
		catch (Exception e) {
			fail("Error: Peek method did not handle EmptyStackException.");
		}
	}
	
	/* Test the pop method.
	 * Attempt to retrieve and remove
	 * the top element from a stack with 1 node.
	 * This should empty the stack.
	 */
	@Test
	public void testPop() {
		try {
			MyStack<Integer> testStack = new MyStack<Integer>();
			Integer data = new Integer("123");
			testStack.push(data);
			assertFalse("Stack is not empty.", testStack.empty());
			Integer topElement = testStack.pop(); // remove element
			assertEquals("Pop method returns expected value.", data, topElement);
			assertTrue("Stack is now empty.", testStack.empty());
			
		}
		catch (Exception e) {
			fail("testPop failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}
	
	/* Test the pop method.
	 * Add elements to the stack. Continuously retrieve and remove
	 * the top element. The method should return the value 
	 * of the last added node in LIFO order.
	 */
	@Test
	public void testPop2() {
		try {
			MyStack<Integer> testStack = new MyStack<Integer>();
			Integer data = new Integer("123");
			testStack.push(data);
			Integer data2 = new Integer("456");
			testStack.push(data2);
			Integer data3 = new Integer("789");
			testStack.push(data3);
			
			assertEquals("Before pop, peek method returns top element in the stack.", 
					data3, testStack.peek());
			// remove third added element
			assertEquals("Pop method returns expected value.", data3, testStack.pop());
			assertEquals("After pop, peek method returns the new top element in the stack.", 
					data2, testStack.peek());
			// remove second added element
			assertEquals("Pop method returns expected value.", data2, testStack.pop());
			assertEquals("After pop, peek method returns the new top element in the stack.", 
					data, testStack.peek());
			// remove first added element
			assertEquals("Pop method returns expected value.", data, testStack.pop());
			assertTrue("Stack is now empty.", testStack.empty());
		
		}
		catch (Exception e) {
			fail("testPop2 failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}
	
	/* Test the pop method.
	 * Attempt to retrieve and remove
	 * the top element from an empty stack.
	 * This should throw an EmptyStackException.
	 */
	@Test
	public void testPop3() {
		try {
			MyStack<Integer> testStack = new MyStack<Integer>();
			testStack.pop();
		}
		catch (Exception e) {
			fail("Error: Pop method did not handle EmptyStackException.");
		}
	}
	
	/* Test the push method.
	 * Add an element to the stack, and test if the object is empty
	 * and if the node has been successfully added to the stack.
	 */
	@Test
	public void testPush() {
		try {
			MyStack<Integer> testStack = new MyStack<Integer>();
			Integer data = new Integer("9");
			testStack.push(data);
			assertFalse("Stack is not empty.", testStack.empty());
			
			// check that stack should have 1 element at this point
			int countElements = 0;
			while (!testStack.empty()) {
				testStack.pop();
				countElements++;
			}
			assertEquals("Stack has expected number of elements.", 1, countElements);
			
		}
		catch (Exception e) {
			fail("testPush failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}
	
	/* Test the push method.
	 * Add multiple elements to the stack, and test whether the 
	 * total number of elements added to the stack is correct. 
	 */
	@Test
	public void testPush2() {
		try {
			MyStack<Integer> testStack = new MyStack<Integer>();
			Integer data = new Integer("123");
			testStack.push(data);
			Integer data2 = new Integer("456");
			testStack.push(data2);
			Integer data3 = new Integer("789");
			testStack.push(data3);
			Integer data4 = new Integer("98765");
			testStack.push(data4);
			Integer data5 = new Integer("54321");
			testStack.push(data5);
			
			// check that stack should have 5 elements at this point
			int countElements = 0;
			while (!testStack.empty()) {
				testStack.pop();
				countElements++;
			}
			assertEquals("Stack has expected number of elements.", 5, countElements);
		
		}
		catch (Exception e) {
			fail("testPush2 failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}
	
	/* Test the push method.
	 * Add a null element to the stack, and test whether
	 * element has been successfully added.
	 */
	@Test
	public void testPush3() {
		try {
			MyStack<Integer> testStack = new MyStack<Integer>();
			testStack.push(null);
			assertFalse("Stack is not empty.", testStack.empty());
			
			// check that stack should have 1 element at this point
			int countElements = 0;
			while (!testStack.empty()) {
				testStack.pop();
				countElements++;
			}
			assertEquals("Stack has expected number of elements.", 1, countElements);
		
		}
		catch (Exception e) {
			fail("testPush3 failed: Exception thrown\n" + e.getClass() + "\n"
					+ e.getMessage());
		}
	}

}

