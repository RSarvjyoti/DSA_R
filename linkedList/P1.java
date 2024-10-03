class Node {
    int data; // data
    Node next; // to next 

    // cuntructor
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class P1 {
    public static void main(String[] args) {
        Node y = new Node(1, null);
        Node x = new Node(2, y);
        Node z = new Node(3,x);
        System.out.println(y.data + " -> " + x.data + " -> " + z.data);
    }
}