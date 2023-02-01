static ArrayList<String> res;
	public static void helper(String input,int idx, String output,int skip)
	{
		if(idx==input.length())
		{
			if(skip>0)res.add(output+skip);
			else res.add(output);
			return;
		}
		char ch = input.charAt(idx);
		
		//yes

		if(skip>0)helper(input,idx+1,output+skip+ch,0);
		else helper(input,idx+1,output+ch,0);

		//no 
		helper(input,idx+1,output,skip+1);
	}
	public static ArrayList < String >findAbbr(String str) {
		// Write your code here.
		res=new ArrayList<>();
		helper(str,0,"",0);
		Collections.sort(res);
		return  res;
	
	}
