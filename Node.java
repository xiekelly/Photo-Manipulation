package project3;

/** This class consists of the implementation
 * for a node.
 * @author Kelly Xie
 * @author Joanna Klukowska lecture notes
 */
public class Node<E> {
	
	// private data fields
	private E data;
	private Node<E> next; 
	
	/** 1 parameter constructor for a node.
	 * It should allow for null data.
	 * @param E data - data stored in this node
	 */
	public Node( E data ) {
		this.data = data;
	}
    
	/** 2 parameter constructor for a node.
	 * It should allow for null data.
	 * @param E data - data stored in this node
	 * @param Node<E> next - reference to the following node
	 */
	public Node( E data, Node<E> next ) {
		this(data);
        this.next = next;
    }

	/** Accessor methods
	 * @return data, next
	 */
	public E getData () {
		return data; 
	}
	
	public Node<E> getNext () { 
		return next;
	}
	
	/** Mutator methods
	 * @param E data, Node<E> next
	 */
	public void setData (E data) { 
		this.data = data;
	}
	
	public void setNext (Node<E> next) {
		this.next = next; 
	}
	
}
