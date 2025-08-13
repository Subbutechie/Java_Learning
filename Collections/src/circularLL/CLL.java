package circularLL;

public class CLL {
	
	
	private Node head;
	private Node tail;
	
	private int size;
	
	
	
	public CLL(Node head, Node tail) {
		this.head = null;
		this.tail = null;
	}
	
	
	
	public CLL() {
	
	}
	
	
	public void insert(int val) {
		Node node = new Node(val);
		
		if(head == null) {
			head = node;
			tail= node;
		}
		
		tail.next = node;
		node.next = head;
		tail = node;
		
	}
	
	public void display() {
		Node temp = head;
		
		if(head != null) {
			do {
				System.out.print(temp.value+" -> ");
				temp=temp.next;
			}while(temp != head);
		}
		System.out.print("HEAD");
	}
	
	public void delete(int val) {
		Node node = head;
		
		if(head == null) {
			return;
		}
		if(node.value == val) {
			head = head.next;
			tail.next = head;
			return;
		}
		
		do {
			Node nextNode = node.next;
			if(nextNode.value == val) {
				node.next = nextNode.next;
				break;
			}
			node = node.next;
		}while(node != head);
		
	}






	private class Node{
		 int value;
		 Node next;
		 Node prev;
		public Node(int value, Node next, Node prev) {
			super();
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
		public Node() {
			super();
		}
		public Node(int value) {
			super();
			this.value = value;
		}
		
		
		
	}

}
