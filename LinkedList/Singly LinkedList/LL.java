public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    // method for the insert first
    public void InsertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    // INSERT lAST
    public void insertLast(int val) {
        Node node = new Node(val);
        if (tail == null) {
            InsertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;

        size++;
    }

    // method to insert at particular index
    public void insert(int val, int index) {
        if (index == 0) {
            InsertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        System.out.println(temp.val + " current temp ");
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // delete first item
    public int deleteFirst() {
        int val = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    // delete last element
    public int deleteLast() {
        if (size < 1) {
            deleteFirst();
        }
        int val = tail.val;
        Node secondlast = get(size - 2);
        tail = secondlast;
        tail.next = null;
        return val;
    }
    // to reverse the link list

    public Node Reverse(){
        Node secondlast = get(size - 1);
        Node Tnode = new Node();
        while(tail!=null){
            Tnode.val = head.val;
            Tnode.next = tail;
            Tnode.next.next = secondlast;
            secondlast = tail;

        }
        return Tnode;
    }
    // delete at particular index
    public int deleteAt(int index){
        if(index==0){
            return deleteFirst();
        }
        if (index == size-1){
            deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return  val;
    }
   // to find the vlaue
    public Node Find(int value){
        Node node = head;
        while(node!=null){
            if(node.val == value ){
                return node;
            }
        }
        return null;
    }
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // method to  Display
    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    // class for Node
    private class Node {
        int val;
        Node next;

        // constructor
        public Node(int val) {
            this.val = val;
        }

        public Node() {

        }

        // second constructor with tWO parameters
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
