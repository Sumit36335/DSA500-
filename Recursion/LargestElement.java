class Compute {
    
    public int max(int []arr, int maximum,int idx)
    {
        if(idx>=arr.length)return maximum;
        if(arr[idx]>maximum) maximum = arr[idx];
        return max(arr,maximum,idx+1);
    }
    public int largest(int arr[], int n)
    {
        return max(arr,Integer.MIN_VALUE,0);
    }
}
