package project3;

/** This class consists of the reference-based implementation
 * for a queue.
 * @author Kelly Xie
 * @author Joanna Klukowska lecture notes
 */
public class MyQueue<E> {
	
	// all data fields private
	private Node<E> head;
	private Node<E> tail;
	private int size = 0;
	
	/** Default constructor that creates an empty queue object. */
	public MyQueue() {
		head = null;
		tail = null;
		size = 0;
	}
	
	/** Method that retrieves but does not remove the head
	 * of this queue, or returns null if this queue is empty. 
	 * @return the head of this queue, or null if empty
	 */
	public E peek() {
		if (isEmpty()) { // check if the queue is empty
			return null;
		}
		else {
			return head.getData();
		}
	}
	
	/** Method that retrieves and removes the head of this queue, 
	 * or returns null if this queue is empty.
	 * @return the head of this queue, or null if empty
	 */
	public E poll() {
		E temp;
		if (isEmpty()) { // check if the queue is empty
			return null;
		}
		else {
			temp = head.getData();
			head = head.getNext();
			size--;
			return temp;
		}
	}
	
	/** Method that inserts the specified element into this queue
	 * if it is possible to do so immediately
	 * without violating capacity restrictions.
	 * @param E item - the item to be added
	 * @return true if the element was added to this queue; false if it was not
	 * @throws ClassCastException - if the class of the specified element prevents it from being added to this queue; 
	 * NullPointerException - if the specified element is null and this queue does not permit null elements; 
	 * IllegalArgumentException - if some property of this element prevents it from being added to this queue
	 */
	public boolean offer(E item) throws ClassCastException, NullPointerException, IllegalArgumentException {
		try {
			if (item == null) {
				throw new NullPointerException();
			}
			Node<E> newNode = new Node<E>(item, null);
	        if (isEmpty()) { // check if queue is empty
	        	head = newNode;
	            newNode.setNext(newNode); // node points to itself
	        }
	        else {
	            newNode.setNext(tail.getNext());
	            tail.setNext(newNode);
	        }
	        tail = newNode; // add item to the back of this queue
	        size++;
	        return true; // item was successfully added
		}
		catch (ClassCastException e) {
			System.err.println("Error: ClassCastException thrown.");
		}
		catch (NullPointerException e) {
			System.err.println("Error: NullPointerException thrown.");
		}
		catch (IllegalArgumentException e) {
			System.err.println("Error: IllegalArgumentException thrown.");
		}
		return false; // item was not successfully added
	}
	
	/** Private method for checking if
	 * queue is empty or not.
	 * Head is null in this case.
	 * @return true if queue is empty; false if it is not
	 */
	private boolean isEmpty() {
		return size == 0;
	}
	
}
