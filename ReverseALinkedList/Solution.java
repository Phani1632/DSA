package ReverseALinkedList;

import java.util.Stack;

import LinkedListInterSection.ListNode;

public class Solution {
    public static ListNode reverseList(ListNode head) {
        Stack<Integer> st = new Stack<>();
        while(head!=null){
            st.push(head.val);
            head=head.next;
        }
        if(st.isEmpty()){
            return null;
        }
        ListNode result = new ListNode(st.pop());
        ListNode temp=result;
        while(!st.isEmpty()){
            temp.next=new ListNode(st.pop());
            temp=temp.next;
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        ListNode head = new ListNode(nums[0]);
        ListNode temp = head;
        for(int i=1;i<nums.length;i++){
            temp.next = new ListNode(nums[i]);
            temp=temp.next;
        }
        ListNode result = reverseList(head);
        while(result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
}
