class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indicesMap = new HashMap<>(nums.length);
        for (int i=0; i<nums.length; i++) {
            int difference = target - nums[i];
            Integer current = indicesMap.get(difference);
            if (current != null) {
                return new int[]{current,i};
            } else {
                indicesMap.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}
