package ds.singlylinkedlist;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList mylist = new SinglyLinkedList();
		mylist.insertFirst(100);
		mylist.insertFirst(50);
		mylist.insertFirst(99);
		mylist.insertFirst(88);
		mylist.insertLast(999999);
		
		mylist.displayList();

	}

}
