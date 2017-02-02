package zajecia;

public class Zajecia3 {
    public static void main(String[] args) {
        int[] numbers = {-5, -3, -1, 1, 3, 5};
        int sumOfNumbers = sumOf(numbers);
        System.out.println(sumOfNumbers);
    }

    public static boolean isPositive(int number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOf(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPositive(array[i])) {
                sum += array[i];
            }
        }
        return sum;
    }
}
