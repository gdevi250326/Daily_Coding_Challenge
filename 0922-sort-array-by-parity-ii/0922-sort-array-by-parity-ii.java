class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int a[] = new int[n / 2];
        int b[] = new int[n / 2];

        int k = 0, l = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                a[k] = nums[i];
                k++;
            } else {
                b[l] = nums[i];
                l++;
            }
        }

        int h = 0;

        for (int i = 0; i < n; i += 2) {
            nums[i] = a[h];
            nums[i + 1] = b[h];
            h++;
        }

        return nums;
    }
}