public class LC0142 {
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }

        if(fast == null || fast.next == null){
            return null;
        }

        slow = head;
        while (slow != fast){
            slow = slow.next;
            head = head.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        // Create cycle: -4 -> 2
        head.next.next.next.next = head.next;

        ListNode ans = detectCycle(head);

        if (ans != null) {
            System.out.println("Cycle starts at: " + ans.val);
        } else {
            System.out.println("No cycle");
        }
    }
}
