public int[] FindExitPoint(int[][] matrix)
    {
        // code here
        int [] res = new int[2];
        int i=0;
        int j=0;
        int dir=0;
        while(i>=0 && i< matrix.length && j>=0 && j<matrix[0].length)
        {
            if(matrix[i][j]==1)
            {
                matrix[i][j]=0;
                dir=(dir+1)%4;
                
            }
            if(dir==0)
            {
                j++;
            }
            else if(dir==1)
            {
                i++;
            }
            else if(dir==2)
            {
                j--;
            }
            else if(dir==3)
            {
                i--;
            }
        }
        
        if(dir==0)
        {
            j--;
        }
        else if(dir==1)
        {
            i--;
        }
        else if(dir==2)
        {
            j++;
        }
        else if(dir==3)
        {
            i++;
        }
        res[0]=i;
        res[1]=j;
        return res;
    }
