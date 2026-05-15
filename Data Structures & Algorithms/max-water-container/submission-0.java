class Solution {
    public int maxArea(int[] nums) {
         int maxWater = 0;

        if(nums.length < 2){
            return maxWater;
        }

        int i=0;
        int j=nums.length -1;

        while(i < j){
            int water = 0;

            water = Math.min(nums[i], nums[j]) * (j - i);
            maxWater = Math.max(maxWater, water);

            if(nums[i] < nums[j]){
                i++;
            }else{
                j--;
            }
        }


        return maxWater;
    }
}
