import java.util.*;

public class MazeRunner {

    public static Maze myMap = new Maze();

    public static void main(String[] args) {
        intro();
        userMove();
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
        String user_choice = input.next();

        while (!user_choice.matches("r|l|u|d|R|L|U|D")) {
            System.out.println("Please eneter a valid move: (R, L, U, D)");
            user_choice = input.next();
        }

        return user_choice;
    }

//    public static String userMover() {
//        // take in desired direction of move, and check if that direction is valid and possible
//
//
//
//        if myMap.canIMoveRight("R"); = true {
//            myMap.MoveRight();
//        }
//
//        if myMap.canIMoveLeft("L"); = true {
//            myMap.MoveLeft();
//        }
//
//        if myMap.canIMoveUp("U"); = true {
//            myMap.MoveUp();
//        }
//
//        if myMap.canIMoveDown("D"); = true {
//            myMap.MovedDown();
//        }
//
//        return direction;
//
//    }
//
//    public static void movesMessage(moves) {
//        // print after number of moves
//        // count moves
//    }
//    public static void navigatePit(direction) {
//        // pit stuff
//    }
    
}
