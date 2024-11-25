/**
 * CheckPrime
 */
public class CheckPrime {

    public static void main(String[] args) {
        int n = 13;
        if(checkPrime(n)) {
            System.out.println("This is a prime number.");
        }else {
            System.out.println("This is not a prime number.");
        }
    }

    static boolean checkPrime(int n) {
        int count = 0;
        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                count++;
            }
        }

        if(count == 2) {
            return true;
        }else {
            return false;
        }
    }

}