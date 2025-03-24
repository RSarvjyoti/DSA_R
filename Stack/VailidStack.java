import java.util.*;
class VailidStack {
    public static void main(String[] args) {
        int a1[] = {1,2,3,4,5};
        int a2[] = {4,5,3,1,2};
        System.out.println(vailidStack(a1,a2));
    }
   
    static boolean vailidStack(int in[], int out[]) {
        Stack<Integer> st = new Stack<>();
        int n = in.length;
        int j = 0;
        for(int i=0; i<n; i++) {
            st.push(in[i]);
            while(!st.isEmpty() && j < n && st.peek() == out[j]){
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }
}