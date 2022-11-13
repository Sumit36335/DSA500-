public static int lowerbound(int[] nums, int target) {
        // Same as First Occurence
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return left;
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int right=lowerbound(arr,x);
        int left= right-1;

        List<Integer>res= new ArrayList<>();
        while(left>=0 && right< arr.length && res.size()<k)
        {
            if(x-arr[left]<=arr[right]-x)
            {
                res.add(arr[left]);
                left--;
            }
            else{
                res.add(arr[right]);
                right++;
            }
        }
        while(left>=0 &&res.size()<k)
        {
                res.add(arr[left]);
                left--;

        }
        while(right<arr.length && res.size()<k)
        {
            res.add(arr[right]);
            right++;

        }

        Collections.sort(res);
        return res;
    }
