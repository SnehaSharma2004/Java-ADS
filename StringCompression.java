package Class;

import java.util.*;
import java.io.*;

public class StringCompression {
    public int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }

        int insertIndex = 0;
        char currentChar = chars[0];
        int charCounter = 0;

        for (char character : chars) {
            if (currentChar == character) {
                charCounter++;
                continue;
            }
            chars[insertIndex++] = currentChar;
            currentChar = character;
            if (charCounter != 1) {
                insertIndex = fillCounter(chars, charCounter, insertIndex);
                charCounter = 1;
            }
        }

        chars[insertIndex++] = currentChar;
        if (charCounter != 1) {
            insertIndex = fillCounter(chars, charCounter, insertIndex);
        }

        return insertIndex;
    }

    private int fillCounter(char[] chars, int charCounter, int insertIndex) {
        int digits = (int) Math.log10(charCounter);

        while (digits >= 0) {
            int divisor = (int) Math.pow(10, digits);
            int leftDigit = charCounter / divisor;

            chars[insertIndex++] = (char) ('0' + leftDigit);

            charCounter %= divisor;
            digits--;
        }
        return insertIndex;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();

        StringCompression sc = new StringCompression();
        int compressedLength = sc.compress(chars);

        System.out.print("Compressed string: ");
        for (int i = 0; i < compressedLength; i++) {
            System.out.print(chars[i]);
        }
        System.out.println("\nCompressed length: " + compressedLength);

        scanner.close();
    }
}
