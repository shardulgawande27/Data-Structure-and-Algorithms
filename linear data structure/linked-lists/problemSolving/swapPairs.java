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
