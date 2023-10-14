/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right)
        {
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode preleft=dummy;
        for(int i=1;i<left;i++)
        {
            preleft=preleft.next;
        }
        ListNode leftNode=preleft.next;
        ListNode cur=leftNode;
        ListNode prev=null;
        ListNode nexttemp=null;
        for(int i=left;i<=right;i++)
        {
            nexttemp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nexttemp;
        }
        preleft.next=prev;
        leftNode.next=cur;
        return dummy.next;
        
    }
}
