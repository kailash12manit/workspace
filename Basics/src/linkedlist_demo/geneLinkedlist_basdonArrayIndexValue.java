package linkedlist_demo;

public class geneLinkedlist_basdonArrayIndexValue {
	static Node head;
	static class Node{
		int data;
		Node next;
		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}	
	}
	public static void main(String[] args) {
		int arr[]={ 2,3,5,4,0,1};
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();
		GenerateIndexBasedLL(arr);		
	}
	private static void GenerateIndexBasedLL(int[] arr) {
		// TODO Auto-generated method stub
		int i=0;
		while(arr[i]!=0){
			int value=arr[i];
			//System.out.println("value:"+value);
			Node node = new Node(value,null);
			if(head==null){
				head = node;
				System.out.println("head:"+head.data);
			}else{
				Node temp=head;
				while(temp.next!=null){
					temp=temp.next;
				}
				temp.next=node;
			}
			i=value;
		}
		
		Node node = new Node(0,null);
		if(head==null){
			head = node;
		}else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=node;
		}
		
		Node print = head;
		while(print!=null){
			System.out.print(print.data+" ");
			print=print.next;
		}
		System.out.println();
	}
}
