package app.leetCode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        boolean flag = true;
        if (x < 0)
            flag = false;
        else {
            int rev = 0;
            int rem;
            int num = x;
            while (x != 0) {
                rem = x % 10;
                rev = (rev * 10) + rem;
                x = x / 10;
            }
            if (rev != num)
                flag = false;
        }
        return flag;
    }
}
