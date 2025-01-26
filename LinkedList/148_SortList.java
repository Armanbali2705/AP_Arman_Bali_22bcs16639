public ListNode sortList(ListNode head) {
    if (head == null) return null;

    Map<Integer, ListNode> map = new TreeMap<>();
    ListNode temp = head;

    // Insert all nodes into the map based on their values
    while (temp != null) {
        map.put(temp.val, temp);
        temp = temp.next;
    }

    // Create a new sorted list using the map
    ListNode dummy = new ListNode(0);
    ListNode newHead = dummy;

    for (Map.Entry<Integer, ListNode> entry : map.entrySet()) {
        newHead.next = entry.getValue();
        newHead = newHead.next;
    }

    newHead.next = null;
    
    return dummy.next;
}
