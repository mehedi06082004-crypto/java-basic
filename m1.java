import java.util.Scanner;

public class m1
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a character
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Convert to lowercase for easy comparison
        ch = Character.toLowerCase(ch);

        // Check if vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowel.");
        } else {
            System.out.println(ch + " is NOT a Vowel.");
        }

        sc.close();
    }
}
