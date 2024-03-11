package PracticeQuestions;

public class middleNodeLL {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == null || fast.next == null){
                return slow;
            }
        }
        return slow;
    }

}
