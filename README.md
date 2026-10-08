# OASIS-Java-Developer-Internship

Java Developer internship tasks by Subham Panda.

- [Task 2 - Number Guessing Game](https://github.com/subhampanda880-art/OASIS-Java-Developer-Internship/tree/main/OASIS/Task2)
- [Task 3 - ATM Interface](https://github.com/subhampanda880-art/OASIS-Java-Developer-Internship/tree/main/OASIS/Task3)

---

## Task 2 - Number Guessing Game 🎯

### 📌 Description

The Number Guessing Game is a simple Java console-based game where the computer randomly generates a number between 0 and 100. The user has a limited number of attempts to guess the correct number.

After each guess, the program provides a hint to help the user:
- If the guess is too low, it displays "Your guess is too low!"
- If the guess is too high, it displays "Your guess is too high!"
- If the guess is exactly one number away, it displays "You are very close!"
- If the user guesses correctly, the game displays a congratulatory message along with the number of attempts used.

If the user fails to guess the number within the allowed attempts, the game ends and displays the correct number.

### 🚀 Features

- Generates a random number between 0 and 100.
- Allows the user up to 5 attempts.
- Provides higher/lower hints after each guess.
- Gives a "very close" hint when the guess is exactly one number away.
- Displays the number of attempts taken when the user guesses correctly.
- Shows the correct number when all attempts are exhausted.
- Simple console-based user interface.

### 🛠️ Technologies Used

- Java
- `Scanner` for user input
- `Math.random()` for generating the random number
- Loops and conditional statements

### 🧠 Concepts Used

- Methods
- `for` loop
- `if-else` statements
- User input using `Scanner`
- Random number generation
- Variables and data types
- `Math.abs()` for calculating the difference between numbers

### ▶️ How to Run

1. Make sure Java is installed on your system.
2. Clone or download this repository.
3. Open the `Task2` folder in VS Code or any Java IDE.
4. Compile and run `NumberGame.java`.
5. Enter your guesses when prompted.

### 🎮 Example

```text
Guess the number between 0 and 100

Enter your guess: 50
Your guess is too high! Try again.

Enter your guess: 25
Your guess is too low! Try again.

Enter your guess: 36
You are very close! Try again.

Enter your guess: 37
Congratulations! You guessed the number in 4 attempts.
```

---

## Task 3 - ATM Interface 🏧

### 📌 Description

The ATM Interface is a console-based Java application that simulates the basic operations of an Automated Teller Machine (ATM).

The program allows a user to authenticate using a PIN and perform common banking transactions such as checking the account balance, depositing money, and withdrawing money.

The application also limits the user to 3 PIN attempts. If the user enters an incorrect PIN three times, access to the ATM is denied.

### 🚀 Features

- 🔐 PIN-based authentication
- 🔢 Maximum 3 PIN attempts
- 💰 Check account balance
- 💵 Deposit money
- 💸 Withdraw money
- ⚠️ Insufficient balance validation
- ❌ Invalid amount validation
- 🚪 Exit option
- 🏦 Simple banking account simulation

### 🛠️ Technologies Used

- Java
- Scanner
- Object-Oriented Programming (OOP)
- Console-based interface

### 🧠 Concepts Used

- Classes and objects
- Constructors
- Encapsulation
- Private variables
- Methods
- Method calling
- `if-else` statements
- `switch` statements
- `do-while` loop
- `for` loop
- User input using `Scanner`
- Basic input validation

### 🏗️ Project Structure

```text
OASIS/
└── Task3/
    └── ATMSystem.java
```

### ▶️ How to Run

1. Make sure Java is installed on your system.
2. Clone or download this repository.
3. Open the `Task3` folder in VS Code or any Java IDE.
4. Compile and run `ATMSystem.java`.
5. Enter your PIN when prompted and choose an option from the menu.
