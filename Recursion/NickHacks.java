/**
 * NickHacks
 */
public class NickHacks {

    public static void main(String[] args) {
        // int n = 25; // No
        int n = 10;

        boolean res = fun(n, 1);
        if(res) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }

    static boolean fun(int n, int initialAmout) {
        if(n == initialAmout) return true;
        if(initialAmout > n) return false;
        return fun(n, initialAmout * 10) || fun(n, initialAmout *20);
    }

    
}