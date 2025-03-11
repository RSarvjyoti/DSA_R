class MaxSumWindowSize{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int k = 3;
        System.out.println(aproach1(arr, k));
        System.out.println(aproach2(arr, k));
    }
    
    // TC = O(n.k),  SC = O(1)
    // - Outer loop will going i = 0 to i < n - k + 1
    // - Inner loop will going j = i to j < i + k
    static int aproach1(int arr[], int k){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n-k+1; i++){
            int sum = 0;
            for(int j = i; j<i+k; j++){
                sum = sum+arr[j];
            }
            max = Math.max(sum, max);
        }
        return max;
    }
    // SW aproach : 
    // - TC = O(n), SC = O(1);
    static int aproach2(int arr[], int k){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i<k; i++) {
            sum += arr[i];
        }

        max = sum;
        for(int i = k; i < n; i++){
            sum += arr[i] - arr[i- k];
            max = Math.max(max, sum);
        }


        return max;
    }
}