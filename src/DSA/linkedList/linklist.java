package DSA.linkedList;

public class linklist {
	
	
	class Node{
		int data ;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node head,tail;
	public void insert(int data) {
		Node n = new Node(data);
		n.next = null;
		
		if(head == null) {
			head = n;
			tail = n;
		}
		else {
			tail.next =n;
			tail =n;
		}
	}
	public void display() {
		if(head == null) {
			System.out.print("List Empty");
		}
		else {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+"  ->  ");
			temp= temp.next;
		}
		System.out.println();
		}
	}
	public void insertfirst(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
	}
	public void insertLast(int data) {
		Node n =new Node(data);
		if(head == null ) {
			head = n;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = n;
		
	}
	public void insertPos(int pos,int data) {
		Node n = new Node(data);
		Node temp = head;
		for(int i=0 ; i<pos-1;i++) {
			temp = temp.next;
		}
		n.next = temp.next;
		temp.next = n;
	}
	public void deletefirst() {
		Node temp = head;
		head=head.next;
		temp.next=null;
	}
	public void deleteLast() {
		Node temp = head;
		while(temp != tail) {
			temp=temp.next;
			
		}
		temp.next = null;
		tail = temp;
	}
	public void deletepos(int pos) {
		Node temp = head;
		for(int i =0; i<pos -1;i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}
	
	public void reverseList() {
		Node prev = null;
		Node current = head;
		Node next = head.next;
		
		while (current != null) {
			next = current.next;
			current.next =prev;
			prev = current;
			current = next;
			
		}
		head = prev;
	}
	public int sumList() {
	    int sum = 0;
	    Node temp = head;
	    while (temp != null) {
	        sum += temp.data;
	        temp = temp.next;
	    }
	    return sum;
	}


	public static void main(String[] args) {
		linklist list = new linklist();
		list.insert(5);
		list.insert(10);
		list.insert(7);
		list.insertfirst(8);
		list.insertPos(2, 20);
		list.insertLast(50);
		list.deletefirst();
		list.deleteLast();
		list.deletepos(2);
		list.display();
		list.reverseList();
		list.display();
		System.out.println("Sum of elements: " + list.sumList());
	}

}
