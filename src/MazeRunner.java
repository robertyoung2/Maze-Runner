import java.util.*;

public class MazeRunner {

    public static Maze myMap = new Maze();
    public static int moves_taken = 0;

    public static void main(String[] args) {
        intro();
        while (!myMap.didIWin() && moves_taken <= 100) {
            String direction = userMove();
            movesMessage(moves_taken);
            navigatePit(direction);
        }

        if (myMap.didIWin()) {
            System.out.println("Congratulations, you made it out alive! And you did it in " + moves_taken + "!");
        }
    }

    // method to introduce player to the game and show starting position
    public static void intro() {
        // welcome user and print map
        System.out.println("Welcome to Maze Runner!");
        System.out.println("Here is your current position:");
        myMap.printMap();
    }

    // method to get user input for move, and to check if move is valid
    public static String userMove() {
        Scanner input = new Scanner(System.in);

        System.out.print("Where would you like to move? (R, L, U, D): ");
        String user_direction = input.next();

        while (!user_direction.matches("[rludRLUD]")) {
            System.out.println("Please enter a valid move: (R, L, U, D)");
            user_direction = input.next();
        }

        String direction = user_direction.toUpperCase();

        moves_taken++;

        if (myMap.canIMoveRight() && direction.equals("R")) {
            myMap.moveRight();
        } else if (myMap.canIMoveLeft() && direction.equals("L")) {
            myMap.moveLeft();
        } else if (myMap.canIMoveUp() && direction.equals("U")) {
            myMap.moveUp();
        } else if (myMap.canIMoveDown() && direction.equals("D")) {
            myMap.moveDown();
        } else {
            System.out.println("Sorry, you've hit a wall");
        }
        myMap.printMap();

        return direction;
    }

    // method to provide warnings at certain move count remaining
    public static void movesMessage(int moves) {

        if (moves == 50) {
            System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes");
        } else if (moves == 75) {
            System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
        } else if (moves == 90) {
            System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
        } else if (moves == 100) {
            System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER >:[");
        } else if (moves > 100) {
            System.out.println("Sorry, but you didn't escape in time - you lose!");
            System.exit(0);
        }
    }

    // method to navigate pits in maze
    public static void navigatePit(String direction) {
        // pit stuff

        Scanner input = new Scanner(System.in);

        if (myMap.isThereAPit(direction)) {
            System.out.print("Watch out! There's a pit ahead, jump it? ");
            String decision = input.next();
            if (decision.charAt(0) == 'y' || decision.charAt(0) == 'Y') {
                myMap.jumpOverPit(direction);
            } else {
                System.out.println("You're stuck in a pit, you lose!");
                System.exit(0);
            }
        }
    }
}
