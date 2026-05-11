class Solution {
    public int longestConsecutive(int[] nums) {
        int max_count = 0;
        
        Set<Integer> set = new HashSet<>();
        for(int n: nums){
            set.add(n);
        }

        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i] - 1)){
                int curr_num = nums[i];
                int curr_count = 1;
                while(set.contains(curr_num + 1)){
                    curr_num ++;
                    curr_count ++;
                }
                max_count = Math.max(curr_count, max_count);
            }
        }

        return max_count;
    }
}
