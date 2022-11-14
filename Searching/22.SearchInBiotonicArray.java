 public int searchInc(int[]arr,int left,int right,int target) {
        int low=0;
        int high= arr.length-1;
        while(low<=high)
        {
            int mid= (low)+(high-low)/2;
            if(arr[mid]>target)
            {
                high= mid-1;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else if(arr[mid]== target)
            {
                return mid;
            }
        }
        return -1;
    }
     public int searchDec(int[]arr,int left,int right, int target) {
        int low=0;
        int high= arr.length-1;
        while(low<=high)
        {
            int mid= (low)+(high-low)/2;
            if(arr[mid]>target)
            {
                high= mid-1;
            }
            else if(arr[mid]>target)
            {
                low=mid+1;
            }
            else if(arr[mid]== target)
            {
                return mid;
            }
        }
        return -1;
    }
     public int peakIndexInMountainArray(int[] arr) {
        int left=1;// out of bound se bachne 
        int right=arr.length-2;// out of bound se bachne 
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid]<arr[mid+1])
            {
                left= mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
    public int solve(int[] arr, int target) {
        int peak=peakIndexInMountainArray(arr);
        
        int lans=searchInc(arr,0,peak,target);
        if(lans!=-1)return lans;
        
        return searchDec(arr,peak+1,arr.length-1,target); 
        
        
    }
