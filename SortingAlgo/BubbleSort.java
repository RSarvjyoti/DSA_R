/**
 * BubbleSort
 */
public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {13, 46, 24,52,29,9};

        sort(arr);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    static void sort(int arr[]) {
        int n = arr.length;

        for(int i=n-1; i>=1; i--) {

            for(int j = 0; j<i; j++) {
                if(arr[j] > arr[j +1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

    }

}