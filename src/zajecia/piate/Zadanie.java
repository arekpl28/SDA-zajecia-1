package zajecia.piate;


import zajecia.czwarte.ZadaniaZeScannerem;

public class Zadanie {
    public static void main(String[] args) {

        int[] array = arrayOfNumbersFromUser();
        printArrayNumberFromUser(array);

    }

    public static int[] arrayOfNumbersFromUser() {
        int[] array = new int [10];
        boolean flag = true;
        while (flag) {
            int numberFromUser = ZadaniaZeScannerem.getNumberFromUser("Insert your number form 0 to 9: ");
            if (numberFromUser >= 0 && numberFromUser < 10) {
                array[numberFromUser]++;
            } else {
                flag = false;
            }
        }
        return array;
    }

    public static void printArrayNumberFromUser(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                System.out.print("");
            } else {
                for (int j = 0; j < array[i]; j++) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println("]");
    }
}
