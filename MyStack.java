package project3;

import java.util.EmptyStackException;

/** This class consists of the reference-based implementation
 * for a stack.
 * @author Kelly Xie
 * @author Joanna Klukowska lecture notes
 */
public class MyStack<E> {
	
	// all data fields private
	private Node<E> head;
	private int size;
	
	/** Default constructor that creates an empty stack object. */
	public MyStack() {
		head = null;
		size = 0;
	}
	
	/** Method that tests if this stack is empty.
	 * @return true if this stack contains no items; false if it does
	 */
	public boolean empty() {
		return ( size == 0 );
	}
	
	/** Method that returns the element at the top of this stack
	 * without removing it from the stack.
	 * @return the element at the top of this stack
	 * @throws EmptyStackException - if this stack is empty
	 */
	public E peek() throws EmptyStackException {
		E topElement = null;
		try {
			// make sure the stack is NOT empty 
			// before retrieving top element
			if ( empty() )
				throw new EmptyStackException();
			else {
				topElement = head.getData();
			}
		}
		catch (EmptyStackException e) {
			System.err.println("Error: EmptyStackException thrown.");
		}
		return topElement;
	}
	
	/** Method that removes the element at the top of this stack
	 * and returns that element.
	 * @return the element at the top of this stack
	 * @throws EmptyStackException - if this stack is empty
	 */
	public E pop() throws EmptyStackException {
		E topElement = null;
		try{
			// make sure the stack is NOT empty 
			// before trying to remove top element
			if ( empty() )
				throw new EmptyStackException();
			else {
				topElement = head.getData();
			    head = head.getNext();
			    size--;
			}
		}
		catch(EmptyStackException e) {
			System.err.println("Error: EmptyStackException thrown.");
		}
		return topElement;
	}
	
	/** Method that pushes an item to the top of this stack, and
	 * returns the item itself.
	 * @param item - the item to be pushed onto this stack
	 * @return item
	 */
	public E push(E item) {
		Node<E> newNode = new Node<E>(item, head); // make new node
		newNode.setNext(head); // make new node point to current first node
		head = newNode; // point head reference to new node
		size++;
		return item;
	}

}

