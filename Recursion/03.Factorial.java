class Solution{
    static long factorial(int N){
        // code here
        if(N==0)return 1;
        long sans=factorial(N-1);
        return N*sans;
    }
}
