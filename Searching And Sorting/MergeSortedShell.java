public static void swap(int[] arr, int i1, int i2)
    {
        int temp=arr[i1];
        arr[i1]= arr[i2];
        arr[i2]=temp;
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i=0;i<nums2.length;i++)
        {
            nums1[m+i]=nums2[i];
        }
        
        for(double gap =(m+n)/2.0 ; gap>=1.0; gap=gap/2.0)
        {
            int ceil=(int)Math.ceil(gap);
            gap=ceil;
            for(int i=0;i+ceil<m+n;i++)
            {
                if(nums1[i]>nums1[i+ceil])
                {
                    swap(nums1,i,i+ceil);
                }
            }
       }
    }
