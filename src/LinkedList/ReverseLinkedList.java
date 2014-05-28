package LinkedList;

import java.util.ArrayList;

public class ReverseLinkedList {
	
	public ListNode reverse(ListNode head){
		
		ArrayList<ListNode> savePrevious = new ArrayList<ListNode>();
		
		ListNode point = head;
		
		while(point.next!=null){
			savePrevious.add(point.next);
			point = point.next;
		}
		
		int length = savePrevious.size();
		ListNode prev = null;
		head.next = null;
		prev = head;
		
		for(int i=0; i<length; i++){
			savePrevious.get(i).next = prev;
			prev = savePrevious.get(i);
		}

		
		head = prev;

		
		return head;
		
		
	}
	
	public static void main(String [] args){
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		ReverseLinkedList r = new ReverseLinkedList();
		ListNode reversedHead = r.reverse(n1);
		while(reversedHead!=null){
			System.out.println(reversedHead.value);
			reversedHead = reversedHead.next;
		}
	}
}
