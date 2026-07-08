package RemoveNthElement;

import LinkedListInterSection.ListNode;

public class Solution {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        int i = 1;
        while (i != n && prev.next!=null) {
            prev = prev.next;
            i++;
        }
        if(i==n){
            prev.next=prev.next.next;
            return head;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        ListNode head = new ListNode(nums[0]);
        ListNode temp = head;
        for (int i = 1; i < nums.length; i++) {
            temp.next = new ListNode(nums[i]);
            temp = temp.next;
        }
        ListNode res = removeNthFromEnd(head, 3);
    }
}
