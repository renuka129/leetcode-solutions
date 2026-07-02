class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0;
        int r=matrix.length-1;
        int row=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(target>=matrix[mid][0]&&target<=matrix[mid][matrix[0].length-1]){
                row=mid;
                break;
            }
            else if(target>matrix[mid][0]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }

         l=0; r=matrix[0].length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(target==matrix[row][m]){
                return true;
            }
            else if(target<matrix[row][m]){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return false;
    }
}