import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password:");
        String password = scanner.nextLine();

        int score = 0;

        if (password.length() >= 8) {
            score++;
        }
        if (password.matches(".*[A-Z].*")) {
            score++;
        }
        if (password.matches(".*[a-z].*")) {
            score++;
        }
        if (password.matches(".*[0-9].*")) {
            score++;
        }
        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            score++;
        }

        switch (score) {
            case 5:
                System.out.println("Your password is very strong.");
                break;
            case 4:
                System.out.println("Your password is strong.");
                break;
            case 3:
                System.out.println("Your password is medium.");
                break;
            default:
                System.out.println("Your password is weak.");
                break;
        }
        scanner.close();
    }
}
