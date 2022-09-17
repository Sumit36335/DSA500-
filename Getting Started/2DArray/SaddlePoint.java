    public static void main(String[] args) throws Exception {
        // write your code here
         Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();
        
        int [][] arr1= new int[rows][rows];
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<rows;j++)
            {
                arr1[i][j]= sc.nextInt();
                
            }
        }
        for(int i=0;i< arr1.length;i++)
        {
            int flag=0;
            int smallj=0;
            for(int j=1;j<arr1[0].length;j++)
            {
                if(arr1[i][smallj]>arr1[i][j])
                {
                    smallj=j;
                }
            }
            for(int k=0;k<arr1.length;k++)
            {
                if(arr1[k][smallj]>arr1[i][smallj])
                {
                   flag=1;
                   break;
                }
            }
            if(flag==0) {

                System.out.println(arr1[i][smallj]);
                return;
            }
        }
        System.out.println("Invalid input");

    }
