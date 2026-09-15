// // Brute Force 
// class Solution {
//     public int longestConsecutive(int[] nums) {
//         Arrays.sort(nums);
//         int longestSequence = 0;
//         for(int start = 0; start < nums.length; start++){
//             int lastElement = nums[start];
//             int sequence = 1;
//             for(int next = start+1; next<nums.length; next++ ){
//                 if(nums[next]-1 == lastElement){
//                     lastElement = nums[next];
//                     sequence++;
//                 }
//             }
//             longestSequence = Math.max(longestSequence, sequence);
//         }

//         return longestSequence;
//     }
// }

// HashSet O(n)
// class Solution {
//     public int longestConsecutive(int[] nums) {
//         Set<Integer> set = new HashSet<>();
//         int low = Integer.MAX_VALUE;
//         int high = Integer.MIN_VALUE;
//         for(int num: nums){
//             set.add(num);
//             low = Math.min(low, num);
//             high = Math.max(high, num);
//         }

//         int curr = low;
//         int longestSequence = 0;
//         int sequence = 0;
//         while(curr <= high){
//             while(set.contains(curr)){
//                 sequence++;
//                 curr = curr+1;
//             }
//             longestSequence = Math.max(longestSequence, sequence);
//             curr = curr+1;
//             sequence = 0;
//         }


//         return longestSequence;
//     }
// }


public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longest = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int length = 1;
                while (numSet.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
