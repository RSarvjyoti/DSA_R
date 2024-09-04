/**
 * Patterns
 */
public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        System.out.println();
        p1(n);
        System.out.println();
        p2(n);
        System.out.println();
        p3(n);
        System.out.println();
        p4(n);
        System.out.println();
        p5(n);
        System.out.println();
        p6(n);
        System.out.println();
        p7(n);
        System.out.println();
        p8(n);
        System.out.println();
        p9(n);
    }

    static void p1(int n ) {
        for(int i =0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p2(int n ) {
        for(int i =0; i<n; i++) {
            for(int j = 0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p3(int n ) {
        for(int i =1; i<=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void p4(int n ) {
        for(int i =1; i<=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void p5(int n ) {
        for(int i =1; i<=n; i++) {
            for(int j = 1; j<=n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p6(int n ) {
        for(int i =1; i<=n; i++) {
            for(int j = 1; j<=n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void p7(int n) {

        for(int i=0; i<n; i++) {

            // Space 
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }

            // star
            for(int j=0; j<2*i+1; j++) {
                System.out.print("*");
            }

            // space
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }

    }

    static void p8(int n) {

        for(int i=0; i<n; i++) {

            // space
            for(int j =0; j<i; j++) {
                System.out.print(" ");
            }

            // star
            for(int j =0; j<2*n-(2*i+1); j++) {
                System.out.print("*");
            }

            // space
            for(int j =0; j<i; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }

    }
    static void p9(int n) {
        p7(n);
        p8(n);
    }

}