/**
 * Power
 */
public class Power {

    public static void main(String[] args) {
        int a = 3, b = 4;
        System.out.println(power(a, b));
    }

    static int power(int a, int b) {
        if(b==0) {
            return 1;
        }

        return a * power(a, b - 1);
    }
    
}