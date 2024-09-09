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

    // Function to convert a number to binary and print
    public static void printBinary(long value) {
        System.out.println("Binary: " + Long.toBinaryString(value));
    }

    public static void main(String[] args) {
        // Starter main logic
        System.out.println("Choose a data type: 1 - byte, 2 - short, 3 - int, 4 - long");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // To be completed by students: logic to handle arithmetic based on data type
    }
}
