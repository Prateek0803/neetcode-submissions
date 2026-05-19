class Solution {
    public int trap(int[] nums) {
        int total = 0;
        int i=0, j = nums.length - 1;
        int maxLeft = nums[0], maxRight = nums[nums.length-1];

        while(i < j){
            if(maxLeft < maxRight){
                i++;
                maxLeft = Math.max(maxLeft, nums[i]);
                total += maxLeft - nums[i];
            }else{
                j--;
                maxRight = Math.max(maxRight, nums[j]);
                total += maxRight - nums[j]; 
            }
        }

        return total;
    }
}
