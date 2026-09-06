// Flatten into a 1-D matrix and apply Bin Search
// Find what row the target might lie in and then apply BinarySearch
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        while(row < matrix.length){
            if(targetLiesInRow(matrix[row], target)) {
                return binarySearch(matrix[row], target, row);
            }
            else {
                row++;
            }
        }

        return false;
    }

    public boolean targetLiesInRow(int[] row, int target){
        return target >= row[0] && target <= row[row.length-1];
    }

    public boolean binarySearch(int[] nums, int target, int row){
        int low = 0, high = nums.length-1;

        while(low <=high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target) {
                System.out.println("Element found at: " + row + ", " + mid);
                return true;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}
