package buildingDataStructures;

public class Node {
	private Node next; //We have a node inside of itself
	private String data;
	
	public Node() {
		// TODO Auto-generated constructor stub
	}
	
	public Node(Node next, String data) {
		this.next = next;
		this.data = data;
	}
	
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String toString() {
		if (next != null) {
			return data + " -> ";
		}
		else return data;
	}

}
