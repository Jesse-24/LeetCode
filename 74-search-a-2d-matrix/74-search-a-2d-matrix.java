class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==1)
            return Search(matrix[0],target);
        for(int i=0;i<matrix.length-1;i++)
            if(target>=matrix[i][0] && target<matrix[i+1][0])
                return Search(matrix[i], target);
        return Search(matrix[matrix.length-1],target);
    }
    
    public boolean Search(int matrix[], int target)
    {
        int low = 0, high = matrix.length-1, mid=0;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(matrix[mid]==target)
                return true;
            else if(target>matrix[mid])
                low=mid+1;
            else
                high=mid-1;
        }
        return false;
    }
}