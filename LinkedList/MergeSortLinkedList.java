
import java.util.LinkedList;

public class MergeSortLinkedList {

    // Main merge sort function
    public static LinkedList<Integer> mergeSort(LinkedList<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;

        // Split into two halves
        LinkedList<Integer> left = new LinkedList<>(list.subList(0, mid));
        LinkedList<Integer> right = new LinkedList<>(list.subList(mid, list.size()));

        // Recursive sort
        left = mergeSort(left);
        right = mergeSort(right);

        // Merge and return
        return merge(left, right);
    }

    // Merge two sorted lists
    public static LinkedList<Integer> merge(LinkedList<Integer> left, LinkedList<Integer> right) {
        LinkedList<Integer> result = new LinkedList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }

        // Copy remaining elements
        while (i < left.size()) {
            result.add(left.get(i++));
        }
        while (j < right.size()) {
            result.add(right.get(j++));
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(15);
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(3);
        list.add(2);

        LinkedList<Integer> sorted = mergeSort(list);
        System.out.println("Sorted LinkedList: " + sorted);
    }
}
