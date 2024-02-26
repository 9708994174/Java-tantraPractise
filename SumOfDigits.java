public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        int sum = findSumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
    
    public static int findSumOfDigits(int n) {
        if (n == 0)
            return 0;
        else
            return n % 10 + findSumOfDigits(n / 10);
    }
}
