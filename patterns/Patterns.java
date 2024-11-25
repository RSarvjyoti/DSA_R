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
        System.out.println();
        p10(n);
        System.out.println();
        p11(n);;
        System.out.println();
        p12(n);
        System.out.println();
        p13(n);
        System.out.println();
        p14(n);
        System.out.println();
        p15(n);
        System.out.println();
        p16(n);
        System.out.println();
        p17(n);
        System.out.println();
        p18(n);
        System.out.println();
        p19(n);
        System.out.println();
        // p20(n);
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

    static void p10(int n ) {

        for(int i =1; i<=2*n - 1; i++) {

            // star
            int star = i > n ? 2 * n - i : i;

            for(int j =1; j<=star; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    static void p11(int n) {
        
        for(int i=0; i<n; i++) {

            for(int j =0; j<=i; j++) {
                if(j%2 == i%2) {
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }

            System.out.println();

        }
    }

    static void p12(int n) {
        for(int i=1; i<=n; i++) {
            // numbers
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            // space
            for(int j=1; j<=(2*n - 2*i); j++) {
                System.out.print(" ");
            } 
            // numbers
            for(int j=1; j<=i; j++) {
                System.out.print(i-j+1);
            }

            System.out.println();
        }
    }

    static void p13(int n) {
        int num = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    static void p14(int n) {
        for(int i=0; i<n; i++) {
            for(char ch = 'A'; ch<='A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void p15(int n) {
        for(int i=0; i<n; i++) {
            for(char ch = 'A'; ch<='A' + n - i - 1; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void p16(int n) {
       for(int i=0; i<n; i++) {
        char ch = (char)('A' + i);
        for(int j=0; j<=i; j++) {
            System.out.print(ch + " ");
        }
        System.out.println();
       }
    }

    static void p17(int n) {
        for(int i=0; i<n; i++) {
            // spaces
            for(int j =0; j<n - i - 1; j++) {
                System.out.print(" ");
            }

            // characters
            char ch = 'A';
            int breakPoint = (2*i+1)/2;
            for(int j=1;j<=2*i+1; j++) {
                System.out.print(ch);
                if(j <= breakPoint) {
                    ch++;
                }else{
                    ch--;
                }
    
            }
            // spaces
            for(int j =0; j<n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void p18(int n) {
        for(int i=0; i<n; i++) {
            for(char ch = (char)('E' - i); ch <='E'; ch++) {
                System.out.print(ch+ " ");
            }
            System.out.println();
        }
    }

    static void p19(int n) {
        // top
        int space = 0;
        for(int i =1; i<=n; i++) {
            // star
            for(int j =1; j<=n -i+1; j++) {
                System.out.print("*");
            }
            // space
            for(int j =1; j<=space; j++) {
                System.out.print(" ");
            }
            // star
            for(int j =1; j<=n -i+1; j++) {
                System.out.print("*");
            }
            space += 2;
            System.out.println();
        }

        // bottom
        int spaceB =8;
        for(int i=1; i<=n; i++) {
            // star
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            // space
            for(int j =1; j<=spaceB; j++){
                System.out.print(" ");
            }
            // star
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            spaceB -= 2;
            System.out.println();
        }

    }

    static void p20(int n) {

    }

    static void p21(int n) {

    }

    static void p22(int n) {

    }

}