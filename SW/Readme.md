## Sliding window
They are 2 types 
1. Given a window size
 - No. of subarray = (n - k + 1), where n = size of array, k = given size of window
 - Outer loop will going i = 0 to i < n - k + 1
 - Inner loop will going j = i to j < i + k
2. Variable size of window
 - No. of subarray = n * (n + 1) / 2
