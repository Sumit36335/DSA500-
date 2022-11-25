static Long gcd(Long A, Long B)
    {
        if(A%B==0)return B;
        return gcd(B,A%B);
    }
    static List<Long> minimumSquares(long L, long B)
    {
        // code here
        Long side=gcd(L,B);
        Long squares= (L*B)/(side*side);
        
        List<Long> ans= new ArrayList<>();
        
        ans.add(squares);
        ans.add(side);
        
        return ans;
    }
