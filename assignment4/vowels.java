package assignment4;
import java.util.Scanner;
public class vowels 
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        try {
            validateVowels(input);
            System.out.println("The string contains vowels.");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        
        scanner.close();
    }

    public static void validateVowels(String str) throws Exception {
        boolean hasVowels = false;

        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                hasVowels = true;
                break;
            }
        }

        if (!hasVowels) {
            throw new Exception("The string does not contain any vowels.");
        }
    }

    private static boolean isVowel(char c) {
        // Check if the character is a vowel
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}


