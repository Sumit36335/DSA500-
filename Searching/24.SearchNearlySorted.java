public static int  solve(int[] arr, int target) {
            
            int left=0;
            int right=arr.length-1;
            while(left<=right)
            {
                int mid= left+(right-left)/2;
                
                int lval=(mid==0)?Integer.MIN_VALUE:arr[mid-1];
                int rval=(mid==arr.length-1)?Integer.MAX_VALUE:arr[mid+1];
                
                if(arr[mid]==target)return mid;
                if(lval==target)return mid-1;
                if(rval==target)return mid+1;
                
                
                int min = Math.min(arr[mid],Math.min(rval,lval));
                int max = Math.max(arr[mid],Math.max(rval,lval));
                
                if(target<min)right=mid-2;
                else if(target>max) left=mid+2;
                else break;
            }
            return -1;
        
  }
