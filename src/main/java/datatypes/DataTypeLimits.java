package datatypes;

public class DataTypeLimits {

    public static void printBinary(long value) {
        System.out.println("Binary: " + Long.toBinaryString(value));
    }

    public static void printBinary(double value) {
        System.out.println("Binary (IEEE 754): " + Long.toBinaryString(Double.doubleToRawLongBits(value)));
    }

    public static void main(String[] args) {
        System.out.println("Max and Min values:");
        System.out.println("byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        byte byteOverflow = (byte) (Byte.MAX_VALUE + 1);
        System.out.println("Overflowed byte: " + byteOverflow);
        printBinary(byteOverflow);

        long longOverflow = Long.MAX_VALUE + 1;
        System.out.println("Overflowed long: " + longOverflow);
        printBinary(longOverflow);
    }
}