package problemSolving;


//25. Reverse Nodes in k-Group
//        Solved
//Hard
//        Topics
//Companies
//Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
//
//k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
//
//You may not alter the values in the list's nodes, only nodes themselves may be changed.
//
//Input: head = [1,2,3,4,5], k = 2
//Output: [2,1,4,3,5]


import javax.swing.event.ListDataEvent;

public class reverseNodeInKGroups {


    public static void main(String args[]){
        // Creating the linked list [1,2,3,4]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

    }

    public ListNode reverseKGroup(ListNode head, int k){
        if (head == null || head.next == null){
            return head;
        }

        ListNode check = head;
        for (int i = 0; i < k; i++){
            if (check == null) return head;
            check = check.next;
        }

        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;
        int count = 0;

        while (count < k && curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;

        }

        ListNode restOfList = reverseKGroup(curr, k);
        head.next = restOfList;
        return prev;
    }
}
