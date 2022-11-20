 public static boolean isPossible(int[] stalls, int minDist, int totalCows) {
        int placedCows = 1, lastIdx = 0;

        for (int currentIdx = 1; currentIdx < stalls.length; currentIdx++) {
            int dist = stalls[currentIdx] - stalls[lastIdx];

            if (dist >= minDist) {
                placedCows++;
                lastIdx = currentIdx;
            }
        }

        return (placedCows >= totalCows);
    }
    public int maxDistance(int[] stalls, int cows) {
           Arrays.sort(stalls);
        // To Find Adjacent Distance, Not to apply Binary Search
        int left = 1; // Minimum Possible Adjacent Distance
        int right = stalls[stalls.length - 1] - stalls[0];

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isPossible(stalls, mid, cows) == true) {
                left = mid + 1; // maximimize the minimum dist
            } else {
                right = mid - 1;
            }
        }

        return right;
    }
