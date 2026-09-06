// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         // Base Case where there is either only one element or nums is Empty.
//         if(nums.length < 2) return false;
        
//         // Sort the Array and perform XOR of two elements at a time.
//         Arrays.sort(nums);  // O(nlogn)
//         int i = 1;
//         while(i < nums.length){ // O(n)
//             if((nums[i-1] ^ nums[i]) == 0) return true;
//             else i++;
//         }

//         return false;
//     }
// }

// HashSet Solution 
// TC: O(n)
// SC: O(n)
public class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}

// HashSet Count using Streams
// TC: O(n)
// SC: O(n)
// public class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         return Arrays.stream(nums).distinct().count() < nums.length;
//     }
// }