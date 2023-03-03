import java.util.Scanner;


public class Number_Game {
    public static void main(String[] args) {
        System.out.println("Welcome to Number Guessing Game ☺");
        // Generate Random Number from 1 - 100 using Math package in java
        int Answer = (int) (Math.random() * 100) + 1;
        // Lets create a Number if trials that user has to accompolish the chances
        int Chances = 4;
        Scanner sc= new Scanner(System.in);  
        boolean correct = false;
        while(Chances > 0) {
            System.out.println("Enter the Guessed Number broo ");
            int Guess = sc.nextInt();
            // IF the Guess Chooses the right answer 
            if(Guess == Answer) {
                System.out.print("You're Right the correct answer is " + Answer);
            }
            else if(Guess > Answer) {
                System.out.println("You're entered Number is Comparitively High ....Please take"   + (Chances - 1)+ " Chance");
                Chances--;
            }
            else {
                System.out.println("You're Guess is too low compared to the Answer....Please utilize the Chances " + (Chances-1) + " left");
            }
            Chances--;
        }
        if(correct == false) {
            System.out.println("You just try making this code by you're self and All the Best ☺☻♥");
        }
        

    }
}