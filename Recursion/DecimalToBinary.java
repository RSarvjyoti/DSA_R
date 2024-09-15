public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 25;
        fun(n);
    }

    static void fun(int n) {
        if(n == 0) {
            return;
        }

         fun( n / 2);
         System.out.print(n % 2);

    }
}
