package linkedList;

public class Main {
	
	public static void main(String[] args) {
		LL list = new LL();
		list.insertFirst(3);
		list.insertFirst(4);
		list.insertFirst(5);
		list.insertFirst(6);
		list.insertFirst(7);
		
		list.display();
		
	
		list.reverseList(null);
		
		list.display();
	}
	
	
	

}
