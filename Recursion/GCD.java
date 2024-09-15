public class GCD {
    public static void main(String[] args) {
        int a = 51, b = 68;
        System.out.println(gcd(a, b));
    }

    static int gcd(int a, int b) {
        if(a == 0) return b;
        return gcd(b % a, a);
    }
}
