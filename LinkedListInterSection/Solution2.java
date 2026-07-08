package LinkedListInterSection;

public class Solution2 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        if(headA==null || headB == null){
            return null;
        }
        while(temp1 !=temp2){
            temp1 = (temp1==null)? headB:temp1.next;
            temp2 = (temp2 == null)? headA : temp2.next;
        }
        return temp2;
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
