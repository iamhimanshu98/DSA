
import java.util.Scanner;

class Armstrong {
    public int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            int result = base;
            for (int i = 1; i < exponent; i++) {
                result = result * base;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Armstrong arm = new Armstrong();
            System.out.print("Enter a number: ");
            int num, count = 0, temp, digit;
            int result = 0;
            num = sc.nextInt();
            temp = num;
            while (temp > 0) {
                count++;
                temp = temp / 10;
            }
            temp = num;
            while (temp > 0) {
                digit = temp % 10;
                result += arm.power(digit, count);
                temp /= 10;
            }
            if (num == result) {
                System.out.println("Armstrong");
            } else {
                System.out.println("Not Armstrong");
            }

            sc.close();
        }
    }
}
