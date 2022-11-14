public class Solution {
	public static int equalIndex(ArrayList<Integer> arr, int n){
        // Write your code here.
        for(int i=0;i<n;i++)
        {
            if(arr.get(i)==i)return arr.get(i);
        }
        return -1;
        
    }
}
