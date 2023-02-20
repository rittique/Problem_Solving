public class LinkedList {
    Node head;

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static LinkedList insert(LinkedList list, int data){
        // Creating a new node with the given data
        Node new_Node = new Node(data);
        // Checking if the linkedList is empty
        // then making the node as head
        if (list.head == null ){
            list.head = new_Node;
        }
        else {
            // else traverse till the last node and insert the new_node there
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_Node;
        }
        return list;
    }

    public static void printList(LinkedList list){
        Node currentNode = list.head;

        System.out.println("LinkedList: ");
        while(currentNode != null){
            System.out.println(currentNode.data + " ");

            currentNode = currentNode.next;
        }
    }
}
