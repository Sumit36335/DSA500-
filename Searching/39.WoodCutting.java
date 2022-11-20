 public boolean isPossible(int[] trees, int cut, int requiredWood) {
        int wood = 0;
        for (int treeHeight : trees) {
            if (cut < treeHeight)
                wood += (treeHeight - cut);
        }

        return (wood >= requiredWood);
    }

    public int solve(int[] trees, int requiredWood) {
        int left = 0, right = 1000000;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isPossible(trees, mid, requiredWood) == true) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
