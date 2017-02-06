package zajecia.piate;


import zajecia.czwarte.ZadaniaZeScannerem;
import zajecia.czwarte.Zajecia4;

import java.util.Scanner;

public class Zajecia5 {
    public static void main(String[] args) {
//        square(4);
//        triangle(7);
//        tree(3);
//        oneMatrix(6);
        evenMatrix(8);
    }

    public static void evenMatrix(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(" 1");
                } else {
                    System.out.print(" 0");
                }
            }
            System.out.println();
        }
    }

    public static void oneMatrix(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == j) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
//    public static void oneMatrix(int number) {
//        for (int i = 0; i < number; i++) {
//            for (int j = 0; j < (i + 1) - 1; j++) {
//                System.out.print(" 0");
//            }
//            System.out.print(" 1");
//            for (int k = 0; k < (number - i) - 1; k++) {
//                System.out.print(" 0");
//            }
//            System.out.println();
//        }
//    }

    public static void tree(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");

        }
    }

    public static void triangle(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void square(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
