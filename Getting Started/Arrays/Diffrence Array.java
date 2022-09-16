import java.io.*;
import java.util.*;

public class Main{
public static int[] diffrence (int [] arr1,int [] arr2)
{
    int[] res= new int[arr2.length];
    int i=arr1.length-1;
    int j= arr2.length-1;
    int k = res.length-1;
    int b=0;
    while(j>=0)
    {
        int d1= (i>=0)?arr1[i]:0;
        int d2= arr2[j];
        if(d2-d1+b<0)
        {
            res[k]=d2-d1+b+10;
            b=-1;
        }
        else
        {
            res[k]=d2-d1+b;
            b=0;
        }
        i--;
        j--;
        k--;
        
    }
    return res;
}
public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n1 =sc.nextInt();
    int [] arr1= new int[n1];
    for(int i=0;i<n1;i++)
    {
        arr1[i]= sc.nextInt();
    }
    
    int n2 =sc.nextInt();
    int [] arr2= new int[n2];
    for(int i=0;i<n2;i++)
    {
        arr2[i]= sc.nextInt();
    }
    int[]res= diffrence(arr1,arr2);
    int idx=0;
    while(idx<res.length && res[idx]==0)
    {
        idx++;
    }
    if(idx== res.length)
    {
        System.out.println("0");
    }
    while(idx<res.length)
    {
        System.out.println(res[idx]);
        idx++;
    }
    
    }

}
