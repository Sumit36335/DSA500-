class Solution {
        public boolean isPossible(int [] piles,long speed, long totaalHours)
    {
        long hoursReq=0;
        for(int banana:piles)
        {
            hoursReq+=banana/speed;
             if(banana%speed!=0)hoursReq++;
        }
        if(hoursReq<=totaalHours)return true;
        else return false; 
    }
    public long maxinArray(int [] piles)
    {
        int max=0;
        for(int banana:piles)
        {
            max=Math.max(max,banana);
        }
        return max;
    }
    public int smallestDivisor(int[] piles, int h) {
         long left=1l;
        long right=maxinArray(piles);

        while(left<=right)
        {
            long mid=left+(right-left)/2l;
            if(isPossible(piles,mid,h)==true)right=mid-1;
            else left=mid+1;
        }
        return (int)left;
        
    }
}
