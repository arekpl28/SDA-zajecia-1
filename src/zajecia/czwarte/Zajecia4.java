package zajecia.czwarte;


import java.util.Scanner;

public class Zajecia4 {
    public static void main(String[] args) {

//        printLessThan(5);
//        System.out.println();
//        printEvenLessThan(5);
//        System.out.println();
//        System.out.println(sumOfLessThan(5));
//        System.out.println(productOfNumbers(5));
//        System.out.println(fahrenheitToCelsius(68));
//        System.out.println(celsiusToFahrenheit(20));
//        int[] array = {1, 2, 3, 4, 6};
//        statistics(array);



    }



    public static void statistics(int[] array) {
        System.out.println("Avg of elements is: " + avg(array));
        System.out.println("Sum Of elements: " + sumOfEllement(array));
        System.out.println("Produkt of element: " + productElement(array));
        System.out.println("Number of even elements is: " + sumOfEven(array));
        System.out.println("Number of odd elements is: " + sumOfOdd(array));
    }

    public static int sumOfEllement(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int allElements(int[] array) {
        return array.length;
    }

    public static double avg(int[] array) {
        double avg = (double) sumOfEllement(array) / array.length;
        return avg;
    }

    public static int productElement(int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        return product;
    }

    public static int sumOfEven(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isEven(array[i]))
                sum++;
        }
        return sum;
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOfOdd(int[] array) {
        return array.length - sumOfEven(array);
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static int productOfNumbers(int number) {
        int product = 1;
        for (int i = 1; i <= number; i++) {
            product *= i;

        }
        return product;
    }

    public static int sumOfLessThan(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static void printEvenLessThan(int number) {
        for (int i = 0; i < number; i += 2) {
            System.out.print(i + " ");

        }
    }

    public static void printLessThan(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.print(i + " ");
        }
    }
}
