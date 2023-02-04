public class Solution {
    static int []dx={-1,-1,+1,+1,+2,+2,-2,-2};
    static int []dy={+2,-2,-2,+2,-1,+1,-1,+1};

    static ArrayList<ArrayList<Integer>> chess;
    static int  rows,cols;
    public static boolean dfs(int r, int c , int count)
    {
        if((rows*cols)== count)return true;
        if(r<0 || r>=rows || c<0 || c>=cols)return false;
        if(chess.get(r).get(c)!=-1)return false;

        for(int i=0;i<8;i++)
        {
            chess.get(r).set(c,count);
            if(dfs( r+dx[i] , c+dy[i] ,count+1)==true)return true;
            else chess.get(r).set(c,-1);
        }
        return false;
    }
    public static ArrayList<ArrayList<Integer>> knightTour(int n, int m) {
       rows= n;
       cols =m;
       chess=new ArrayList<>();
       for(int i=0;i<rows;i++)
       {
           ArrayList<Integer>row = new ArrayList<>();
           for(int j=0;j<cols;j++)
           {
               row.add(-1);
           }
           chess.add(row);
       }
       dfs(0,0,0);
       return chess;
    }
}
