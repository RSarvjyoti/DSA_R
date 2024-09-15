public class Recursion1 {
    public static void main(String[] args) {
        int n = 345, r = 10;
        System.out.println(foo(n, r));
    }


    static int foo(int n, int r) {
        if(n > 0) {
            return ((n%r) + foo(n/r, r));
        }else {
            return 0;
        }
    }
}
