public static List<Integer> symmetric(int[]nums1,int[]nums2)
    {
        int ptr1=0;
        int ptr2=0;
        List<Integer>list= new ArrayList<>();
        while(ptr1<nums1.length && ptr2<nums2.length)
        {
            if(nums1[ptr1]<nums2[ptr2])
            {
                if( list.size()==0 || list.get(list.size()-1)!= nums1[ptr1] )
                {
                    list.add(nums1[ptr1]);
                }
                ptr1++;
            }
            else if(nums1[ptr1]>nums2[ptr2])
            {
                ptr2++;
            }
            else
            {
                int val= nums1[ptr1];
                while(ptr1<nums1.length && nums1[ptr1]== val)
                {
                    ptr1++;
                }
            }
        }
        while(ptr1<nums1.length)
        {
            if(list.size()==0 || list.get(list.size()-1)!= nums1[ptr1])
                {
                    list.add(nums1[ptr1]);
                }
                ptr1++;
        }
        return list;
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>>list= new ArrayList<>();
        
        
       Arrays.sort(nums1);
       Arrays.sort(nums2);

        List<Integer>list1=symmetric(nums1,nums2);
        List<Integer>list2=symmetric(nums2,nums1);
        
        list.add(list1);
        list.add(list2);
        
        return list;
        
    }
