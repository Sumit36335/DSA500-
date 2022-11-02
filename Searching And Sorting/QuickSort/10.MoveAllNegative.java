public void swap(int[]arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void Approach1(int[]arr,int n)
    {
        int left=0;
        int right=n-1;
        int[]res=new int[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0)
            {
                res[left]=arr[i];
                left++;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]<0)
            {
                res[right]=arr[i];
                right--;
            }
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=res[i];
        
        }
    }
    //TLE
    public void Approach2(int[]arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                continue;
            }
            else
            {
                for(int j=i-1;j>=0;j--)
                {
                    if(arr[j]<0)
                    {
                        swap(arr,j,j+1);
                    }
                    else
                    {
                        break;
                    }
                }
            }
        }
    }
    public void Approach3(int[]arr,int left,int right )
    {
        if(left==right)return ;
        int mid=(left+right)/2;
        Approach3(arr,left,mid);
        Approach3(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    public void merge(int[]arr,int left,int mid,int right)
    {
        int p1=left;
        int p2=mid+1;
        while(p1<=mid && arr[p1]>=0)p1++;
         while(p2<=right && arr[p2]>=0)p2++;
         reverse(arr,p1,mid);
         reverse(arr,mid+1,p2-1);
         reverse(arr,p1,p2-1);
        
    }
    public void reverse(int[]arr,int i,int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void segregateElements(int arr[], int n)
    {
        // Approach1(arr,n);
        // Approach2(arr,n);
        Approach3(arr,0,n-1);
    }
