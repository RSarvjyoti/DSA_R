import java.util.Stack;

class NGERight {
    public static void main(String[] args) {
        int arr[] = {7,2,4,6,9,3,8,11};
        nseLet(arr);
    }

    static void nseLet(int arr[]){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int res[] = new int[n];
        res[n-1] = -1;
        st.push(n-1);
        for(int i=n-2; i>=0; i--){
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            if(!st.isEmpty()){
                res[i] = arr[st.peek()];
            }
            else{
                res[i] = -1;
            }
            st.push(i);
        }

        for(int i=0; i<n; i++){
            System.out.print(res[i] + " ");
        }
    }
}
