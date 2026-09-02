# Simplified-The-Great-Turtle-Race

## 🎮 Game Overview
**The Great Turtle Race** (Schildkröten Rennen, 跑跑龟) is a strategic board game where players race their turtles to reach the finish line first. This implementation is a simplified version that excludes rainbow color cards.

### 📖 Game Rules Summary
1. **Players**: 2-5 players each controlling a colored turtle
2. **Cards**: Each player starts with 5 movement cards
3. **Movement**: Cards allow +1, +2, or -1 steps
4. **Stacking**: Turtles can stack on top of each other
5. **Winning**: First turtle to reach the finish line wins

## 🚀 Getting Started

### Prerequisites
- Java 11 or higher
- Terminal/Command Prompt

### Download & Run Demo
```bash
# Download the demo program
wget [demo.jar URL]

# Run with default 4 players
java -jar demo.jar

# Run with custom number of players (2-5)
java -jar demo.jar 3
```

### How to Run
```bash
# Compile all Java files
javac *.java

# Run with default 4 players
java Gameboard

# Run with specific number of players (2-5)
java Gameboard 3
```

## 📁 Project Structure
```text
.
├── Gameboard.java    # Main game logic and board management
├── Player.java       # Player class managing cards and turns
├── Turtle.java       # Turtle class representing game pieces (COMPLETED)
├── PlayCard.java     # Card class for movement cards
└── TestClass.java    # Unit tests for grading
```

## 🧩 Implementation Details

###Key Components
Card System
- Total Cards: 40 cards (5 colors × 8 types)
- Card Types:
    - +1 (5 per color)
    - +2 (1 per color)
    - -1 (2 per color)
- Card Management: Draw from deck, discard played cards
- Shuffling: Manual Fisher-Yates shuffle using ThreadLocalRandom

### Board Layout
- Dimensions: 5 rows × 10 columns
- Start Line: Column 0
- Finish Line: Column 9 (GOAL_LINE - 1)
- Stacking: Multiple turtles can occupy the same column

### Game Flow
1. Initialize game with 2-5 players
2. Prepare and shuffle card deck
3. Each player draws 5 cards
4. Players take turns:
    - Display current hand
    - Select a card by index
    - Move corresponding turtle
    - Discard played card
    - Draw a new card (if available)
    - Reshuffle discard pile if deck is empty
5. Game ends when a turtle reaches the finish line
6. Winner is the player whose turtle reaches the finish line (lowest in stack wins ties)

## 📚 References
Assignment GitHub: https://github.com/khwang0/COMP2046-2526PA2
