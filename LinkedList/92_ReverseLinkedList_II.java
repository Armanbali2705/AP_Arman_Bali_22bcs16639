public ListNode reverseBetween(ListNode head, int left, int right) {
    if (head == null || left == right) {
        return head;
    }

    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode prev = dummy;

    // Move prev to the node just before the 'left' node
    for (int i = 1; i < left; i++) {
        prev = prev.next;
    }

    ListNode curr = prev.next;
    ListNode next = null;

    // Reverse the sublist between left and right
    for (int i = left; i < right; i++) {
        next = curr.next;
        curr.next = next.next;
        next.next = prev.next;
        prev.next = next;
    }

    return dummy.next;
}
