  public static void reverse(int [] arr)
    {
        int  i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
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
		    reverse(arr);
		}
		
	}
