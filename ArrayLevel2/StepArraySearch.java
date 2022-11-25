public static int search (int arr[], int n, int target, int jump) {
        int i=0;
        while(i<n)
        {
            if(arr[i]==target)return i;
            int reqJump=Math.abs(arr[i]-target);
            int minimumJump=reqJump/jump;
            if(reqJump%jump!=0)minimumJump++;
            i=i+minimumJump;
        }
        return -1;
    }
