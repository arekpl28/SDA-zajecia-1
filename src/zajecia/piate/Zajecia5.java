package zajecia.piate;

import zajecia.czwarte.ZadaniaZeScannerem;

import java.util.Random;

public class Zajecia5 {
    public static void main(String[] args) {
//        square(4);
//        triangle(7);
//        tree(3);
//        oneMatrix(6);
//        evenMatrix(8);
//        sumOfNumberFromUser();
//        Random random = new Random();
//        int iloscKrokowDoZwyciestwa = game(random.nextInt(100));
//        System.out.println("Koniec gry.");
//        System.out.println("Wygrales w " + iloscKrokowDoZwyciestwa + " krokach.");
        int[] wynik = arrayOfNumbersFromUser();
        printArray(wynik);
    }
//    public static int errayFromUser( int [] array, int []array2){
//
//    }

    public static int game(int number) {
        int counter = 0;
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser("Insert your number: ");
            counter++;
            if (numberFromUser < number) {
                System.out.println("Twoja liczba jest za mala. Proba" + "[" + counter + "]");
            } else if (numberFromUser > number) {
                System.out.println("Twoja liczba jest za duza. Proba" + "[" + counter + "]");
            } else {
                flag = false;
            }
        }
        return counter;
    }

    public static int[] arrayOfNumbersFromUser() {
        int[] tmpArray = new int[100];
        int size = 0;
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser("Insert your number: ");
            if (numberFromUser != 0) {
                tmpArray[size] = numberFromUser;
                size++;
            } else {
                flag = false;
            }
        }
        return revriteArray(tmpArray, size);
    }

    public static int[] revriteArray(int[] bigArray, int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = bigArray[i];
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("}");
    }

    public static int sumOfNumberFromUser() {
        int sum = 0;
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser("Insert next number: ");
            if (numberFromUser != 0) {
                sum += numberFromUser;

            } else {
                flag = false;
            }
        }
        return sum;
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
