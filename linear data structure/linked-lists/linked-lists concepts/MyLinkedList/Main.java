package  MyLinkedList;

public class Main {
    public static void main(String args []){
        MyLinkedList list = new MyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);


        System.out.println(list);
        list.printRec();
        list.removeEnd();
        System.out.println(list);
        System.out.println(list.sum());
        System.out.println(list.indexOf(4));
        list.insertFirst(14);
        System.out.println(list);
        list.insertAt(3,10);
        list.insertAt2(0,20);
        System.out.println(list);
        list.reverse();
        list.removeStart();
        System.out.println(list);




    }
}