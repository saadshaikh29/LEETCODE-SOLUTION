class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // We are in the increasing part
                left = mid + 1;
            } else {
                // We are in the decreasing part (or at peak)
                right = mid;
            }
        }
        return left; // peak index
    }
}
