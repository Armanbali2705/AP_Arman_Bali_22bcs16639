public int findDuplicate(int[] nums) {
    int ans = 0;
    Arrays.sort(nums); // Sort the array
    int i = 0;
    int j = i + 1;

    while (i < nums.length && j < nums.length) {
        if (nums[i] == nums[j]) {
            ans = nums[i];
            break;
        }
        i++;
        j++;
    }
    return ans;
}
