import java.util.Scanner;

public class DigitLettersAndOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] chars = input.toCharArray();

        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                System.out.print(aChar + "");
            }
        }
        System.out.println();
        for (char aChar : chars) {
            if (Character.isAlphabetic(aChar)) {
                System.out.print(aChar + "");
            }
        }
        System.out.println();
        for (char aChar : chars) {
            if (!Character.isDigit(aChar) && !Character.isAlphabetic(aChar)) {
                System.out.print(aChar + "");
            }
        }

    }
}
