public static int firstRepeated(int[] arr, int n) {
        // Your code here
        
        HashMap<Integer,Integer>freq= new HashMap<>();
        
        for(int key:arr)
        {
            freq.put(key,freq.getOrDefault(key,0)+1);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(freq.get(arr[i])>1)return (i+1);
        }
        return -1;
    }
