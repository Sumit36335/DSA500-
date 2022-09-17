public List<Integer> spiralOrder(int[][] matrix) {
     
        int row= matrix.length;
        int column= matrix[0].length;
        int count=0;
        int fr=0;
        int fc=0;
        int lr= row-1;
        int lc= column-1;
        ArrayList<Integer> list = new ArrayList<>();
        while(count!= row*column)
        {
            //first row
            for(int j=fc;j<=lc;j++)
            {
                list.add(matrix[fr][j]);
                count++;
            }
            fr++;
            if(count== row*column)break;
            
            // last column
            for(int i=fr;i<=lr;i++)
            {
                list.add(matrix[i][lc]);
                count++;
            }
            lc--;
            if(count== row*column)break;
            
            // last row
            for(int j=lc;j>=fc;j--)
            {
                list.add(matrix[lr][j]);
                count++;
            }
            lr--;
            if(count== row*column)break;
            
            // first column
            for(int i=lr;i>=fr;i--)
            {
                list.add(matrix[i][fc]);
                count++;
            }
            fc++;
            if(count== row*column)break;
            
        }
        return list;
    }
