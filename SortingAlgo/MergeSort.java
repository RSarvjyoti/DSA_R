import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {10, 9, 8, 5, 2 , 3};
        int n = arr.length;
        mergeSort(arr, 0, n-1 );

        for(int i = 0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void mergeSort(int arr[], int low, int high) {
        if(low >= high) {
            return;
        }

        int mid = (low + high )/ 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);

    }

    static void merge(int arr[], int low, int mid, int high) {

        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

         // transfering all elements from temporary to arr //
         for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

    }

}
