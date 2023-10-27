// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.InsertFirst(14);
        list.InsertFirst(8);
        list.InsertFirst(78);
        list.insertLast(48);
        list.insert(99, 3);
        list.Display();

        list.Reverse();
        list.Display();

        System.out.println(list.deleteFirst());
        list.Display();
        System.out.println(list.deleteLast());
        list.Display();
        System.out.println(list.deleteAt(2));
        list.Display();

// **************************** Doubly Linked List **********************************

        DLL dlist = new DLL();
        dlist.insertFirst(10);
        dlist.insertFirst(20);
        dlist.insertFirst(30);
        // dlist.Display();

        dlist.insertLast(40);

        dlist.Display();

        dlist.InsertAfter(30, 18);
        dlist.Display();

        // ******************************************* Circular Linked List ********************************

        CLL Clist = new CLL();

        Clist.insert(10);
        Clist.insert(30);
        Clist.insert(90);
        Clist.insert(9);
        Clist.insert(19);

        Clist.Display();

        Clist.delete(30);
        Clist.Display();


    }
}