package PracticeQuestions;
import java.util.*;


//Given the head of a linked list, remove the nth node from the end of the list
//and return its head.
//
//
//
//Example 1:
//
//
//Input: head = [1,2,3,4,5], n = 2
//Output: [1,2,3,5]
//Example 2:
//
//Input: head = [1], n = 1
//Output: []
//Example 3:
//
//Input: head = [1,2], n = 1
//Output: [1]
// ListNode class definition (assuming it's provided)
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class removeNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to handle edge cases where the head needs to be removed
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Use two pointers to traverse the list
        ListNode slow = dummy;
        ListNode fast = dummy;

        // Move the fast pointer n nodes ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers until the fast pointer reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the nth node from the end
        slow.next = slow.next.next;

        return dummy.next;
    }

    public class TestRemoveNthFromEnd {
        public  void main(String[] args) {
            removeNthNode  solution = new removeNthNode ();

            // Test case 1: Removing the 2nd node from the end
            ListNode head1 = new ListNode(1);
            head1.next = new ListNode(2);
            head1.next.next = new ListNode(3);
            head1.next.next.next = new ListNode(4);
            head1.next.next.next.next = new ListNode(5);
            int n1 = 2;
            ListNode result1 = solution.removeNthFromEnd(head1, n1);
            printList(result1);  // Expected output: 1 -> 2 -> 3 -> 5

            // Test case 2: Removing the 1st node from the end (head node)
            ListNode head2 = new ListNode(1);
            int n2 = 1;
            ListNode result2 = solution.removeNthFromEnd(head2, n2);
            printList(result2);  // Expected output: (empty list)

            // Test case 3: Removing the 1st node from the end (head node) in a longer list
            ListNode head3 = new ListNode(1);
            head3.next = new ListNode(2);
            head3.next.next = new ListNode(3);
            head3.next.next.next = new ListNode(4);
            head3.next.next.next.next = new ListNode(5);
            int n3 = 5;
            ListNode result3 = solution.removeNthFromEnd(head3, n3);
            printList(result3);  // Expected output: 2 -> 3 -> 4 -> 5
        }

        // Helper method to print the linked list
        private  void printList(ListNode head) {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }}

