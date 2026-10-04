// Start scanning the String from the left.
// Initialise begin = 0, end = 0;
// Make a substring starting from begin, end
// Once a repeating char is found check for global max vs local max
// return max length

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSubstring = 0;
        
        for(int i=0; i<s.length(); i++){
            Set<Character> charSet = new HashSet<>();
            for(int j=i; j<s.length(); j++){
                if(charSet.contains(s.charAt(j))){
                    break;
                }
                charSet.add(s.charAt(j));
            }
            longestSubstring = Math.max(longestSubstring, charSet.size());
        }

        return longestSubstring;
    }
}
