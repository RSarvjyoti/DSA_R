/**
 * PrintAllDivisors
 */
public class PrintAllDivisors {

    public static void main(String[] args) {
        int n = 12;
        printAllDivisors(n);
    }

    static void printAllDivisors(int n) {

        for(int i = 1; i<=n; i++) {
            if(n % i == 0) {
                System.out.println(i);
            }
        }

    }
    
}