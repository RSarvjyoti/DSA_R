class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    
    // Method to find the length of the linked list
    static int findLength(Node head) {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    // Method to convert an array to a singly linked list
    static Node convertArrToSingleLL(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    // Search in SLL

    static boolean searchElm(Node head, int elm){

        Node temp = head;
        while (temp != null) {
            if(temp.data == elm){
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    // Delete node from the head
    static Node deleteNodeHead(Node head){
        if(head == null) return head;
        head = head.next;
        return head;
    }

    // Delete node from the tail
    static Node deleteNodeTail(Node head) {
        if(head == null || head.next == null) return null;

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    // Delete any position o node
    static Node delPosition(Node head, int k) {
        // if head is empty
        if(head == null) return head;
        
        // logic for => if k = 1 delete head node
        if(k==1) {
            head = head.next;
            return head;
        }
        // logic for => any middle or tail

        int count = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            count++;
            
            if(count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
    
    
    static void printLL(Node head){
         // Traversal of SLL
         Node temp = head;
         while (temp != null) {
             System.out.print(temp.data + "->");
             temp = temp.next;
         }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Node head = convertArrToSingleLL(arr);

        //call Traversal of SLL
        printLL(head);
        System.out.println("null");

        // Find length of the SLL
        System.out.println("Length of SLL: " + findLength(head));

        System.out.println(searchElm(head, 4));

        // call delete node from head
        head = deleteNodeHead(head);
        printLL(head);

        // call delete node from tail
        head = deleteNodeTail(head);
        System.out.println();
        printLL(head);

        // detele any position o node
        head = delPosition(head, 2);
        printLL(head);
    }
}
