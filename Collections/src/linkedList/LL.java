package linkedList;

public class LL {
	

	//This acts as first node
	private Node head;
	//Last node
	private Node tail;
	//This tracks the size of the LL
	private int size;
	
	public LL(int size) {
		this.size = 0;
	}
	
	public LL() {
	}
	
	
	//insert using recursion
	 
	
	
	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;
		
		//If there are no elements the tail will be null
		if(tail == null) {
			tail = head;
		}		
		size += 1;
	}
	
	
	public void insertLast(int value) {
		
		if(tail == null) {
			insertFirst(value);
			return ;
		}
		Node node = new Node(value);
		tail.next = node;
		tail = node;
		size++;
	}
	
	public void display() {
		
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.print("END");
	}
	
	public int getIndex(int val) {
		
		Node temp = head;
		int count =0;
		while(temp.value != val) {
			temp = temp.next;
			count++;
		}
		return count;
		
	}
	
	public Node getValue(int index) {
		
		Node node = head;
		for(int i =0; i<index; i++) {
			node = node.next;
		}
		return node;
	}
	
	public void insert(int index,int val) {
		
		if(index == 0) {
			insertFirst(val);
			return;
		}
		if(index == size-1) {
			insertLast(val);
			return;
		}
		
		Node temp  = head;  
		for(int i =1; i<index; i++) {
			temp = temp.next;
		}
		
		Node node = new Node(val,temp.next);
		temp.next = node;
		size++; 
		
	}
	
	public int deleteFirst() { 
		int val = head.value;
		
		head = head.next;
		if(head == null) {
			tail = null;
		}
		size--;
		return val;
		
	}
	
	public int deleteLast() {
		
		if(size <=1) {
			return deleteFirst();
		}
		
		int val = tail.value;
		Node secondLast = getValue(size-2);
		tail = secondLast;
		tail.next = null;
		size--;
		return val;
		
	}
	
	public int delete(int index) {
		if(index == 0) {
			return deleteFirst();
		}
		if(index == size-1) {
			return deleteLast();
		}
		
		Node oneBeforeNode = getValue(index-1);
		Node temp = oneBeforeNode.next;
		
		int val = temp.value;
		
		//this will direct the arrow to the one after the node
		oneBeforeNode.next = oneBeforeNode.next.next;
		
		return val;
	}
	
	public boolean find(int val) {
		Node node = head;
		while(node != null) {
			if(node.value == val) {
				return true;
			}
			node = node.next;
		}
		return false;
	}
	
	//here I am reversing the LL using 3 pointers
	Node reverseList(Node secondHead) {
		
		if(head == null ) {
			return head;
		}
		
		Node prev = null;
		Node present = head;
		
		
		while(present != null) {
			Node later = present.next;
			present.next = prev;
			prev = present;
			present = later;
			
		}
		head = prev;
		
		return prev;
		
	}
	
	//Here I am going to find the middle node using slow and fast Pointer
	 Node middleNode() {
		
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
		
	}
	
	 
	 //Now I am going to find if the list is palindromic or not
	 //First I will reverse the list from the middle and compare it from the head
	 //if at any point they are not equal we return false
	 //Once completed we re-reverse the list
	 public boolean isPalindrome() {
		 Node mid = middleNode();
		 Node secondHead = reverseList(mid);
		 Node rereverseHead = secondHead;
		 
		 //For comparision of og list and the reversed secondhalf 
		 Node headcopy = head;
		 
		 while(headcopy != null && secondHead != null) {
			 if(headcopy.value != secondHead.value) {
				 break;
			 }
			 headcopy = headcopy.next;
			 secondHead = secondHead.next;
			 
		 }
		 
		 reverseList(rereverseHead);
		 
		 
		 return headcopy == null || secondHead == null;
		 
		}
	 
	 

	
	 
	 
	public void printHead() {
		System.out.println(head.value);
	}

	private class Node{
		
		
		private int value;
		//This acts as a reference and points it to the next node
		private Node next;
		
		
		public Node(int value) {
			this.value = value;
		}
		
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
		
		public String toString() {
			return "Node: " + value;
		}
		
	}
	
	
	
}
