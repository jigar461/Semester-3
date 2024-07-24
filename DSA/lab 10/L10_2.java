class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
	Node head;
	public void instop(){
		Node temp = new Node(0);
		temp.nxt = head;
		head = temp;
	}
	public void print(){
		Node temp = head;
		while(tmep != null){
			System.out.println(temp.data + " ");
			temp = temp.nxt;
		}
	}
}
public class L10_2{
	public static void main(String[] args) {
		Node n1 = new Node(1);
		n1.instop();		
	}
}