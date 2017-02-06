package zajecia.czwarte;


import java.util.Scanner;

public class ZadaniaZeScannerem {
    public static void main(String[] args) {

//        scannerExample();
//        checkNumberFromUser();
//        listNumbersFromUser();
//        compareThreeNumbersFromUser();
//        listEvenNumbersFromUser();
//        int[] array = {1, 2, 3, 4, -1, -2, -3};
//        System.out.println("Min: " + min(array));
//        System.out.println("Max: " + max(array));
//        System.out.println("Grade system 2000 z.o.o");
//        double avg = avgOfGrades();
//        System.out.println("Avg of your grades is: " + avg);
//        calculator();
        bmi();

    }

    public static void bmi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULATOR BMI");
        System.out.println("---------------------------------");
        System.out.print("Please enter your height in centimeters: ");
        double height = scanner.nextDouble();
        if (height > 20 && height < 500) {
            System.out.print("Please enter your weight: ");
            int weight = scanner.nextInt();
            System.out.println("---------------------------------");
            if (weight > 10) {
                double hightBmi = height / 100;
                double bmi = weight / (hightBmi * hightBmi);
                System.out.println("Your BMI is: " + bmi);
                System.out.println("---------------------------------");
                if (bmi <= 18.5) {
                    System.out.println("You have underweight.");
                } else if (bmi > 18.5 && bmi < 25) {
                    System.out.println("You have an appropriate weight.");
                } else if (bmi >= 25 && bmi < 30) {
                    System.out.println("You are overweight");
                } else if (bmi >= 30 && bmi < 35) {
                    System.out.println("You have 1 degree of obesity");
                } else if (bmi >= 35 && bmi < 40) {
                    System.out.println("You have 2 degree of obesity");
                } else {
                    System.out.println("You have 3 degree of obesity");
                }
            } else {
                System.out.println("Incorrect data entered !!!!!!!!!");
            }
        } else {
            System.out.println("---------------------------------");
            System.out.println("Incorrect data entered !!!!!!!!!");
        }
    }

    public static void calculator() {
        System.out.println("CALCULATOR");
        System.out.println("---------------------------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("---------------------------------");
        int number = getNumberFromUser("Choose your decision: ");
        if (number >= 0 && number < 5) {
            System.out.println("---------------------------------");
            int firstNumber = getNumberFromUser("Insert first number: ");
            int secondNumber = getNumberFromUser("Insert second number: ");
            System.out.println("---------------------------------");
            if (secondNumber != 0) {
                System.out.print("Your result is: ");
                if (number == 1) {
                    System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                } else if (number == 2) {
                    System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                } else if (number == 3) {
                    System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                } else {
                    System.out.println(firstNumber + " / " + secondNumber + " = " + ((double) firstNumber / secondNumber));
                }
            } else {
                System.out.println("Incorrect data entered !!!!!!!!!");
                System.out.println("---------------------------------");
            }
        } else {
            System.out.println("---------------------------------");
            System.out.println("Incorrect data entered !!!!!!!!!");
            System.out.println("---------------------------------");
        }
    }

    public static double avgOfGrades() {
        int size = getNumberFromUser("Insert numbers of grades: ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = getNumberFromUser("Insert " + (i + 1) + " grade: ");
        }
        double avg = Zajecia4.avg(array);
        return avg;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void listEvenNumbersFromUser() {
        int a = getNumberFromUser();
        Zajecia4.printEvenLessThan(a);
    }

    public static void compareThreeNumbersFromUser() {
        int a = getNumberFromUser();
        int b = getNumberFromUser();
        int c = getNumberFromUser();

        System.out.println("max: " + max(a, b, c));
        System.out.println("min: " + min(a, b, c));
    }

    public static int max(int a, int b, int c) {
        int[] array = {a, b, c};
        return max(array);
    }

    public static int min(int a, int b, int c) {
        int[] array = {a, b, c};
        return min(array);
    }

    public static void listNumbersFromUser() {
        Zajecia4.printLessThan(getNumberFromUser());
    }

    public static int getNumberFromUser() {
        return getNumberFromUser("Please insert you number");
    }

    public static int getNumberFromUser(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    public static void checkNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number: ");
        int number = scanner.nextInt();
        if (Zajecia4.isEven(number)) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }

    public static void scannerExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your name");
        String name = scanner.nextLine();
        System.out.println("Please insert your last name");
        String lastName = scanner.nextLine();

        System.out.println("Your name is: " + name + " " + lastName);
    }
}
