import java.util.Scanner;

class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }

        return product - sum;
    }
}

public class SubtractProductAndSumMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer n: ");
        int n = in.nextInt();

        Solution solution = new Solution();
        int result = solution.subtractProductAndSum(n);

        System.out.println("The difference between the product and sum of digits is: " + result);
    }
}

