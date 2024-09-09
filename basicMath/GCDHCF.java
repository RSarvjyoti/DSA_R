/**
 * GCDHCF
 */
public class GCDHCF {

    public static void main(String[] args) {
        int a = 12, b = 16;
        gcd(a, b);
        hcf(a, b);
    }

    static void gcd(int a, int b) {

        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        if(a == 0) {
            System.out.println(b);
        }

        if (b == 0) {
            System.out.println(a);
        }

    }

    static void hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }
    
}