 public int[] sortArray(int[] nums) {
     int max=50000, min=-50000;
     int[]freq= new int[max-min+1];
     for(int val:nums)freq[val-min]++;   
     int []res= new int[nums.length];
     int idx=0;
     for(int actual=0;actual<freq.length;actual++)
     {
         int val= actual+min;
         for(int  count=0; count<freq[actual];count++)
         {
             res[idx++]=val;
         }
     }
     return res;
    }
