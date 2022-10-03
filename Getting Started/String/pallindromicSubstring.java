import java.io.*;
import java.util.*;

public class Main {

    public static boolean pallindrome(String str)
    {
        int lo = 0;
        int hi = str.length()-1;
        while(lo<hi)
        {
            if(str.charAt(lo)!=str.charAt(hi))return false;
            lo++;
            hi--;
        }
        return true;
        
    }
	public static void solution(String str){
		//write your code here
		
		for(int i=0;i<str.length();i++)
		{
		    for(int j=i;j<str.length();j++)
		    {
		        String substr= str.substring(i,j+1);
		        if(pallindrome(substr)==true)
		        {
		            System.out.println(substr);
		        }
		    }
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
		
		
	}

}
