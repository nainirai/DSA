public class ValidPalindrome {
    public static boolean ValidPalindromecheck(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int l = 0;
        int r = s.length() - 1;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;

        }
        return true;

    }

    public static void main(String args[]) {
        String s = "A man, a plan, a canal: Panama";
        // boolean boolea = ValidPalindromecheck(s);
        System.out.println(ValidPalindromecheck(s));

    }
}
