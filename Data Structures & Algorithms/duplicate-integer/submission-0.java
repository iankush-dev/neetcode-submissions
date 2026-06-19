class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> trackMap = new HashMap<>();
        boolean isDuplicate = false;
        for(int i=0; i<nums.length; i++) {
            if (trackMap.containsKey(nums[i])) {
                isDuplicate = true;
            } else {
                trackMap.put(nums[i], 1);
            }
        }

        return isDuplicate;
    }
}