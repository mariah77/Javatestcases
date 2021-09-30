//import LinkedList.Node;

//import LinkedList.Node;

//Program to Implement LinkedList.

public class LinkedList{
	//Node class.
	static class Node{
		int key;   //data value.
		Node next; //next Pointer.
		
		public Node(int data){
			this.key=data;
			this.next=null;
		}
	}

	public static Node head;  //head of the linked list. i.e first element.
	public static int size;   //number of elements in the list.
	
	
	public LinkedList(){
		head=null;
		size=0;
	}

	//function to add elements at the front of the list.
	static public void pushFront(int number){
		System.out.println("Inserting node at front : " + number);
		Node node = new Node(number);
		if(head==null){
			head=node;
			size++;
			return;
		}

		node.next=head;
		head=node;
		size++;
	}

	//function to add elements at the back of the list.
	static public void pushBack(int number){
		System.out.println("Inserting node at back  : " + number);
		Node node = new Node(number);
		if(head==null){
			head=node;
			size++;
			return;
		}
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=node;
		size++;
	}

	//function to remove element from the front of the list.
	static public int popFront(){
		System.out.println("PopFront Operation.");
		if(head==null){
			return 0;
		}
		int x = head.key;
		head=head.next;
		size--;
		return x;
	}

	//function to remove elements from the back of the list.
	static public int popBack(){
		System.out.println("PopBack Operation.");
		if(head==null){
			return 0;
		}
		
		if(head.next==null){
			int x = head.key;
			head=null;
			size--;
			return x;
		}
		int x = 0;
		Node temp=head;
		while(temp.next.next!=null){
			temp=temp.next;
		}
		x = temp.next.key;
		temp.next=null;
		size--;
		return x;
	}

	//function to remove element at a specific position.
	static public int pop(int position){
		System.out.println("Poping element at pos : " + position);
		int x1 = 0;
		if(head==null){
			return x1;
		}
		if(position==0){
			x1 = head.key;
			head=head.next;
			size--;
			return x1;
		}
			
		Node temp=head;
		int x=0;
		while(temp.next!=null && x<position-1){
			temp=temp.next;	
			x++;
		}
		
		
		
		if(temp.next==null){
			x1 = temp.key;
			return x1;
		}
		
		x1 = temp.next.key;
		temp.next=temp.next.next;
		size--;
		return x1;
	}
		
	//function to display the list.
	static public void display(){
		System.out.print("LinkedList : ");
		if(head==null){
			System.out.println(" ");
			return;
		}

		Node temp=head;
		while(temp!=null){
			System.out.print(temp.key +  " ");
			temp=temp.next;
		}
		System.out.println();
	}
}

	//main functon to run the program.
	/*public static void main(String [] args){
		LinkedList list = new LinkedList();
		list.pushFront(10);
		list.pushBack(12);

		list.display();

		list.pushFront(8);
		list.pushFront(6);
		list.pushBack(20);

		list.display();
		
		list.pop(3);
		list.display();

		list.popFront();
		list.display();

		list.popBack();
		list.display();
	}
}
*/
	
