/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void reverse(int [] arr,int lo , int hi)
    {
            if(lo>= hi)return;
            int temp = arr[lo];
            arr[lo]= arr[hi];
            arr[hi]=temp;
            reverse(arr, lo+1,hi-1);
            
    }
    public static void display(int []arr)
    {
        for(int l=0;l<arr.length;l++)
        {
            System.out.print(arr[l]+" ");
        }
        System.out.println();
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-- >0)
		{
		    int n = sc.nextInt();
		    int [] arr= new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]= sc.nextInt();
		    }
		    reverse(arr,0,n-1);
		    display(arr);
		}
		
	}
}
