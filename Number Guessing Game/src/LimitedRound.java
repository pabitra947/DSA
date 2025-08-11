import java.util.*;


public class LimitedRound {

    private static void guessingNumberGame(){
        Scanner sc = new Scanner(System.in);

        // finding number
        int number = 1 + (int)(100 * Math.random());

        //limit
        int limit = 5;

        System.out.println("A number is chosen between 1 and 100.");
        System.out.println("You have " + limit + " attempts to guess the correct number.");

        for(int i = 1; i <= 5; i++){

            System.out.println("Enter your guess: ");
            int guess = sc.nextInt();

            if(guess == number){
                System.out.println("Congratulations! You guessed the correct number.");
                return;
            }

            else if(guess < number){
                System.out.println("The number is greater than " + guess);
            }
            else{
                System.out.println("The number is smaller than " + guess);
            }
        }

        System.out.println("You've exhausted all attempts. The correct number was: " + number);
    }

    public static void main(String[] args) {
        guessingNumberGame();
    }
}