class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode p1 = head;  // slow
        ListNode p2 = head;  // fast

        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }

        return p1;
    }
}