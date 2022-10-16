 public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer>contain= new ArrayList<>();
        int ptr1=0;
        int ptr2=0;
        
        while(ptr1<nums1.length && ptr2<nums2.length)
        {
            if(nums1[ptr1]<nums2[ptr2])
            {
                ptr1++;
            }
            else if(nums1[ptr1]> nums2[ptr2])
            {
                ptr2++;
            }
            else
            {
                int val= nums1[ptr1];
                contain.add(val);
                
                while(ptr1<nums1.length && nums1[ptr1]== val)
                {
                    ptr1++;
                }
                
                while(ptr2<nums2.length && nums2[ptr2]== val)
                {
                    ptr2++;
                }
            }            
        }
        int[] res= new int[contain.size()];
            for(int i=0;i<res.length;i++)
            {
                res[i] = contain.get(i);
            }
        return res;
    }
