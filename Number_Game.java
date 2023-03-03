import java.util.Scanner;


public class Number_Game {
    public static void main(String[] args) {
        System.out.println("Welcome to Number Guessing Game ☺");
        // Generating a Random Number from 1 to 100 
        int Answer =  (int) (Math.random() * 100) + 1;
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter the Number of Chances by you're Choice : ");
         // Chance are Created to represent Number of Trials
        int Chance = sc.nextInt(); 
        boolean correct = false;
        while(Chance > 0) {
            System.out.println("Enter the Guessed Number broo ");
            int Guess = sc.nextInt();
            // IF Guesser Chooses the right answer 
            if(Guess == Answer) {
                System.out.print("You're Right the correct answer is " + Answer);
            }
            else if(Guess > Answer) {
                System.out.println("You're entered Number is Comparitively High ....Please take another "   + (Chance - 1)+ " Chance");
                Chance--;
            }
            else {
                System.out.println("You're Guess is too low compared to the Answer....Please utilize the Chances " + (Chance-1) + " left");
            }
            Chance--;
        }
        if(correct == false) {
            System.out.println("You can GET IT Try Harder Again......All the Best BROO ☺☻♥");
        }
        System.out.println("The Correct Answer is " + Answer);
    }
}