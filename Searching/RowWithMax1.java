public int search(int[][]arr, int row, int low,int high ) {
        while(low<=high)
        {
            int mid= (low)+(high-low)/2;
            if(arr[row][mid]==0)
            {
                low= mid+1;
            }
            else 
            {
                high=mid-1;
            }
        }
        return low;
    }
    int rowWithMax1s(int arr[][], int row, int col) {
        // code here
        int right=col-1;
        int ans=-1;
        
        for(int rows=0;rows<row;rows++)
        {
            int mid=search(arr,rows,0,right);
            if(mid<=right)
            {
                ans=rows;
                right=mid-1;
            }
        }
        return ans;
    }
