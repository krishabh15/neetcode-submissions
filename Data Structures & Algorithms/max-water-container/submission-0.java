class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length-1;
        int maxArea = Integer.MIN_VALUE;
        while(left < right){
            maxArea = Math.max(maxArea, ((right - left) * Math.min(heights[left], heights[right])));
            if(heights[left] > heights[right]) right--;
            else left++;
        }

        return maxArea;
    }
}
