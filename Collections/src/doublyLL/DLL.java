package doublyLL;

public class DLL {
	
	private Node head;
	private Node tail;
	
	private int size;
	
	
	
	public DLL() {
		super();
	}


	public DLL(int size) {

		this.size = 0;
	}

	
	public void insertFirst(int val) {
		Node node = new Node(val);
		
		
		node.next = head;
		node.prev = null;
		if(head != null) {
			head.prev = node;
		}
		head = node; 
		
		size += 1;
			
	}
	
	//Let's create a method using head only
	public void insertLast(int val) {
		if(head == null) {
			insertFirst(val);
			return;
		}
		
		Node temp = head;
		Node last = new Node();
		while(temp!=null) {
			last = temp;
			temp = temp.next;
		}
		
		Node newNode = new Node(val);
		newNode.prev = last;
		last.next = newNode;
		newNode.next = null;
		tail = newNode;
	}
	
	public void insertAfter(int after, int val) {
		Node p = find(after);
		Node newNode = new Node(val);
		
		newNode.next = p.next;
		p.next = newNode;
		newNode.prev = p;
		if(newNode.next != null) {
			newNode.next.prev = newNode;
		}
		
		
	}
	
	public Node find(int val) {
		Node temp = head;
		while(temp!=null) {
			if(temp.value == val) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}
	

	
	public void display() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.value+" -> ");
			temp = temp.next;
		
		}
		System.out.print("END");
	}
	
	public void displayRev() {
	    Node temp = tail;
	    if (temp == null) {
	        System.out.println("The list is empty.");
	        return;
	    }
	    while (temp != null) {
	        System.out.print(temp.value + " <- ");
	        temp = temp.prev;
	    }
	    System.out.print("START");
	}

	
	public int size() {
		Node temp = head;
		int count =0;
		while(temp != null) {
			count += 1;
			temp = temp.next;
		}
		return count;
		
		
	}


	private class Node{
		private int value;
		private Node next;
		private Node prev;
		
		
		public Node(int value) {
			super();
			this.value = value;
		}
		public Node(int value, Node next, Node prev) {
			super();
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
		public Node() {
			
		}
		
		
	}

}
