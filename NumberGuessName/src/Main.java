import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int getRandomNumber(){
        Random rand = new Random();
        int randomNumber = rand.nextInt(50);
        return randomNumber;
    }

    public static int userGuess(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter guess: ");
        int guessNumber = scan.nextInt();
        return guessNumber;
    }

    public static void main(String[] args) {

        int count = 5;
        int randomNumber = getRandomNumber();

        while (count>0){
            int guessNumber = userGuess();
            if(randomNumber > guessNumber){
                System.out.println("Up");
            }else if(randomNumber < guessNumber){
                System.out.println("Down");
            }else {
                System.out.println("Right Guess");
                break;
            }
            count--;
        }
        if(count == 0){
            System.out.println("Game Over: " + randomNumber);
        }
    }
}
