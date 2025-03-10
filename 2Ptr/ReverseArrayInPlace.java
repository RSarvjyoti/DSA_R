class ReverseArrayInPlace {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        reverseArr(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void reverseArr(int arr[]) {
        int l = 0, r = arr.length - 1;
        while (l<r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

}
