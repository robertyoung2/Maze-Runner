# Maze-Runner

This project, written in Java, is a program that navigates the user through a given maze. Designed using the Rubic from the Microsoft course DEV276x, Final Project. The code for the maze was provided and is contained in the source code which may be found [here](https://github.com/robertyoung2/Maze-Runner/blob/master/src/Maze.java).

The project was broken up into three seperate parts, which will be discussed below. The source code for the completed implementation may be seen [here](https://github.com/robertyoung2/Maze-Runner/blob/master/src/MazeRunner.java).

### Part 1 - Let the user solve the maze

- Welcome the user to MazeRunner and show the current state of the maze. This is contained in the **intro()** method. 
- Offer the user a way to enter the maze and which direction they would like to move, Right (R), Left (L), Up (U) or Down (D). 
- Check that the desired move is valid (does not hit a wall). If the move is not valid, the user should be informed.
- If the move is possible, execute it and inform the user of where they are by producing the maze map.
- This process is repeated until either the user exits the maze, or they run out of moves.


### Part 2 – Move Limit

In part two, messages are produced based on how many moves the user has left. The user can take no more than 100 moves when attempting to escape the maze.


### Part 3 – Watch out for pits

This part of the project introduces logic to manage 'pits'. As the user moves through the maze they may encounter pits. If the user falls into a pit, they will lose the game. My code includes logic to check for pits, inform the user, and provide them with the option to jump the pit. 
