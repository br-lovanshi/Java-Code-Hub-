package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public void printList(){
        System.out.println(this.data + " " + this.next);
    }
}
class LinkedList{
    Node head;
    public LinkedList(){
        this.head = null;
    }

//    mathod to add at the front of head

    public void addHead(int data ){
        if(head == null ){
          head = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return;

    }
//    function to add el at the tail

    public void addTail(int data)
    {
        if(this.head == null){
            head = new Node(data);
            return;
        }


         Node curr = head;
        while (curr.next != null )
        {
            curr = curr.next;
        }
        curr.next = new Node(data);
    }
//delete a perticular node

    public void  deleteNode(int data){
        Node curr = head;

        while (curr.next.data != data){
            curr = curr.next;

        }
        curr.next = curr.next = curr.next.next;
    }
//    mathod to printLinkedList

      public void printLinkedList(){
        if(head == null) return;

        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

      }

}
public class Ll1 {
    public static void main(String[] args) {
       LinkedList ll  = new LinkedList();
       for(int i = 0;i<7;i++){
           ll.addTail(i);
       }
       ll.addHead(9);
        ll.deleteNode(4);
        ll.printLinkedList();
    }
}
