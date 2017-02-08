package zajecia.siodmy;


import zajecia.czwarte.ZadaniaZeScannerem;

import java.util.Random;
import java.util.Scanner;

public class Zajecia7 {
    public static void main(String[] args) {
//        String message="wojnaaaaafe    wfdsfeyzDSADASD" ;
//        printStringStatistics(stringStatics(message));

//        String message = randomLowerCase1(5);
//        System.out.println(message);
//        String message= "Ala_ma_kota";
//        System.out.println(cos(message));
//
//        String message = "kajak";
//        System.out.println(isPalindra(message));
        int sum = sumFromString("Ala ma 6 kotow i 9 psow");
        System.out.println("Ala ma " + sum + " zwierzat.");

    }

    public static int sumFromString(String message) {
        int sum = 0;
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 48 && charArray[i] <= 57) {
                sum += charArray[i] - 48;
            }
        }
        return sum;
    }

    public static boolean isPalindra(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static String reverseString(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            char tmp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = tmp;
//            char a = charArray[i];
//            char b = charArray[charArray.length - i-1];
//            char tmp = a;
//            a = b;
//            b = tmp;
//            charArray[i]=a;
//            charArray[charArray.length-i-1]=b;
        }
        return String.valueOf(charArray);
    }

    public static String cos(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 95) {
                charArray[i] = ' ';
            }
        }
        return String.valueOf(charArray);
    }

    public static String randomLowerCase1(int size) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int generatedValue = random.nextInt(26) + 97;
            stringBuilder.append((char) (generatedValue));
        }
        return stringBuilder.toString();
    }

    public static void printStringStatistic(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.print(array[i] + "" + (char) (i + 97) + " ");
            }
        }
    }

    public static String randomLowerCase(int size) {
        Random random = new Random();
        char[] chars = new char[size];
        for (int i = 0; i < chars.length; i++) {
            int generatedValue = random.nextInt(26) + 97;
            chars[i] = (char) generatedValue;
        }
        return String.valueOf(chars);
    }

    public static int[] stringStatics(String message) {
        int[] statisticsArray = new int[26];
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                int index = charArray[i] - 97;
                statisticsArray[index]++;
            }
        }
        return statisticsArray;
    }

    public static void printStringStatistics1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print((char) (i + 97));
            }
        }
    }
}
