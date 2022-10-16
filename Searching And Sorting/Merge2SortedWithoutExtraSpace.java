public void merge(int[] nums1, int n1, int[] nums2, int n2) {
        int ptr1=n1-1;
        int ptr2=n2-1;
        int ptr3=n1+n2-1;
        while(ptr1>=0 && ptr2>=0)
        {
            if(nums1[ptr1]>nums2[ptr2])
            {
                nums1[ptr3]=nums1[ptr1];
                ptr1--;
                ptr3--;
            }
            else
            {
                nums1[ptr3]=nums2[ptr2];
                ptr2--;
                ptr3--;
            }
        }
        while(ptr1>=0)
        {
                nums1[ptr3]=nums1[ptr1];
                ptr1--;
                ptr3--;
        }
        while(ptr2>=0)
        {
                nums1[ptr3]=nums2[ptr2];
                ptr2--;
                ptr3--;
        }
    }
