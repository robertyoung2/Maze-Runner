import java.util.*;

public class MazeRunner {

    public static Maze myMap = new Maze();

    public static void main(String[] args) {
        intro();
        while (!myMap.didIWin()) {
            String direction = userMove();
            userMover(direction);
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
        // take in desired direction of move, and check if that direction is valid and possible

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
//    public static void movesMessage(moves) {
//        // print after number of moves
//        // count moves
//    }
//    public static void navigatePit(String direction) {
//        // pit stuff
//
//
//    }
    
}
