package doublyLL;

public class Main {
	
	public static void main(String[] args) {
		DLL list = new DLL();
		list.insertFirst(9);
		list.insertFirst(7);
		list.insertFirst(5);
		list.insertFirst(3);
		
		list.insertLast(11);
		list.insertLast(12);
		list.insertAfter(7, 99);
		list.display();
		
		
		
		System.out.println();
		list.displayRev();
		
	}
	
	
	

}
