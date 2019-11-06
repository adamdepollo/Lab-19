package buildingDataStructures;

public class MyLinkedList implements MyList {

	private Node head;
	private int myLength = 0;

	public MyLinkedList() {
	}

	@Override
	public void addAtBeginning(String data) {
		// Add a new node and set it to the head
		head = new Node(head, data);
		myLength++;

	}

	@Override
	public void removeFromBeginning() {
		head = head.getNext();
		myLength--;

	}

	@Override
	public void addAtEnd(String data) {
		Node node = head;
		Node newNode = new Node();
		newNode.setData(data);
		for (int i = 0; i < myLength - 1; i++) {
			node = node.getNext();
		}
		node.setNext(newNode);
		myLength++;
	}

	@Override
	public void removeFromEnd() {
		if (myLength == 1) {
			removeFromBeginning();
		} else {
			Node node = head;
			for (int i = 0; i < myLength - 2; i++) {
				node = node.getNext();
			}
			node.setNext(null);
			myLength--;
		}
		

	}

	public boolean removeAt(int index) {
		if (index == 0) {
			removeFromBeginning();
			return true;
		} else if (index < myLength) {
			Node node = head;
			for (int i = 0; i < index - 1; i++) {
				node = node.getNext();
			}
			node.setNext(node.getNext().getNext());
			myLength--;
			return true;

		} else {
			System.out.println("Error: Index out of bounds");
			return false;
		}
	}

	public boolean insertAt(int index, String item) {
		if (index == 0) {
			addAtBeginning(item);
			return true;
		} else if (index == myLength - 1) {
			addAtEnd(item);
			return true;
		} else if (index > 0 && index < myLength - 1) {
			Node node = head;
			for (int i = 0; i < index - 1; i++) {
				node = node.getNext();
			}
			Node newNode = new Node(node.getNext(), item);
			node.setNext(newNode);
			myLength++;
			return true;
		} else {
			System.out.println("Error: Index out of bounds");
			return false;
		}
	}

	@Override
	public String get(int index) {
		if (index < myLength) {
			if (index == 0) {
				return head.getData();
			} else {
				Node node = head;
				for (int i = 0; i < index; i++) {
					node = node.getNext();

				}
				return node.getData();
			}
		} else
			return "Error: Index out of bounds";
	}

	@Override
	public int size() {
		return myLength;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Node node = head;
		// Follow the links between the nodes until it reaches the end
		while (node != null) {
			sb.append(node);
			node = node.getNext();
		}
		sb.append("]");
		return sb.toString();
	}

}
