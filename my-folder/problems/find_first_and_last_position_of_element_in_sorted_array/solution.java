class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] output = {-1,-1};
        boolean found = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                if(found){
                    output[1] = i;
                }
                else{
                    output[0] = i;
                    found = true;
                }
            }
        }
        if(output[1] == -1 && output[0] != -1){
            output[1] = output[0];
        }
        return output;
    }
}