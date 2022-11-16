class Solution {
    int findKRotation(int nums[], int n) {
        // code here
         
        if(n==1 || nums[0]<nums[n-1])return 0;

        int left=0;
        int right=n-1;

        while(left<=right)
        {
            int mid= left+(right-left)/2;
            if(mid>0 && nums[mid]<nums[mid-1])return mid;
            else if(nums[mid]<=nums[right])right=mid-1;
            else left=mid+1;
        }
        return -1;
    }
}
