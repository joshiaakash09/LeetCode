package PalindromeNumber;

public class palindromeNumber {
    public boolean isPalindrome(int x) {
        int result = 0;

        if ( x < 0 || ((x % 10 == 0) && x != 0)) return false;

        while(x > result) {
            int cur = x % 10;
            x /= 10;
            result = result * 10 + cur;
        }

        return x == result || x == result/10;
    }
}
