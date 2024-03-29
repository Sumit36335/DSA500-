class Solution {
    public double power(double x, long n) {
        if (n == 0) return 1.0;

        double smallAns = power(x, n / 2);
        double bigAns = smallAns * smallAns;
        
        if (n % 2 == 1)
            bigAns = bigAns * x;
        return bigAns;
    }

    public double myPow(double x, int n) {
        if (n < 0)
            return power(1 / x, -1l * n);
        return power(x, n);
    }
}
