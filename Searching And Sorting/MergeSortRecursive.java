class Solution {
    public static int[] mergeArray(int[] left,int[] right)
    {
        int ptr1=0;
        int ptr2=0;
        int ptr3=0;
        int[] res = new int [left.length+right.length];
         while(ptr1<left.length && ptr2<right.length)
         {
             if(left[ptr1]<=right[ptr2])
             {
                 res[ptr3]= left[ptr1];
                 ptr1++;
                 ptr3++;
             }
             else
             {
                 res[ptr3]= right[ptr2];
                 ptr2++;
                 ptr3++;
             }
         }
        while(ptr1<left.length)
        {
           
                 res[ptr3]= left[ptr1];
                 ptr1++;
                 ptr3++;
            
        }
        while(ptr2<right.length)
        {
                 res[ptr3]= right[ptr2];
                 ptr2++;
                 ptr3++;
        }
        return res;
    }
    public static  int[] mergesort(int [] arr, int l,int r)
    {
        int mid=(l+r)/2; 
        if(l==r)
        {
            int[]arr1=new int[1];
            arr1[0]=arr[l];
            return arr1;
        }
        int[] left = mergesort(arr,l,mid);
        int[] right = mergesort(arr,mid+1,r);
        return mergeArray(left,right);
    }
    public int[] sortArray(int[] nums) {
        return mergesort(nums,0,nums.length-1);
    }
}
