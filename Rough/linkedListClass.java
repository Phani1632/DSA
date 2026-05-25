public class linkedListClass{
    Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insertEnd(int a){
        Node newNode= new Node(a);
        if(head == null){
            head = newNode;
            return;
        }
        Node current= head;
        while (current.next!= null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void printList(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        linkedListClass list = new linkedListClass();
        list.insertEnd(10);
        list.insertEnd(20);
        list.printList();
    }
}
    

