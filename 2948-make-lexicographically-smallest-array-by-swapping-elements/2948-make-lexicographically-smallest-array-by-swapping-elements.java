class Solution {

    static class Pair {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public static int[] lexicographicallySmallestArray(int[] nums, int limit) {

        int n = nums.length;

        Pair[] arr = new Pair[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(nums[i], i);
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a.value, b.value));

        int start = 0;

        while (start < n) {

            int end = start;

            // Find one connected group
            while (end + 1 < n &&
                   (long) arr[end + 1].value - arr[end].value <= limit) {
                end++;
            }

            // Get original indices of this group
            ArrayList<Integer> indices = new ArrayList<>();

            for (int i = start; i <= end; i++) {
                indices.add(arr[i].index);
            }

            // Sort original positions
            Collections.sort(indices);

            // Put sorted values into sorted positions
            for (int i = 0; i < indices.size(); i++) {
                nums[indices.get(i)] = arr[start + i].value;
            }

            start = end + 1;
        }

        return nums;
    }
}