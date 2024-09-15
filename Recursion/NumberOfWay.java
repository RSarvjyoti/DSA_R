public class NumberOfWay {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fun(n));
    }

    static int fun(int n) {
        if(n == 0) return 1;
        if(n < 0) return 0;
        return fun(n - 1) + fun( n - 2) + fun( n - 3);
    }

}
