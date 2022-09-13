 public static void  reverse (int[] arr ,int i,int j)
    {
        while(i<j)
        {
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
		    int k= sc.nextInt();
		    int[] arr= new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]= sc.nextInt();
		    }
		    reverse(arr,0,k-1);
		    reverse(arr,k,n-1);
		    reverse(arr,0,n-1);
		    
		    // display
		    for(int i=0;i<n;i++)
		    {
		        System.out.print(arr[i]+" ");
		    }
		    System.out.println();
		}
		
	}
