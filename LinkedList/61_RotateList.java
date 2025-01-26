public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null || k == 0) {
        return head;
    }

    ListNode curr = head;
    int length = 1;

    // Calculate the length of the list
    while (curr.next != null) {
        curr = curr.next;
        length++;
    }

    curr.next = head;  // Make the list circular
    k = k % length;  // In case k is greater than the length of the list

    if (k == 0) {
        curr.next = null;  // Break the cycle and return the original head
        return head;
    }

    // Find the new tail, which is at length - k - 1 position
    ListNode newTail = head;
    for (int i = 1; i < length - k; i++) {
        newTail = newTail.next;
    }

    ListNode newHead = newTail.next;
    newTail.next = null;  // Break the cycle

    return newHead;
}
