public class DLL {
    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.Prev = null;

        if (head != null) {
            head.Prev = node;
        }
        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        if (head == null) {
            node.Prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        node.next = null;
        node.Prev = last;
        last.next = node;

    }
    public Node Find(int value){
        Node node = head;
        while(node!=null){
            if(node.val == value ){
                return node;
            }
        }
        return null;
    }
    public void InsertAfter(int After , int val) {

        Node p = Find(After);

        if (p == null) {
            System.out.println("Node dos not Exist");
        }

        Node node = new Node(val);
        node.next = p.next;
        node.Prev = p;
        p.next = node ;
        node.next.Prev = node;

    }


    public void Display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");
        System.out.println("reverse print");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.Prev;

        }
        System.out.println("START");

    }


    private class Node {
        int val;
        Node next;
        Node Prev;


        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            Prev = prev;
        }
    }


}
