package buildingDataStructures;

public class MainApp {

	public static void main(String[] args) {
		MyArrayList mine = new MyArrayList();
		mine.addAtBeginning("hello");
		mine.addAtBeginning("hi");
		mine.addAtBeginning("hey");
		mine.addAtEnd("hihi");
		//mine.removeFromEnd();
		//mine.removeFromBeginning();
		mine.removeAt(1);
		System.out.println(mine);
		mine.insertAt(1, "hot dog");
		System.out.println(mine);
		
		//System.out.println(mine.get(10));
		/*
		
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.addAtBeginning("help");
		linkedList.addAtBeginning("wowawoowa");
		linkedList.addAtBeginning("whoadie");
		
		linkedList.addAtEnd("shoot");
		
		linkedList.insertAt(2, "whoopers");
		System.out.println(linkedList);
		linkedList.removeAt(4);
		System.out.println(linkedList);
		linkedList.removeAt(5);
		*/
		
	}

}
