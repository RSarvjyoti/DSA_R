/**
 * StringLength
 */
public class StringLength {

    public static void main(String[] args) {
        String str = "MasaiSchool";
        System.out.println(findLength(str));
    }

    static int findLength(String str) {
        if(str.isEmpty()) {
            return 0;
        }

        return 1 + findLength(str.substring(1));
    }
    
}