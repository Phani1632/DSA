package LinkedListInterSection;

import java.util.Iterator;
// import java.util.List;

public class Solution {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=null){
            while(temp2!=null){
                if(temp1.val==temp2.val){
                    if(check(temp1, temp2)){
                        return temp1;
                    }
                    
                }
                temp2=temp2.next;
            }
            temp2=headB;
            temp1=temp1.next;
        }
        return null;
    }
    public static boolean check(ListNode a, ListNode b){
        ListNode temp1 =a;
        ListNode temp2 =b;
        Boolean result =false;
        while(temp1.next!=null || temp2.next!=null){
            if(temp1.val==temp2.val){
                result=true;
                temp1=temp1.next;
                temp2=temp2.next;
            }
            else{
                return false;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1= {1,9,1,2,4};
        int[] arr2 = {3,2,4};
        ListNode headA = new ListNode(arr1[0]);
        ListNode headB = new ListNode(arr2[0]);
        ListNode temp1= headA;
        ListNode temp2= headB;

        for(int i=1;i<arr1.length;i++){
            temp1.next = new ListNode(arr1[i]);
            temp1=temp1.next;
        }

        for(int j=1;j<arr2.length;j++){
            temp2.next = new ListNode(arr2[j]);
            temp2=temp2.next;
        }

        System.out.println(getIntersectionNode(headA, headB).val);

    }
}
