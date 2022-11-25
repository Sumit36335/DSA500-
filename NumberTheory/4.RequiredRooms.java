static int gcd(int A, int B)
    {
        if(A%B==0)return B;
        return gcd(B,A%B);
    }
    static int rooms(int N, int M){
        // code here
        int roomSize= gcd(N,M);
        int minRooms= N/roomSize +M/roomSize;
        return minRooms;
    }
