import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int color;
        String evenorOdd;
        String highLow;
        boolean playAgain = true;
        System.out.println("WELCOME! Let's play some Roulette!");
        System.out.println("Enter the type of bet you would like to place (red|black|even|odd|high|low):");
        String userInput = keyboard.nextLine();

        String loopy = "y";
        String s2 = " ";
        String s3 = " ";
        int num = 0;
        int num2 = 0;
        int randomInt = 1 + rand.nextInt(2);
        int randball = +rand.nextInt(36);
        String col = "red";
        String col2 = "black";

        //public String color()
        //{
        //Random rand = new Random();

        while (userInput.equals("red") || (userInput.equals("black"))) {
            randomInt = 1 + rand.nextInt(2);
            if (randomInt == 1) {
                col = String.valueOf(randomInt);
                col = "red";
            }
            else if (randomInt == 2) {
                col = String.valueOf(randomInt);
                col = "black";
            }

            if (userInput.equals("red")) {
                s2 = userInput;
                s2 = "1";
                num = Integer.parseInt(s2);
                }
                else if (userInput.equals("black")) {
                s3 = userInput;
                s3 = "2";
                num2 = Integer.parseInt(s3);

                }
            System.out.println("Enter in a bet value");

            int bet = keyboard.nextInt();
            randball = 1 + rand.nextInt(36);

            if (randomInt == num) {
                System.out.println("Correct, you have won, The ball landed on " + randball + " " + col);
            }
            else if (randomInt == num2) {
                System.out.println("Correct, you have won, The ball landed on " + randball + " " + col);
            }
            else
                System.out.println("Sorry you lost, the ball landed on " + randball + " " + col );
        }
        System.out.println("Let's try again");
        userInput = keyboard.nextLine();
        userInput = userInput.toLowerCase();

    }
}

  /*  public String evenorOdd()
    {
        System.out.println("Enter if number is even or odd:");
        Scanner keyboard = new Scanner(System.in);
        String usIn=keyboard.next();
        int num;

        //The input provided by user is stored in num
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        /* If number is divisible by 2 then it's an even number
         * else odd number
        if ( num % 2 == 0 )
            System.out.println("even");
        else
            System.out.println("Entered number is odd");
    }
}


                */


