package Palindrome;

public class Palindrome {

    public boolean solve(int k) {
        String kNumber = String.valueOf(Math.abs(k));
        String reverseNumber = new StringBuilder(kNumber).reverse().toString();
        return kNumber.equals(reverseNumber);
    }

}
