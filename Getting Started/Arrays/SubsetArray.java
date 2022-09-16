
public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr= new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]= sc.nextInt();
    }
    for(int sp=0;sp<n;sp++)
    {
        for(int ep=sp;ep<n;ep++)
        {
            for(int k=sp;k<=ep;k++)
            {
                System.out.print(arr[k]+"\t");
            }
            System.out.println();
        }
    }
 }
