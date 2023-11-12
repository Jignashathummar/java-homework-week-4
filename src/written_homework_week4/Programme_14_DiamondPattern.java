package written_homework_week4;

import java.util.Scanner;

/**
 * 14 Write a program in Java to display the pattern like a diamond.
 * While loop
 * <p>
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */

public class Programme_14_DiamondPattern {
    public static void printDiamond(int r, char ch) {
        int i = 1;
        int j;
        while (i <= r) {
            j = 1;
            while (j++ <= r - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }
            System.out.println();
            i++;
        }
        i = r-1;
        while (i > 0) {
            j = 1;
            while (j++ <= r - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }
            System.out.println();
            i--;
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Row: ");
        int a = scanner.nextInt();
        System.out.print("Enter the Symbol: ");
        char ch = scanner.next().charAt(0);
        printDiamond(a, ch);
        // closing the scanner object
        scanner.close();
    }
}
