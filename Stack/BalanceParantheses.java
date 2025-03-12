import java.util.*;

class BalanceParantheses{
    public static void main(String[] args) {
        String str = "[]{}[]()[()]";
        System.out.println(checkParantheses(str));
     }
     
     static boolean checkParantheses(String str) {
         Stack<Character> st = new Stack<>();
         if(str.length() % 2 != 0) {
             return false;
         }
         else{
             for(int i=0; i<str.length(); i++) {
                 if(str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '('){
                     st.push(str.charAt(i));
                 }
                 while(!st.isEmpty() && st.peek() == str.charAt(i) ){
                     st.pop();
                 }
             }
         }
         return st.isEmpty();
     }
}