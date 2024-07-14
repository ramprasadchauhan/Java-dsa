import java.util.Scanner;

class Solution {
    static int reverse(int n) {
        int reverseNo = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            // Check for potential overflow before updating reverseNo
            if (reverseNo > Integer.MAX_VALUE / 10 || (reverseNo == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0; // Handle overflow case
            }
            if (reverseNo < Integer.MIN_VALUE / 10 || (reverseNo == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0; // Handle overflow case for negative numbers
            }
            reverseNo = reverseNo * 10 + lastDigit;
            n = n / 10;
        }
        return reverseNo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n));
    }
}
