 public  int lowerbound(int[] nums, int target) {
        // Same as First Occurence
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return left;
    }
    public int findClosest(int arr[], int target) 
    { 
        // Complete the function
        int lb=lowerbound(arr,target);
        if(lb==0)return arr[lb];
        if(lb==arr.length)return arr[lb-1];
        if(arr[lb]-target<=target-arr[lb-1])return arr[lb];
        else return arr[lb-1];
    }
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int Minradius=0;

        for(int val:houses)
        {
            int closest=findClosest(heaters,val);
            int radius=Math.abs(closest-val);
            Minradius=Math.max(radius,Minradius);
        }
        return Minradius;

    }
