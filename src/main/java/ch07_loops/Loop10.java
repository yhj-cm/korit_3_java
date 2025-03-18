package ch07_loops;
/*



 */

import java.util.Scanner;

public class Loop10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


                for (int i = 0 ; i < 6 ; i++) {
            for (int j = 0 ; j < i ; j++) {
                System.out.print("✨");
            }
            System.out.println();
        }
        for (int i = 5 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("✨");
            }
            System.out.println();
        }

        for (int i = 0 ; i < 6 ; i++) {
            for (int j = 0 ; j < i ; j++) {
                System.out.print("✨");
            }
            System.out.println();
        }
        for (int i = 4 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("✨");
            }
            System.out.println();
        }

    }
}
