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

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Node head = convertArrToSingleLL(arr);

        // Traversal of SLL
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

        // Find length of the SLL
        System.out.println("Length of SLL: " + findLength(head));
    }
}
