class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indicesMap = new HashMap<>(nums.length);
        for (int i=0; i<nums.length; i++) {
            int difference = target - nums[i];
            if (indicesMap.containsKey(difference)) {
                return new int[]{indicesMap.get(difference),i};
            } else {
                indicesMap.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}
