package DetectAndRemoveLoop;

import LinkedListInterSection.ListNode;

public class Solution {
    public static void removeLoop(ListNode head){
        ListNode fast= head;
        ListNode slow = head;
        while(slow != fast && fast!=null){  
            slow=slow.next;
            fast = fast.next.next;
        }
        slow =head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
    }
    public static void main(String[] args){

    }
}
