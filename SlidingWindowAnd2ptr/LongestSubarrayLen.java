// Longest subarray with sum <= k

public class LongestSubarrayLen {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 7, 10 };
        int k = 14;

        System.out.println(twoTtrAndSW(arr, k));

    }


    // Brute force : TC = O( n ^ 2 )
    static int[] bruteForce(int arr[], int k) {
        int maxLen = 0;
        int maxSum = 0;

        int res[] = new int[2];

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {

                sum = sum + arr[j];
                if (sum <= k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                    maxSum = Math.max(maxSum, sum);

                } else {
                    break;
                }
            }

        }

        res[0] = maxLen;
        res[1] = maxSum;

        return res;
    }


    // Better approach : 2 ptr and SW TC = N + N => O(2N)
    static int twoTtrAndSW(int arr[], int k) {
        int maxLen = 0, left = 0, right = 0, sum  = 0;
        while (right < arr.length) {
            sum = sum + arr[right];
            if(sum > k) {
                sum = sum - arr[left];
                left++;
            }
            if(sum <= k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
        }

        return maxLen;
    }

}