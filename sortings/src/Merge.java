import java.util.*;

public class Merge {

    public static void mergesort(int nums[], int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergesort(nums, left, mid);
        mergesort(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }

    public static void merge(int nums[], int left, int mid, int right) {

        int i = left;
        int j = mid + 1;
        int k = 0;

        int temp[] = new int[right - left + 1];

        while (i <= mid && j <= right) {

            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= right) {
            temp[k++] = nums[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            nums[left + x] = temp[x];
        }
    }

    public static void main(String[] args) {

        int nums[] = {8, 3456, 67, 852, 468, 648};

        mergesort(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }
}