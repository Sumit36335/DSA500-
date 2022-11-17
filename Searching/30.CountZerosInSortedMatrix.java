 int countZeros(int A[][], int N)
    {
        // Your code here
        int i=0;
        int j=A[0].length-1;
        int count=0;
        while(i<A.length && j>=0)
        {
            if(A[i][j]==0)
            {
                count+=(j+1);
                i++;
            }
            else
            {
                j--;
            }
        }
        return count;
    }
