public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();

    Arrays.sort(nums); // Sort the array

    for (int i = 0; i < nums.length - 2; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) { // Skip duplicates
            continue;
        }

        int target = -nums[i];
        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                while (left < right && nums[left] == nums[left + 1]) { // Skip duplicates
                    left++;
                }
                while (left < right && nums[right] == nums[right - 1]) { // Skip duplicates
                    right--;
                }

                left++;
                right--;
            } else if (sum < target) {
                left++; // Move left pointer forward
            } else {
                right--; // Move right pointer backward
            }
        }
    }

    return result;
}
