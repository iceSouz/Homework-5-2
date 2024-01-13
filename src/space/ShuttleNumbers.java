package space;

import java.util.Arrays;
import java.util.Random;

public class ShuttleNumbers {
    public static final int NUMBER_SPACE_SHUTTLES = 100;
    public static final int[] UNLUCKY_DIGITS = new int[] {4, 9};
    public static final int LOWER_NUMBER = 1;
    public static final int UPPER_NUMBER = 200;

    public static void main(String[] args) {
        int[] shuttleNumbers = new int[NUMBER_SPACE_SHUTTLES];
        Random random = new Random();

        for (int i = 0; i < NUMBER_SPACE_SHUTTLES; i++) {
            int number = random.nextInt(UPPER_NUMBER - LOWER_NUMBER) + LOWER_NUMBER;

            if (isContainsUnluckyNumber(number)) {
                i--;
                continue;
            }

            shuttleNumbers[i] = number;
        }

        System.out.println("ShuttleNumbers = " + Arrays.toString(shuttleNumbers));
    }

    private static boolean isContainsUnluckyNumber(int number) {
        while (number > 0) {
            int digit = number % 10;

            if (digit == UNLUCKY_DIGITS[0] || digit == UNLUCKY_DIGITS[1]) {
                return true;
            }

            number /= 10;
        }

        return false;
    }
}
