public ListNode mergeKLists(ListNode[] lists) {
    PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

    // Add the head of each list to the min heap
    for (ListNode list : lists) {
        if (list != null) {
            minHeap.add(list);
        }
    }

    ListNode dummy = new ListNode(0);
    ListNode current = dummy;

    // Merge the lists by extracting the smallest element from the heap
    while (!minHeap.isEmpty()) {
        ListNode smallest = minHeap.poll();
        current.next = smallest;
        current = current.next;

        if (smallest.next != null) {
            minHeap.add(smallest.next);
        }
    }

    return dummy.next;
}
