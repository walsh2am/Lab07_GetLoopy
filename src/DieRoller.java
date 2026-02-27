import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    static void main(String[] args) {
        Random random = new Random();
        int die1 = random.nextInt(1,7);
        int die2 = random.nextInt(1,7);
        int die3 = random.nextInt(1,7);
        int dieTotal = 0;
        int roll = 0;
        boolean doneYN = false;
        boolean triple = false;
        boolean gotEnd = false;
        String done ="";
        String trash = "";
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Roll   Die1   Die2   Die3   Sum");
            System.out.println("-------------------------------");
            do {
                roll++;
                dieTotal = (die1 + die2 + die3);
                System.out.printf("%-6d %-6d %-6d %-6d %-4d%n",
                        roll, die1, die2, die3, dieTotal);
                if (die1 == die2 && die2 == die3 && die1 == die3){
                    triple = true;
                }
                die1 = random.nextInt(1,7);
                die2 = random.nextInt(1,7);
                die3 = random.nextInt(1,7);
            } while (!triple);
            do {
                System.out.print("Are you done? [Y/N]: ");
                done = in.nextLine();
                done = done.toUpperCase();
                if (done.equals("N")) {
                    System.out.println("You chose (" + done + "); so you'll play again");
                    gotEnd = true;
                    in.nextLine();
                } else if (done.equals("Y")) {
                    System.out.println("You chose (" + done + "); game is over!");
                    gotEnd = true;
                    doneYN = true;
                } else {
                    trash = done;
                    System.out.println("You inputted (" + trash + "); that doesn't answer my question; please try again.");
                }
            }while (!gotEnd);
            triple=false;
            gotEnd=false;
        } while (!doneYN);

    }
}
