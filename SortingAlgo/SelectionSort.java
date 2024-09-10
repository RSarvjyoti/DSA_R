/**
 * SelectionSort
 */
public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};

        sort(arr);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void sort(int arr[]) {

        // get min and swap them

        // step-1
        int n = arr.length;

        for(int i=0; i<=n-2; i++) {
            int mini = i;
            for(int j=i; j<=n-1; j++) {
                
                if(arr[j] < arr[mini]) {
                    mini = j;
                }

            }
            
            // swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;

        }

    }
    
}