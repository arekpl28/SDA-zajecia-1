package zajecia.osiem;


public class Zajecia8 {
    public static void main(String[] args) {
//        System.out.println(factorial(4));
//        System.out.println(factorialRecursion(4));
//        System.out.println(fibonacciNumber(2));
//        System.out.println(fibonacciNumberRec(43));


    }

    public static int fibonacciNumberRec(int index) {
        if (index < 0) {
            return -1;
        }
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        return fibonacciNumberRec(index - 2) + fibonacciNumberRec(index - 1);
    }

    public static int fibonacciNumber(int index) {
        int left = 0;
        int right = 1;
        int result = 0;
        for (int i = 2; i < index; i++) {
            result = left + right;
            left = right;
            right = result;
        }
        return result;
    }

    public static long factorialRecursion(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        return number * factorialRecursion(number - 1);
    }

    public static long factorial(int number) {
        long sum = 1;
        for (int i = 2; i <= number; i++) {
            sum = sum * i;
        }
        return sum;
    }
}
