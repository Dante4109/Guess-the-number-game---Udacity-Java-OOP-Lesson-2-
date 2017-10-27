import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Game();
        EndGame();


    }

    public static void Game() {

        int ranNumber = (int) (Math.random() * 100) + 1;
        boolean gameOver = false;


        System.out.println("I have chosen a number from 1 - 100");
        System.out.println("Can you guess what it is?");

        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guess(es) left. Choose again: ");
            int guess = scanner.nextInt();

            if (ranNumber < guess) {
                System.out.println("Its smaller than " + guess + ",");
            } else if (ranNumber > guess) {
                System.out.println("Its larger than " + guess + ",");
            } else {
                gameOver = true;
                break;
            }
        }

        if (gameOver) {
            System.out.println("Correct you win!!!");
        } else {
            System.out.println("You are out of guesses");
            System.out.println("Game Over");
            System.out.println("The number was : " + ranNumber);
        }

        EndGame();

    }


    public static void EndGame(){
        System.out.println("Do you want to play again?");
        System.out.println("Type Y for yes");
        System.out.println("Type N for no");
        Scanner scan_answer = new Scanner(System.in);
        String answer = scan_answer.nextLine();

        if(answer.equals("y")||answer.equals("Y"))

        {
            System.out.println("Let's go");
            Game();
        }
        else {
            System.out.println("Later");
            System.exit(0);
        }
    }


}







