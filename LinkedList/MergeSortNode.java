class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class MergeSortNode {
    Node head;

    Node mergeSort(Node h) {
        if (h == null || h.next == null) return h;
        Node middle = getMiddle(h);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(h);
        Node right = mergeSort(nextOfMiddle);
        return sortedMerge(left, right);
    }

    Node sortedMerge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        Node result;
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    Node getMiddle(Node h) {
        if (h == null) return h;
        Node slow = h, fast = h;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        MergeSortNode list = new MergeSortNode();
        list.head = new Node(15);
        list.head.next = new Node(10);
        list.head.next.next = new Node(5);
        list.head.next.next.next = new Node(20);
        list.head.next.next.next.next = new Node(3);
        list.head.next.next.next.next.next = new Node(2);

        list.head = list.mergeSort(list.head);
        list.printList(list.head);
    }
}
