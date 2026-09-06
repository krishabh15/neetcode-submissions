class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Base Case where there is either only one element or nums is Empty.
        if(nums.length < 2) return false;
        
        // Sort the Array and perform XOR of two elements at a time.
        Arrays.sort(nums);
        int i = 1;
        while(i < nums.length){
            if((nums[i-1] ^ nums[i]) == 0) return true;
            else i++;
        }

        return false;
    }
}