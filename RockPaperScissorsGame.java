import java.util.Random;
import java.util.*;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the game...");

            Random rand = new Random();
            int com_num = rand.nextInt(3);
            System.out.println("Computer has made its choice.");

            int rock = 0;
            int paper = 1;
            int scissors = 2;
            String choice = "";

            if (com_num == rock) {
                choice = "rock";
            } else if (com_num == paper) {
                choice = "paper";
            } else if (com_num == scissors) {
                choice = "scissors";
            }

            System.out.println("Make a guess about the computer's choice.");
            System.out.println("Now, it's your turn.");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your number (0 = rock, 1 = paper, 2 = scissors): ");
            int my_num = sc.nextInt();

            if (my_num == rock) {
                System.out.println("You chose rock.");
            } else if (my_num == paper) {
                System.out.println("You chose paper.");
            } else if (my_num == scissors) {
                System.out.println("You chose scissors.");
            } else {
                System.out.println("Invalid choice.");
                return; // Exit if invalid choice
            }

            System.out.println("Computer chose " + choice + ".");

            if(com_num == my_num) {
                System.out.println("its a draw");
            }

            if(com_num == 0 && my_num == 2) {
                System.out.println("computer wins");
            } else if(com_num == 1 && my_num == 0) {
                System.out.println("computer wins");
            } else if(com_num == 2 && my_num == 1) {
                System.out.println("computer wins");
            }

            if(com_num == 0 && my_num == 1) {
                System.out.println("you won");
            } else if(com_num == 2 && my_num == 0) {
                System.out.println("you won");
            } else if(com_num == 1 && my_num == 2) {
                System.out.println("you won");
            }
        }      
    }
