package LinkedList;

import java.util.ArrayList;
import java.util.ListIterator;

public class Solution {
    public ListNode sum(ListNode l1,ListNode l2){
        int a =10;
        int b= 10;
        int first= l1.val;
        int second= l2.val;
        while(l1.nextNode!=null){
            l1=l1.nextNode;
            first=first+l1.val*a;
            a=a*10;
        }
        while(l2.nextNode!=null){
            l2=l2.nextNode;
            first=first+l2.val*b;
            b=b*10;
        }
        int sum = first+second;
        ListNode dummy = new ListNode();
        ListNode result = dummy;
        while(sum!=0){
            result.nextNode = new ListNode(sum%10);
            result= result.nextNode;
            sum=sum/10;
        }
        return dummy.nextNode;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.nextNode = new ListNode(4);
        l1.nextNode.nextNode = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.nextNode = new ListNode(6);
        l2.nextNode.nextNode = new ListNode(4);
        Solution solution = new Solution();
        ListNode result = solution.sum(l1, l2);
        while (result!=null) {
            System.out.println(result.val);
            result=result.nextNode;
        }
    }
}
