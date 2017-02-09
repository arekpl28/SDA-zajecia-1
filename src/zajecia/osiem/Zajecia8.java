package zajecia.osiem;


import com.sun.org.apache.xpath.internal.SourceTree;
import zajecia.siodmy.Zajecia7;

public class Zajecia8 {
    public static void main(String[] args) {
//        System.out.println(factorial(4));

//        System.out.println(factorialRecursion(4));

//        System.out.println(fibonacciNumber(2));

//        System.out.println(fibonacciNumberRec(43));

//        String message = switchCase("Czesc jak sie masz");
//        System.out.println(message);

//        System.out.println(switchCase("Czesc AsassSS"));

//        System.out.println(switchCaseWithBuilder("sadDSADasdsaDASDas"));

//        System.out.println(sumOfNumberDigits(123));
        System.out.println(startsWith2("Ala ma kota", "Ala mae"));
        System.out.println(startsWith3("Ala ma kota", "Ala mae"));
        System.out.println(startsWith1("Ala ma kota", "Ala ma"));

    }

    public static boolean startsWith3(String message, String expression) {
        char[] messageAsCharArray = message.toCharArray();
        char[] expressionAsCharArray = expression.toCharArray();
        for (int i = 0; i < expressionAsCharArray.length; i++) {
            if (messageAsCharArray[i] != expressionAsCharArray[i]) {
                return false;
            }
        }
        return true;

    }

    public static boolean startsWith2(String message, String expression) {
        return message.substring(0, expression.length()).equals(expression);

    }

    public static boolean startsWith1(String message, String expression) {
        return message.startsWith(expression);

    }

    public static int sumOfNumbersDigitsWithString(int number) {
        String numberAsString = String.valueOf(number);
        return Zajecia7.sumFromString(numberAsString);

    }

    public static int sumOfNumberDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
//            number/=10;
            number = number / 10;
        }
        return sum;
    }

    public static String switchCaseWithBuilder(String message) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char tmp = message.charAt(i);
            if (tmp >= 65 && tmp <= 90) {
                stringBuilder.append((char) (tmp + 32));
            } else if (tmp >= 97 && tmp <= 122) {
                stringBuilder.append((char) (tmp - 32));
            } else {
                stringBuilder.append(tmp);
            }
        }
        return stringBuilder.toString();
    }

    public static String switchCase(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                charArray[i] += 32;
            } else if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            }
        }
        return String.valueOf(charArray);
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
