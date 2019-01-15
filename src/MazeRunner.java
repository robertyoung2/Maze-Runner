import java.util.*;

public class MazeRunner {

    public static Maze myMap = new Maze();
    public static int moves_taken = 89;

    public static void main(String[] args) {
        intro();
        while (!myMap.didIWin() && moves_taken <= 100) {
            String direction = userMove();
            userMover(direction);
            movesMessage(moves_taken);
        }
    }

    public static void intro() {
        // welcome user and print map
        System.out.println("Welcome to Maze Runner!");
        System.out.println("Here is your current position:");
        myMap.printMap();
    }

    public static String userMove() {
        Scanner input = new Scanner(System.in);

        System.out.println("Where would you like to move? (R, L, U, D): ");
        String user_direction = input.next();

        while (!user_direction.matches("[rludRLUD]")) {
            System.out.println("Please enter a valid move: (R, L, U, D)");
            user_direction = input.next();
        }
        return user_direction.toUpperCase();
    }

    public static void userMover(String direction) {
        // take in desired direction of move, and check if that direction is possible

        moves_taken++;

        if (myMap.canIMoveRight() && direction.equals("R")) {
            myMap.moveRight();
        }
        else if (myMap.canIMoveLeft() && direction.equals("L")) {
            myMap.moveLeft();
        }
        else if (myMap.canIMoveUp() && direction.equals("U")) {
            myMap.moveUp();
        }
        else if (myMap.canIMoveDown() && direction.equals("D")) {
            myMap.moveDown();
        }
        else {
            System.out.println("Sorry, you've hit a wall");
        }
        myMap.printMap();
    }
//
    public static void movesMessage(int moves) {
        // print after number of moves
        // count moves

        if (moves == 50) {
            System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes");
        }
        else if (moves == 75) {
            System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
        }
        else if (moves == 90) {
            System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
        }
        else if (moves == 100) {
            System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER >:[");
        }
        else if (moves > 100) {
            System.out.println("Sorry, but you didn't escape in time - you lose!");
            System.exit(0);
        }
    }
//    public static void navigatePit(String direction) {
//        // pit stuff
//
//
//    }
    
}
