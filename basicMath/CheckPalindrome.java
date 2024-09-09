/**
 * CheckPalindrome
 */
public class CheckPalindrome {

    public static void main(String[] args) {
        int n = 121;
        checkPalindrome(n);
    }

    static void checkPalindrome(int n) {
        int rev = 0;
        int duplicate = n;
        while (n > 0) {
            int rem = n % 10;
            rev = (rev*10) + rem;
            n = n / 10;
        }

        if(duplicate == rev) {
            System.out.println("Number is a palindrome");
        }else{
            System.out.println("Number is not a palindrome");
        }
    }
}