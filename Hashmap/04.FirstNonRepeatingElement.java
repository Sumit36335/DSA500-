  public int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
         HashMap<Integer,Integer>freq= new HashMap<>();
        
        for(int key:arr)
        {
            freq.put(key,freq.getOrDefault(key,0)+1);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(freq.get(arr[i])==1)return arr[i];
        }
        return 0;
    }  
