import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] rps = {"r", "p", "s" };
            String computerMove = rps[new Random().nextInt(rps.length)];
            String playerMove;
            while (true) {
                System.out.println("Enter your move (r , p or s)");
                playerMove = scanner.nextLine().toLowerCase();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move!");
            }

            System.out.println("Computer played: " + computerMove);
            if (playerMove.equals(computerMove)) {
                System.out.println("the game was a tie");
            } else if ((playerMove.equals("r") && computerMove.equals("s")) ||
                    (playerMove.equals("p") && computerMove.equals("r")) ||
                    (playerMove.equals("s") && computerMove.equals("p"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.println("Play again? (y/n)");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("y")) {
                break;
            }
        }
    }
}

