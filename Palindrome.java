import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int n = str.length();
        if (isPalindrome(str, 0, n - 1)) {
            System.out.println("Yes, " + str + " is a palindrome");
        } else {
            System.out.println("No, " + str + " is not a palindrome");
        }
    }
    
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }}