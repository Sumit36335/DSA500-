class Solution
{ 
    // Function to find starting and end index 
    static int first(int [] arr, int idx,int t)
    {
        if(idx==arr.length)return -1;
        if(arr[idx]==t)return idx;
        return first(arr,idx+1,t);
    }
    static int last(int [] arr, int idx,int t)
    {
        if(idx==-1)return -1;
        if(arr[idx]==t)return idx;
        return last(arr,idx-1,t);
    }
    // 2 approach 
    static int[] search(int [] arr, int idx,int key){
        if(idx==arr.length)return new int[]{-1,-1};
        int[] ans=search(arr,idx+1,key);
        
        if(arr[idx]==key)
        {
            ans[0]=idx;
            ans[1]=Math.max(ans[1],idx);
        }
        return ans;
    }
    static int[] findIndex(int a[], int N, int key) 
    { 
        //code here.
        // int fi=first(a,0,key);
        // int li=last(a,N-1,key);
        // int[] ans = new int[2];
        // ans[0]=fi;
        // ans[1]=li;
        // return ans;
        
        // 2 approach
        return search(a,0,key);
    }
}
