# Tic-Tac-Toe with JavaFX and AI

This is a simple Tic-Tac-Toe game implemented in Java using JavaFX. The game includes a basic AI that plays against the user using the Minimax algorithm, which can be improved, I admit my bot is a little too dumb.

## Features

- **Player vs. AI**: The game allows the user to play against the computer.
- **Minimax AI**: The computer uses the Minimax algorithm to calculate the best move.
- **GUI**: The game has a simple and interactive GUI created with JavaFX.

## Requirements

Before running the program, make sure you have the following installed:

- **Java Development Kit (JDK)**: Version 11 or above.
- **JavaFX**: Download and install [JavaFX SDK](https://openjfx.io/).
  
## Setup

1. Download the **JavaFX SDK** and set the path to it.

2. Set the `--module-path` and `--add-modules` flags while compiling and running the program.

3. If you're using IntelliJ IDEA or another IDE, make sure to include the JavaFX library in the project settings.

## Build and Run

### Command Line

1. **Compile** the program:

   ```bash
   javac --module-path "path_to_your_javafx_sdk/lib" --add-modules javafx.controls *.java
