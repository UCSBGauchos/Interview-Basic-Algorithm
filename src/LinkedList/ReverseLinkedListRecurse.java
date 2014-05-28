package LinkedList;

public class ReverseLinkedListRecurse {
	
	public ListNode newHead;
	
	
	
	public ListNode reverse(ListNode head){
		if(head.next == null){
			newHead = head;
			return head;
		}
		ListNode newNode = head.next;
		ListNode cur = reverse(newNode);
		cur.next = head;
		return head;
	}
	
	
	public static void main(String [] args){
		ReverseLinkedListRecurse r = new ReverseLinkedListRecurse();
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		r.reverse(n1).next = null;
		while(r.newHead!=null){
			System.out.println(r.newHead.value);
			r.newHead = r.newHead.next;
		}
		
	}
}
