import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        do {
            System.out.print("Player A, enter your move (R/P/S): ");
            String playerA = scanner.nextLine();

            while (!isValidMove(playerA)) {
                System.out.print("Invalid move! Please enter R, P, or S: ");
                playerA = scanner.nextLine();
            }

            System.out.print("Player B, enter your move (R/P/S): ");
            String playerB = scanner.nextLine();

            while (!isValidMove(playerB)) {
                System.out.print("Invalid move! Please enter R, P, or S: ");
                playerB = scanner.nextLine();
            }

            System.out.println("Player A: " + playerA);
            System.out.println("Player B: " + playerB);

            if (playerA.equalsIgnoreCase(playerB)) {
                System.out.println("It's a tie!");
            } else if ((playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) ||
                    (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) ||
                    (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P"))) {
                System.out.println("Player A wins!");
            } else {
                System.out.println("Player B wins!");
            }

            System.out.print("Play again? (Y/N): ");
            playAgain = scanner.nextLine();
        } while (playAgain.equalsIgnoreCase("Y"));

        scanner.close();
    }

    private static boolean isValidMove(String move) {
        return move.equalsIgnoreCase("R") || move.equalsIgnoreCase("P") || move.equalsIgnoreCase("S");
    }
}