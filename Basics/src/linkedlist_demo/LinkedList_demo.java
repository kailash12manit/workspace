package linkedlist_demo;

public class LinkedList_demo {
	
	Node head;
	
	class Node {
		int data;
		Node next;
		public Node(int n){
			data=n;
			next=null;
		}		
	}
	
	public static void main(String[] args) {
		LinkedList_demo ll = new LinkedList_demo();
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		ll.push(5);
		ll.push(6);

		System.out.println("LL before calling pairwise ");
		ll.printLL();
		
		ll.swapLLPairwise();
		System.out.println("LL after calling pairwise ");
		ll.printLL();
	}




	private void swapLLPairwise() {
		// TODO Auto-generated method stub
		Node temp=head;
		while(temp!=null && temp.next!=null){
			int k=temp.data;
			temp.data=temp.next.data;
			temp.next.data=k;
			temp=temp.next.next;
		}
		
	}




	private void printLL() {
		// TODO Auto-generated method stub

		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	private void append(int i) {
		// TODO Auto-generated method stub
		Node node = new Node(i);
		node.next=head;
		head=node;
	}
	
	private void push(int data){
		
		Node node= new Node(data);
		
		if(head==null){
			head=new Node(data);
			return;
		}
		node.next=null;
		
		Node last=head;
		while(last.next!=null){
			last=last.next;
		}
		last.next=node;
		return;
	}
}