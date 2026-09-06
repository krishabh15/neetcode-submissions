class Solution {
    public boolean isPalindrome(String s) {
        return twoPointerSolution(s);
    }

    public boolean twoPointerSolution(String s){
        char[] charArray = s.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray();
        for(int i=0; i<charArray.length/2; i++){
            if(charArray[i] != charArray[charArray.length-1 - i]) return false;
        }
        return true;
    }
}
