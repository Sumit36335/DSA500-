 public int gcd(int A, int B)
    {
        if(A%B==0)return B;
        return gcd(B,A%B);
    }
    public int findGCD(int[] arr) {
        Arrays.sort(arr);
        int gcd1= gcd(arr[0],arr[arr.length-1]);
        return gcd1;
    }
