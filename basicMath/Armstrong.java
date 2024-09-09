/**
 * Armstrong
 */
public class Armstrong {

    public static void main(String[] args) {
        int n = 371;

        if(armstrongNum(n)) {
            System.out.println("This is a Armstrong number");
        }else {
            System.out.println("This is not a Armstrong number");
        }

    }

    static boolean armstrongNum (int n) {
        int sum = 0;
        int duplicate = n;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }

        if(sum == duplicate) {
            return true;
        }else {
            return false;
        }

    }
}