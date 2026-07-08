package ReverseALinkedList;

import java.util.Stack;

import LinkedListInterSection.ListNode;

public class Solution2 {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr= next;
        }       
        return prev;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        ListNode head = new ListNode(nums[0]);
        ListNode temp = head;
        for (int i = 1; i < nums.length; i++) {
            temp.next = new ListNode(nums[i]);
            temp = temp.next;
        }
        ListNode result = reverseList(head);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
