public boolean  binary(int[][] arr, int i,int target)
    {
         int low=0;
         int high=arr[0].length-1;
         while(low<=high)
         {
             int mid= low+(high-low)/2;
             if(arr[i][mid]<target)
             {
                 low=mid+1;
             }
             else if(arr[i][mid]>target)
             {
                 high=mid-1;
             }
             else 
             {
                 return true;
             }
         }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
    //     for(int i=0;i<matrix.length;i++)
    //     {
    //         if(target>=matrix[i][0] && target<=matrix[i][matrix[0].length-1])
    //         {
    //             boolean val = binary(matrix,i,target);
    //             if(val== true)
    //             {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
        
        int i =0;
        int j= matrix[0].length-1;
        while(i<matrix.length && j>=0)
        {
            if(matrix[i][j]== target)
            {
                return true;
            }
            else if(matrix[i][j]>target)
            {
                j--;
            }
            else 
            {
                i++;
            }
        }
        return false;
    }
}
