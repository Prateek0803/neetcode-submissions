class Solution {
    public int majorityElement(int[] nums) {
        int counter = 1;
        int candidate = nums[0];

        for(int i=0; i<nums.length; i++){

            if(counter == 0){
                candidate = nums[i];
                counter = 1;
            }else if(nums[i] == candidate){
                counter +=1;
            }else{
                counter -= 1;
            }
        }

        return candidate;
    }
}