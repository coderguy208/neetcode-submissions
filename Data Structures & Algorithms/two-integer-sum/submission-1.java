class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indy = new HashMap<>();

        for (int i = 0 ; i < nums.length; i++){
            Integer inda = indy.get(nums[i]);
            if (inda != null){
                return new int[]{inda, i};

            }
            indy.put( target - nums[i], i);
        }
      return nums;
    }
  
}
