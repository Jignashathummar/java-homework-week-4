package written_homework_week4;

import java.util.Scanner;

/**
 * Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class Programme_15_LeftTriangleStar {
    public static void leftTriangle(int x) {
        int i, j;
        for (i = 1; i <= x; i++) {
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int a = sc.nextInt();
        leftTriangle(a);
        // closing the scanner object
        sc.close();
    }
}
