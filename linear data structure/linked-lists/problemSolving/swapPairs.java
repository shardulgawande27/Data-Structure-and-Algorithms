package problemSolving;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

////Question
//24. Swap Nodes in Pairs
//Medium Topics
//Companies
//Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
//
//Input: head = [1,2,3,4]
//Output: [2,1,4,3]
public class swapPairs {
    public static void main(String args[]){
        // Creating the linked list [1,2,3,4]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode newHead = swapPairs(head);
        printList(newHead);
    }

    public static ListNode swapPairs(ListNode head){
        if (head == null || head.next == null){
            return head;
        }

        ListNode restOfPairs = swapPairs(head.next.next);

        ListNode secondNode = head.next;
        secondNode.next = head;
        head.next = restOfPairs;

        return secondNode;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}


//solving using java library
//import java.util.LinkedList;
//
//public class swapPairs {
//    public static void main(String[] args) {
//        // Creating the linked list [1, 2, 3, 4]
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//        // Swapping nodes in pairs
//        LinkedList<Integer> swappedList = swapPairs(list);
//
//        // Printing the swapped list
//        System.out.println(swappedList);
//    }
//
//    public static LinkedList<Integer> swapPairs(LinkedList<Integer> list) {
//        // Iterate through the list and swap elements in pairs
//        for (int i = 0; i < list.size() - 1; i += 2) {
//            // Swap the elements at index i and i+1
//            Integer temp = list.get(i);
//            list.set(i, list.get(i + 1));
//            list.set(i + 1, temp);
//        }
//        return list;
//    }
//}
