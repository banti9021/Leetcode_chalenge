public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // Negative numbers cannot be palindromes
        if (x < 0) {
            return false;
        }

        int n = x;
        int revNum = 0;

        // Reverse the integer
        while (n > 0) {
            int d = n % 10;
            revNum = revNum * 10 + d;
            n = n / 10;
        }

        // Check if the original number is equal to its reverse
        return revNum == x;
    }

    // Main method for testing the function
    public static void main(String[] args) {
        PalindromeNumber solution = new PalindromeNumber();
        
        // Test cases
        System.out.println(solution.isPalindrome(121)); // true
        System.out.println(solution.isPalindrome(-121)); // false
        System.out.println(solution.isPalindrome(10)); // false
        System.out.println(solution.isPalindrome(1221)); // true
    }
}
