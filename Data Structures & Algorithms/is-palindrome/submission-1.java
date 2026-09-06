class Solution {
    public boolean isPalindrome(String s) {
        // return twoPointerSolution(s);
        return compareWithReversedString(s);
    }

    public boolean twoPointerSolution(String s){
        char[] charArray = s.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray();
        for(int i=0; i<charArray.length/2; i++){
            if(charArray[i] != charArray[charArray.length-1 - i]) return false;
        }
        return true;
    }

    public boolean compareWithReversedString(String s){
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        String trimmedS = sb.toString();
        String trimmedAndReversedS = sb.reverse().toString();
        return trimmedS.equals(trimmedAndReversedS);

    }
}
