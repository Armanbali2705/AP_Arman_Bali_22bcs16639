public ListNode deleteDuplicates(ListNode head) {
    if (head == null) {
        return head;
    }

    ListNode temp = head;
    while (temp.next != null) {
        if (temp.val == temp.next.val) {
            ListNode duplicate = temp.next;
            temp.next = temp.next.next;
            // No need to explicitly delete in Java, as garbage collection handles it
        } else {
            temp = temp.next;
        }
    }

    return head;
}
