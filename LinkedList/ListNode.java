package LinkedList;



public class ListNode {
    int val;
    ListNode nextNode;
    ListNode(){
    
    }
    ListNode(int value){
        this.val =value;
    }
    ListNode(int value,ListNode node){
        this.val =value;
        this.nextNode=node;
    }
}
