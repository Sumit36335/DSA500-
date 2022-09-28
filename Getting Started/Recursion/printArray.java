
class Solution {
    public static void display(int [] arr, int idx)
    {
        if(idx== arr.length)
        {
            return;
        }
        System.out.print(arr[idx]+" ");
        display(arr,idx+1);
    }
    //Just print the space seperated array elements
    void printArray(int arr[], int n) {
        //   code here
        
        display(arr,0);
    }
}
