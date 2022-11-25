
    static Long gcd(Long A, Long B)
    {
        if(A%B==0)return B;
        return gcd(B,A%B);
    }
    static Long lcm(Long A,Long B)
    {
        Long prod=A*B;
        Long lcm =prod/gcd(A,B);
        return lcm;
    }
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long[]ans= new Long[2];
        ans[0]=lcm(A,B);
        ans[1]=gcd(A,B);
        return ans;
    }
