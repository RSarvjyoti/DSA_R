import java.util.*;
class Triplate{
    public static void main(String[] args) {
        int arr[] = {8,4,3,2,1,5,6,7};
        int target = 12;
        System.out.println(triplate(arr,target));
    }
    
    static boolean triplate(int arr[], int k){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 0; i<=n-3; i++){
            int l = i+1;
            int r = n - 1;
            while(l<r){
                if(arr[i] + arr[l] + arr[r] == k){
                    // System.out.print(arr[i] + " "+ arr[l] + " " + arr[r]);
                    return true;
                }else if(arr[i] + arr[l] + arr[r] < k){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return false;
    }
}