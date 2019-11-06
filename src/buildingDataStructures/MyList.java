package buildingDataStructures;

public interface MyList {

	void addAtBeginning(String data);

	void removeFromBeginning();

	void addAtEnd(String data);

	void removeFromEnd();

	String get(int index);

	int size(); // How many items are in the list (a.k.a. the length)

}
