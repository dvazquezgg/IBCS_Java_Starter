package datatypes;

import java.util.Scanner;

/**
 * Choose a floating-point type: 1 - float, 2 - double
 * 2
 * Enter two double values: 3.5
 * 3.2
 * Result (double): 6.7
 * Binary (IEEE 754): 100000000011010110011001100110011001100110011001100110011001101
 *
 * Choose a floating-point type: 1 - float, 2 - double
 * 1
 * Enter two float values: 3.5
 * 3.2
 * Result (float): 6.7
 * Binary (IEEE 754): 1000000110101100110011001100110
 *
 *
 * Choose a floating-point type: 1 - float, 2 - double
 * 1
 * Enter two float values: 1.0
 * 3.0
 * Result (float): 0.33333334
 * Binary (IEEE 754): 111110101010101010101010101011
 *
 * Choose a floating-point type: 1 - float, 2 - double
 * 2
 * Enter two double values: 1.0
 * 3.0
 * Result (double): 0.3333333333333333
 * Binary (IEEE 754): 11111111010101010101010101010101010101010101010101010101010101
 *
 * Process finished with exit code 0
 *
 *
 * Choose a floating-point type: 1 - float, 2 - double
 * 1
 * Enter two float values: 1
 * 0
 * Result (float): 1.0
 * Binary (IEEE 754): 111111100000000000000000000000
 */

public class FloatingPointTester {

    final static int LONG_SIZE = 32;
    final static int DOUBLE_SIZE = 64;

    public static String formatBinaryString(String binaryString, int size) {
        if (binaryString.length() < size) {
            return "0".repeat(size - binaryString.length()) + binaryString;
        }
        return binaryString;
    }

    public static String printBinaryNibbles(String binaryString) {
        StringBuffer output = new StringBuffer();
        for (int i = 0; i < binaryString.length(); i += 4) {
            output.append(binaryString.substring(i, Math.min(i + 4, binaryString.length())) + " ");
        }
        return output.toString();
    }

    public static void printBinary(double value) {
        String binaryString = formatBinaryString(Long.toBinaryString(Double.doubleToRawLongBits(value)), DOUBLE_SIZE);

        System.out.println("Binary (IEEE 754): " + printBinaryNibbles(binaryString));
        System.out.println("Binary (IEEE 754)  Sign: " + (binaryString).substring(0, 1));
        System.out.println("Binary (IEEE 754)  Exponent: " + printBinaryNibbles((binaryString).substring(1, 12)));
        System.out.println("Binary (IEEE 754)  Mantissa: " + printBinaryNibbles((binaryString).substring(12)));
    }

    public static void printBinary(float value) {
        String binaryString = formatBinaryString(Integer.toBinaryString(Float.floatToRawIntBits(value)), LONG_SIZE);

        System.out.println("Binary (IEEE 754): " + printBinaryNibbles(binaryString));
        System.out.println("Binary (IEEE 754)  Sign: " + (binaryString).substring(0, 1));
        System.out.println("Binary (IEEE 754)  Exponent: " + printBinaryNibbles((binaryString).substring(1, 9)));
        System.out.println("Binary (IEEE 754)  Mantissa: " + printBinaryNibbles((binaryString).substring(9)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose a floating-point type: 1 - float, 2 - double, 3 - Single Precision, 4 - Double Precision, 5 - Exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter two float values: ");
                float f1 = scanner.nextFloat();
                float f2 = scanner.nextFloat();
                float result = f1 + f2;
                System.out.println("Result (float): " + result);
                printBinary(result);
            } else if (choice == 2) {
                System.out.print("Enter two double values: ");
                double d1 = scanner.nextDouble();
                double d2 = scanner.nextDouble();
                double result = d1 + d2;
                System.out.println("Result (double): " + result);
                printBinary(result);
            } else if (choice == 3) {
                System.out.print("Enter one Single Precision values: ");
                float f1 = scanner.nextFloat();
                System.out.println("Result (Single Precision): " + f1);
                printBinary(f1);
            } else if (choice == 4) {
                System.out.print("Enter one Double Precision values: ");
                double d1 = scanner.nextDouble();
                System.out.println("Result (Double Precision): " + d1);
                printBinary(d1);
            } else if (choice == 5) {
                System.exit(0);
            }
        }
    }
}

