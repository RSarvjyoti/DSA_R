class MaxSumWindowSize{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int k = 3;
        System.out.println(maxSumSizeK(arr, k));
    }
    
    static int maxSumSizeK(int arr[], int k){
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
}