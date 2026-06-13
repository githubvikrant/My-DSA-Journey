
public class FindLastOccurence {

    public static void main(String[] args) {
        int[] arr = {1, 7, 2, 3, 5, 7, 4, 7, 5, 7, 6};
        int key = 7;
        int index = lastOccurence(arr, key, 0);
        System.out.println(key + " found at " + (index + 1));
    }

    public static int lastOccurence(int[] arr, int key, int i) {

        if (i == arr.length) {
            return -1;
        }

        int isfound = lastOccurence(arr, key, i + 1);

        if (isfound == -1 && arr[i] == key) {
            return i;
        }

        return isfound;

    }
}
