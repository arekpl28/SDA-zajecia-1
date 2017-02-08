package zajecia.siodmy;

public class Zadanie {
    public static void main(String[] args) {
        String message1 = ")()())";
        System.out.println(message1);
        String message = repairsFirstWrongBracket(message1);
        System.out.println(repairsFirstWrongBracket(message1));
        System.out.println(checksBrackets(message));

    }

    public static String repairsFirstWrongBracket(String message1) {
        char[] charArray = message1.toCharArray();
        if (charArray[0] == 41) {
            charArray[0] = 40;
        }
        return String.valueOf(charArray);
    }

    public static boolean checksBrackets(String message) {
        char[] charArray = message.toCharArray();
        int sumOfBracket = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (sumOfBracket >= 0) {
                if (charArray[i] == 41) {
                    sumOfBracket--;
                    if (sumOfBracket < 0) {
                        return false;
                    }
                } else if (charArray[i] == 40) {
                    sumOfBracket++;
                }
            } else {
                return false;
            }
        }
        if (sumOfBracket != 0) {
            return false;
        }
        return true;
    }

}
