public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        String r = new StringBuilder(s).reverse().toString();
        return s.equals(r);
    }
}
