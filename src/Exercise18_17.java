import java.util.Scanner;

public class Exercise18_17 {

    public static int count(char[] chars, char ch) {
        return count(chars, ch, chars.length - 1);
    }

    public static int count(char[] chars, char ch, int high) {
        if (high < 0)
            return 0;
        else if (chars[high] == ch)
            return 1 + count(chars, ch, high - 1);
        else
            return count(chars, ch, high - 1);
        }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String line = scanner.nextLine();

        char[] chars = new char[line.length()];
        for (int i = 0; i < line.length(); i++) {
            chars[i] = line.charAt(i);
        }

        System.out.print("Enter a character: ");
        String character = scanner.nextLine();
        char ch = character.charAt(0);

        System.out.println(ch + " appears " + count(chars, ch) + " times");
    }
}
