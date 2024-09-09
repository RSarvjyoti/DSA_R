class CountDigit{
    public static void main(String[] args) {
        int n = 11223;
        count_digit(n);
    }

    static void count_digit(int n) {
        int count = 0;
        
        while(n > 0) {
            int rem = n % 10;
            count++;
            n = n / 10;
        }

        System.out.println(count);
    }
}