class Merge2Array {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {5,6,7,8};
        mergeArr(arr1, arr2);
    }    

    static void mergeArr(int arr1[], int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int temp[] = new int[n1 + n2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2) {
            if(arr1[i] < arr2[j]){
                temp[k] = arr1[i];
                i++;
                k++;
            }else{
                temp[k] = arr2[j];
                j++;
                k++;
            }

            while (i < arr1.length) {
                temp[k] = arr1[i];
                i++;
                k++;
            }

            while (j < arr2.length) {
                temp[k] = arr2[j];
                j++;
                k++;
            }
        }

        for(int l=0; l<temp.length; l++) {
            System.out.print(temp[l] + " ");
        }

    }

}
