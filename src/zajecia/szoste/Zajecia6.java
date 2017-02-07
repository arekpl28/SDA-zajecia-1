package zajecia.szoste;


import zajecia.czwarte.ZadaniaZeScannerem;

import java.util.Scanner;

public class Zajecia6 {
    public static void main(String[] args) {

//        int numberOfElements = avgUntil(4);
//        System.out.println("Podano: "+numberOfElements+" liczb");

//        int numberOfElements = sumUntil(23);
//        System.out.println("Podano: "+numberOfElements+" liczb");
//        calculator();
//        System.out.println(cezarCode("Wojna"));
//        System.out.println(cezarCode("Hello World", 2));
//        System.out.println(cezarCode("The End", 4));
        System.out.println("Zakodowane: ");
        String message = "Wojna";
        String codded = cezarCode(message, 2);
        System.out.println(codded);

        System.out.println("Odkodowane: ");
        System.out.println(decodeCezarCode(codded, 2));

    }

    public static String decodeCezarCode(String coddedMessage, int key) {
        return cezarCode(coddedMessage, -key);
    }
    public static String decodeCezarCode(String coddedMessage) {
        return cezarCode(coddedMessage, -1);
    }


    public static String cezarCode(String message) {
        return cezarCode(message, 1);
    }

    public static String cezarCode(String message, int key) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] + key);
        }
        return String.valueOf(charArray);
    }

    public static void calculator() {

        boolean flag = true;
        while (flag) {
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnozenie");
            System.out.println("4. Dzielenie");
            System.out.println("0. Koniec");
            System.out.println("--------------------------------------");
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser("Podaj dzialanie:");
            if (numberFromUser == 0) {
                System.out.println("--------------------------------------");
                System.out.println("The end.");
                flag = false;
            } else if (numberFromUser > 0 && numberFromUser < 5) {
                int firstNumber = ZadaniaZeScannerem.getNumberFromUser("Instert first number: ");
                int secondNumber = ZadaniaZeScannerem.getNumberFromUser("Inster second number: ");
                switch (numberFromUser) {
                    case 1:
                        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                        System.out.println("--------------------------------------");
                        break;
                    case 2:
                        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                        System.out.println("--------------------------------------");
                        break;
                    case 3:
                        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                        System.out.println("--------------------------------------");
                        break;
                    case 4:
                        if (secondNumber != 0) {
                            System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                            System.out.println("--------------------------------------");
                        } else {
                            System.out.println("Wrong data!!!!!");
                            flag = false;
                        }
                        break;
                    case 0:
                        flag = false;
                        break;
                    default:
                        System.out.println("Wrong data!!!!");
                }
            } else {
                System.out.println("--------------------------------------");
                System.out.println("Wrong data!!!!!");
                System.out.println("--------------------------------------");
            }
        }
    }

    public static int avgUntil(int avg) {
        boolean flag = true;
        int sum = 0;
        int couter = 0;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser();
            sum += numberFromUser;
            couter++;
            if ((double) sum / couter > avg) {
                flag = false;
            }
        }
        return couter;
    }

    public static int sumUntil(int sum) {
        int counter = 0;
        int tmpSum = 0;
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser("Insert your number: ");
            counter++;
            tmpSum += numberFromUser;
            System.out.println("tmpSum: " + tmpSum);
            if (tmpSum > sum) {
                flag = false;
            }
        }
        return counter;
    }
}
