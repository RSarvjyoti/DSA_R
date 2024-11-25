public class ThreePointerSort {
    public static void sortColors(int[] nums) {
      int l = 0, m = 0, h = nums.length- 1;

      while (m <= h) {
        if(nums[m] == 0) {
            // swap low to mid
            int temp = nums[l];
            nums[l] = nums[m];
            nums[m] = temp;
            l++;
            m++;

        }else if(nums[m] == 1){
            m++;
        }else {
             // swap mid to high
             int temp = nums[m];
             nums[m] = nums[h];
             nums[h] = temp;
             h--;
        }
      }

    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        
        sortColors(nums);
        
        System.out.print("Sorted array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
