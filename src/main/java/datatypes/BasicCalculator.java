package datatypes;

import java.util.Scanner;

public class BasicCalculator {

    // Function to get input and cast to chosen data type
    public static byte getByteInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a byte value: ");
        return scanner.nextByte();
    }

    public static short getShortInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a short value: ");
        return scanner.nextShort();
    }

    public static int getIntInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an int value: ");
        return scanner.nextInt();
    }

    public static long getLongInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a long value: ");
        return scanner.nextLong();
    }

    public static void printBinary(byte value) {
        System.out.println("Binary: " + Integer.toBinaryString(Byte.toUnsignedInt(value)));
    }

    public static void printBinary(short value) {
        System.out.println("Binary: " + Integer.toBinaryString(Short.toUnsignedInt(value)));
    }
    // Function to convert a number to binary and print
    public static void printBinary(long value) {
        System.out.println("Binary: " + Long.toBinaryString(value));
    }

    public static void printBinary(int value) {
        System.out.println("Binary: " + Integer.toBinaryString(value));
    }

    public static void main(String[] args) {
        // Starter main logic
        System.out.println("Choose a data type: 1 - byte, 2 - short, 3 - int, 4 - long");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt(); // Get user input into choice variable

        // To be completed by students: logic to handle arithmetic based on data type
        switch (choice) {
            case 1:
                byte byte1 = getByteInput();  // Get byte input into byte1 variable
                printBinary(byte1);  // Print binary of byte1
                byte byte2 = getByteInput();  // Get byte input into byte2 variable
                printBinary(byte2);  // Print binary of byte2
                byte resultByte = (byte) (byte1 + byte2);  // Add byte1 and byte2 and store in resultByte
                System.out.println("Result: " + resultByte);  // Print resultByte
                printBinary(resultByte);  // Print binary of resultByte
                break;
            case 2:
                short short1 = getShortInput();  // Get short input into short1 variable
                printBinary(short1);  // Print binary of short1
                short short2 = getShortInput();  // Get short input into short2 variable
                printBinary(short2);  // Print binary of short2
                short resultShort = (short) (short1 + short2);  // Add short1 and short2 and store in resultShort
                System.out.println("Result: " + resultShort);  // Print resultShort
                printBinary(resultShort);  // Print binary of resultShort
                break;
            case 3:
                int int1 = getIntInput();  // Get int input into int1 variable
                printBinary(int1);  // Print binary of int1
                int int2 = getIntInput();  // Get int input into int2 variable
                printBinary(int2);  // Print binary of int2
                int resultInt = int1 + int2;  // Add int1 and int2 and store in resultInt
                System.out.println("Result: " + resultInt);  // Print resultInt
                printBinary(resultInt);  // Print binary of resultInt
                break;
            case 4:
                long long1 = getLongInput();  // Get long input into long1 variable
                printBinary(long1);  // Print binary of long1
                long long2 = getLongInput();  // Get long input into long2 variable
                printBinary(long2);  // Print binary of long2
                long resultLong = long1 + long2;  // Add long1 and long2 and store in resultLong
                System.out.println("Result: " + resultLong);  // Print resultLong
                printBinary(resultLong);  // Print binary of resultLong
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
