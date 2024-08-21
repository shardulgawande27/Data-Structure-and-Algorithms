package MyLinkedList;

class Node{
    public int data;
    public Node next = null;
    public Node(int value){
        this.data = value;
    }
}

public class MyLinkedList  {
    private Node head;
    private Node tail;
    public MyLinkedList(){
        head = null;
    }

    public boolean isEmpty(){
        if (head == null && tail == null){
            return true;
        }
        return  false;
    }
    public void insert(int value){
        Node node = new Node(value);
        if (head == null){
            head = node;
            tail = node;
        }else{
//            Use the below code when not using tail its O(n) solution
//            Node current = head;
//            while(current.next != null){
//                current = current.next;
//            }
//            current.next = node;

//            Use the below code when using tail a O(1) solution
            tail.next = node;
            tail = node;
        }
    }

//    Function to inset a node at the beginning of linked list

    public void insertFirst(int value){
        Node node = new Node(value);
        if (head == null){
            head = tail = node;
            return;
        }
        node.next = head;
        head = node;
    }

//  Function to insert element at a given index

    public void insertAt(int index, int value){

        if (head == null){
            throw new IllegalArgumentException();
        }

        if (index == 0){
          insertFirst(value);
        }else {
            int currentIndex = 1;
            Node current = head;
            Node newNode = new Node(value);

            while (currentIndex != index) {
                currentIndex++;
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
    }

//    Another way for writing the insertAt code
    public void insertAt2(int index , int value){
        if (head == null){
            throw new IllegalArgumentException();
        }

        if (index == 0){
            insertFirst(value);
        }else {
            Node node = new Node(value);
            Node current = head;
            Node prev = null;

            while (index > 0 && current != null){
                prev = current;
                current = current.next;
                index--;
            }
            prev.next = node;
            node.next = current;
        }
    }

//    Functions to understand how linked list traversal works

    public int indexOf(int value) {
        int index = 0;
        Node current = head;
        while(current != null){
            if (current.data == value){
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    public int sum(){
        Node current = head;
        int sum = 0;
        while(current != null){
            sum += current.data;
            current = current.next;
        }
        return sum;
    }

    public String toString(){
        Node current = head;
        StringBuilder result = new StringBuilder();
        while(current != null){
            result.append(current.data);
            if (current.next != null){
                result.append(" --> ");
            }
            current = current.next;
        }
        return result.toString();
    }
}