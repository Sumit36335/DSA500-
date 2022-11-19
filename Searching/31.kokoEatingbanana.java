// 1 approach  using linear search (TLE) 
class Solution {

    // using linear search 
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

    
    public int minEatingSpeed(int[] piles, int h) {
        long max=maxinArray(piles);
        for(long speed=1;speed<=max;speed++)
        {
            if(isPossible(piles,speed,h)==true)return (int)speed;
        }
        return (int)max;
    }
}


// 2 approach using binary search

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


    public int minEatingSpeed(int[] piles, int h) {
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
