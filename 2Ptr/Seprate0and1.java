class Seprate0and1 {
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,0,1,0,0,0,1};
        seprate0and1(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void seprate0and1(int arr[]){
        int l = 0;
        int r = arr.length - 1;
        while (l<r) {
            while (l<r && arr[l]==0) {
                l++;
            }
            while (l<r && arr[r] == 1) {
                r--;
            }
            if(arr[l] == 1 && arr[r] == 0){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
    }
}