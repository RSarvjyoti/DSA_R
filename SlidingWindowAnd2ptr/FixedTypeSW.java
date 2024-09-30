class FixedTypeSW {
    public static void main(String[] args) {
        
        int arr[] = {-1,2,3,3,4,5,-1};

        // fixed size of window
        int k = 4;
        System.out.print(findSubArrayMaxSum(arr, k));
    }

    static int findSubArrayMaxSum(int arr[], int k) {
        int n = arr.length;
        int sum = 0, maxSum = 0;

        int l = 0, r = k - 1;

        for(int i=0; i<=r; i++) {
            sum += arr[i];
        }

        while (r < n - 1) {
            sum = sum - arr[l];
            l++;
            r++;
            sum = sum + arr[r];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;

    }

}