public class InsertNodeInLinkedList {


    Node head;
    class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }


        public void push(int newData){
            Node newNode  = new Node(newData);
            newNode.next  = head;
            head = newNode;
        }

        public  void append(int newData){

            Node newNode = new Node(newData);

            if(head==null){
                head = newNode;
                return;
            }

            newNode.next  =null;

            Node last  =head;
            while(last.next!=null)
                last = last.next;

            last.next = newNode;
        }
    }


}
