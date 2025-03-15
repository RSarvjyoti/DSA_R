import java.util.*;
class StockSpan {
    public static void main(String[] args) {
        int price[] = {10,20,30,40,50,60,70};
        findSpan(price);
        System.out.println();
        findSpanUsingStack(price);
      }
      
    //   Bruteforce TC = O(n^2)
      static void findSpan(int p[]){
          int n = p.length;
          int span[] = new int[n];
          span[0] = 1;
          for(int i=1; i<n; i++) {
              int count = 1;
              for(int j=i; j>0; j--) {
                  if(p[j] > p[j-1]){
                      count++;
                  }else{
                    break;
                  }
              }
              span[i] = count;
          }
          
          for(int i=0; i<n; i++) {
              System.out.print(span[i] + " ");
          }
          
      }

    //   Using stack TC = O(n)
    static void findSpanUsingStack(int p[]) {
        Stack<Integer> st = new Stack<>();
        int n = p.length;
        int res[] = new int[n];

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && p[st.peek()] <= p[i]) {
                st.pop();
            }
            if(!st.isEmpty()){
                res[i] = i - st.peek();
            }else{
                res[i] = i+1;
            }
            st.push(i);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}