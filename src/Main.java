
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your digits");
        long n = input.nextLong();
        int sum = sumDigits(n);
        System.out.println("The sum is: " + sum);
    }

    public static int sumDigits(long n) {

        int num = (int) (n);
        int sum = 0;

        while (num > 0) {

            sum += num % 10;
            num = num / 10;

        }
        return sum;
    }
}


















