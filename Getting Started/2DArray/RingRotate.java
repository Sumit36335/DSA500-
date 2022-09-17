public static void main(String[] args) throws Exception {
        // write your code here4
        Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();
        int col= sc.nextInt();
        
        int [][] arr= new int[rows][col];
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]= sc.nextInt();
                
            }
        }
        int s= sc.nextInt();
        int r= sc.nextInt();
        Shellrotate(arr,s,r);
        display(arr);
        
    }
    public static void Shellrotate(int[][] arr,int s,int r)
    {
        int[] OneD=fillOneDfromShell(arr,s);
        rotate(OneD,r);
        fillShellFromOneD(arr,s,OneD);
    }
    public static int [] fillOneDfromShell(int[][] arr, int s)
    {
        int minr=s-1;
        int minc=s-1;
        int maxr=arr.length-s;
        int maxc=arr[0].length-s;
        int size=2*(maxr-minr+1)+2*(maxc-minc+1)-4;
        int[] array=new int[size];

        int idx=0;
        for(int i=minr, j=minc;i<=maxr;i++)
        {
            array[idx]=arr[i][j];
            idx++;
        }

        for(int i=maxr, j=minc+1;j<=maxc;j++)
        {
            array[idx]=arr[i][j];
            idx++;
        }
        for(int i=maxr-1, j=maxc;i>=minr;i--)
        {
            array[idx]=arr[i][j];
            idx++;
        }
        for(int i=minr, j=maxc-1;j>=minc+1;j--)
        {
            array[idx]=arr[i][j];
            idx++;
        }
        return array;

        
    }
    public static void  fillShellFromOneD(int[][] arr, int s,int[]oneD)
    {
        int minr=s-1;
        int minc=s-1;
        int maxr=arr.length-s;
        int maxc=arr[0].length-s;


        int idx=0;
        for(int i=minr, j=minc;i<=maxr;i++)
        {
            arr[i][j]=oneD[idx];
            idx++;
        }

        for(int i=maxr, j=minc+1;j<=maxc;j++)
        {
            arr[i][j]=oneD[idx];
            idx++;
        }
        for(int i=maxr-1, j=maxc;i>=minr;i--)
        {
            arr[i][j]=oneD[idx];
            idx++;
        }
        for(int i=minr, j=maxc-1;j>=minc+1;j--)
        {
            arr[i][j]=oneD[idx];
            idx++;
        }
    }
    public static void rotate(int [] arr,int k)
    {
        int n =arr.length;
        k=k%n;
        if(k<0)
        {
            k=k+n;
        }
        
        reverse(arr,0,n-k-1 );
        reverse(arr,n-k,n-1 );
        reverse(arr,0,n-1);
    }
    public static void reverse(int []arr,int lo,int hi)
    {
        while(lo < hi)
        {
            int temp=arr[lo];
            arr[lo]=arr[hi];
            arr[hi]=temp;
            lo++;
            hi--;
        }
    }
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
