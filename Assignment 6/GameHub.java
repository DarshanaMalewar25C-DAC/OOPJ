/*

Capstone Project – Game Hub; Game Collection Manager 
START - Developer Requirements 

1) Project Overview 
Project Name: Game Hub 
Project Type: Java Console Application 
Duration: 120 minutes 
Objective: Develop a menu-driven game collection manager using Java OOP concepts and 
Collection Framework. 
2) Functional Requirements 
2.1 Game Management 
● Add Game 
➔ Input: Name, Genre, Rating (1-5), Platform (Console/PC) 
➔ Validation: Rating must be 1-5 
➔ Action: Add game to allGames list 
➔ Output: Success message with game ID 
● Remove Game 
➔ Input: Game ID 
➔ Validation: Cannot remove if game is borrowed 
➔ Output: Success/Error message 
● View Games 
➔ Options: Sort by ID, Name, Rating 
➔ Output: List of games with all details (platform-specific info included) 
● Search Game 
➔ Input: Name or Genre 
➔ Output: Display matching games 
2.2 User Management 
● Register User 
➔ Input: Username, Email 
➔ Validation: Username must be unique 
➔ Output: Confirmation message 
● View Users 
C-DAC Mumbai
 ➔ Output: List of all registered users 
2.3 Borrowing System 
● Issue Game 
➔ Input: Game ID, Username 
➔ Validation: Game must be available, User must exist 
➔ Action: Move game to borrowedQueue, add game to user’s borrowed list 
➔ Output: Success/Error message 
● Return Game 
➔ Input: Game ID, Username 
➔ Validation: Only borrower can return the game 
➔ Action: Move game back to available list 
➔ Output: Success/Error message 
● Borrowed Games Queue 
➔ Output: Display current borrowed games in queue order 
2.4 Reporting & Statistics 
● Collection Statistics 
➔ Total Games, Available Games, Borrowed Games 
● User Statistics 
➔ Total Registered Users 
● Borrowed Queue Display 
➔ Current games on loan 
3) Technical Requirements 
3.1 OOP Concepts to Implement 
● Classes & Objects: Game, ConsoleGame, PCGame, User, GameHubManager 
● Encapsulation: Private fields with public getters/setters 
● Inheritance: ConsoleGame and PCGame extend Game 
● Polymorphism: Method overriding (displayDetails()) 
● Abstract Classes: Game as base abstract class 
● Interfaces: GameActions for managing operations 
● Constructor Chaining: Default + parameterized constructors 
● Static Variables: Track totalGames and totalUsers 
● toString() Override: Clean display for objects 
3.2 Collections & Advanced Features 
● ArrayList allGames – Main game collection 
● LinkedList borrowedQueue – Queue of borrowed games 
● HashSet users – Maintain unique users 
● HashMap<Integer, Game> gameMap – Quick lookup by game ID 
● Comparable Interface – Sort games by ID 
● Comparator Interface – Sort games by Name or Rating 
C-DAC Mumbai
3.3 Exception Handling 
● Custom Exceptions: 
➔ GameNotFoundException 
➔ UserNotFoundException 
➔ InvalidRatingException 


END – Developer Requirements 
User Stories & Acceptance Criteria (User POV) 
User Story 1 – Add Game 
● As a user, I want to add a new game to my collection so that I can track it. 
● Acceptance Criteria: 
➔ Game ID auto-generated 
➔ Rating validated (1–5) 
➔ Confirmation displayed 
User Story 2 – Borrow Game 
● As a user, I want to borrow a game so that I can play it. 
● Acceptance Criteria: 
➔ Game must exist and be available 
➔ User must be registered 
➔ Borrowed queue updates automatically 
User Story 3 – Return Game 
● As a user, I want to return a borrowed game so it becomes available for others. 
● Acceptance Criteria: 
➔ Only the original borrower can return 
➔ Borrowed queue updates automatically 
User Story 4 – View & Sort Games 
● As a user, I want to view my collection sorted by ID, Name, or Rating. 
● Acceptance Criteria: 
➔ Sort options selectable 
➔ Output includes platform-specific info 
User Story 5 – User Management 
● As an admin, I want to register new users and prevent duplicates. 
● Acceptance Criteria: 
➔ Duplicate usernames rejected 
➔ Success message on registration
*/

/*
****Flow of Game Hub project***

┌─────────────────────────┐
│      START PROGRAM      │
└───────────┬─────────────┘
            ↓
┌─────────────────────────┐
│ Initialize GameHubManager│
│ - Create collections    │
│ - Set up data structures│
└───────────┬─────────────┘
            ↓
┌─────────────────────────┐
│     Display Main Menu   │
│ 1. Add Game             │
│ 2. Remove Game          │
│ 3. View Games           │
│ 4. Search Game          │
│ 5. Register User        │
│ 6. View Users           │
│ 7. Issue Game           │
│ 8. Return Game          │
│ 9. View Borrowed Queue  │
│ 10. Collection Stats    │
│ 11. User Stats          │
│ 12. Exit                │
└───────────┬─────────────┘
            ↓
┌─────────────────────────┐
│     Get User Choice     │
└───────────┬─────────────┘
            ↓
    ┌───────┴───────┐
    ↓               ↓
┌─────────────┐ ┌─────────────┐
│ Choice = 12 │ │  Other      │
│   (Exit)    │ │  Choices    │
└──────┬──────┘ └──────┬──────┘
       ↓               ↓
┌─────────────┐ ┌─────────────┐
│  End Program│ │  Process    │
└─────────────┘ │  Choice     │
               └──────┬──────┘
                      ↓
               ┌─────────────┐
               │  Branch to  │
               │Selected Menu│
               └──────┬──────┘
                      ↓
    ┌─────────────────┴─────────────────┐
    ↓             ↓                   ↓
┌───────────┐ ┌───────────┐ ┌───────────┐
│Add Game   │ │Remove Game│ │View Games │
└─────┬─────┘ └─────┬─────┘ └─────┬─────┘
      ↓             ↓             ↓
┌───────────┐ ┌───────────┐ ┌───────────┐
│Get Input  │ │Get GameID │ │Get Sort   │
│-Name      │ │            │ │Option     │
│-Genre     │ │            │ │           │
│-Rating    │ │            │ │           │
│-Platform  │ │            │ │           │
└─────┬─────┘ └─────┬─────┘ └─────┬─────┘
      ↓             ↓             ↓
┌───────────┐ ┌───────────┐ ┌───────────┐
│Validate   │ │Check if   │ │Sort Games │
│Rating 1-5 │ │Borrowed   │ │By ID,Name │
│           │ │           │ │or Rating  │
└─────┬─────┘ └─────┬─────┘ └─────┬─────┘
      ↓             ↓             ↓
┌───────────┐ ┌───────────┐ ┌───────────┐
│Create Game│ │Remove from│ │Display    │
│Object     │ │Collections│ │Games List │
(Console/PC)│ │           │ │           │
└─────┬─────┘ └─────┬─────┘ └─────┬─────┘
      ↓             ↓             ↓
┌───────────┐ ┌───────────┐ ┌───────────┐
│Add to     │ │Show       │ │Return to  │
│Collections│ │Success/   │ │Main Menu  │
│           │ │Error Msg  │ │           │
└───────────┘ └───────────┘ └───────────┘

    ┌─────────────────┴─────────────────┐
    ↓             ↓                   ↓
┌───────────┐ ┌───────────┐ ┌───────────┐
│Search Game│ │Register   │ │Issue Game │
└─────┬─────┘ │User       │ └─────┬─────┘
      │       └─────┬─────┘       │
      │             ↓             ↓
      │       ┌───────────┐ ┌───────────┐
      │       │Get        │ │Get GameID │
      │       │Username   │ │& Username │
      │       │& Email    │ │           │
      │       └─────┬─────┘ └─────┬─────┘
      │             ↓             ↓
      │       ┌───────────┐ ┌───────────┐
      │       │Check if   │ │Validate   │
      │       │Username   │ │Game Exists│
      │       │Unique     │ │& Available│
      │       └─────┬─────┘ └─────┬─────┘
      │             ↓             ↓
      │       ┌───────────┐ ┌───────────┐
      │       │Create User│ │Validate   │
      │       │Object     │ │User Exists│
      │       └─────┬─────┘ └─────┬─────┘
      │             ↓             ↓
      │       ┌───────────┐ ┌───────────┐
      │       │Add to     │ │Update Game│
      │       │Users Set  │ │Status     │
      │       └─────┬─────┘ │Add to     │
      │             ↓       │Borrowed   │
      │       ┌───────────┐ │Queue      │
      │       │Show       │ │Add to User│
      │       │Success Msg│ │Borrowed   │
      │       └───────────┘ │Games      │
      │                     └─────┬─────┘
      │                           ↓
      │                   ┌───────────┐
      │                   │Show       │
      │                   │Success Msg│
      │                   └───────────┘
    ┌─┴───────────────────────────────┴─┐
    ↓              ↓                   ↓
┌───────────┐ ┌───────────┐ ┌───────────┐
│Return Game│ │View       │ │View Stats │
└─────┬─────┘ │Borrowed   │ └─────┬─────┘
      │       │Queue      │       │
      │       └─────┬─────┘       │
      │             ↓             │
      │       ┌───────────┐       │
      │       │Display    │       │
      │       │Borrowed   │       │
      │       │Games      │       │
      │       └───────────┘       │
      │                           │
      │       ┌───────────┐       │
      │       │Get GameID │       │
      │       │& Username │       │
      │       └─────┬─────┘       │
      │             ↓             │
      │       ┌───────────┐       │
      │       │Validate   │       │
      │       │Game Exists│       │
      │       │& Borrowed │       │
      │       └─────┬─────┘       │
      │             ↓             │
      │       ┌───────────┐       │
      │       │Check if   │       │
      │       │User is    │       │
      │       │Borrower   │       │
      │       └─────┬─────┘       │
      │             ↓             │
      │       ┌───────────┐       │
      │       │Update Game│       │
      │       │Status     │       │
      │       │Remove from│       │
      │       │Borrowed   │       │
      │       │Queue      │       │
      │       │Remove from│       │
      │       │User       │       │
      │       │Borrowed   │       │
      │       │Games      │       │
      │       └─────┬─────┘       │
      │             ↓             │
      │       ┌───────────┐       │
      │       │Show       │       │
      │       │Success Msg│       │
      │       └───────────┘       │
      │                           │
      │       ┌───────────┐       │
      │       │Calculate  │       │
      │       │Statistics │       │
      │       │- Total    │       │
      │       │- Available│       │
      │       │- Borrowed │       │
      │       │- Users    │       │
      │       └─────┬─────┘       │
      │             ↓             │
      │       ┌───────────┐       │
      │       │Display    │       │
      │       │Statistics │       │
      │       └───────────┘       │
      └───────────────────────────┘
                  ↓
          ┌───────────────┐
          │Return to Main │
          │Menu           │
          └───────┬───────┘
                  ↓
          ┌───────────────┐
          │Wait for User  │
          │to Press Enter │
          └───────┬───────┘
                  ↓
          ┌───────────────┐
          │Display Main   │
          │Menu Again     │
          └───────┬───────┘
                  ↓
     (Loop back to get user choice)
 */
	 
import java.util.Objects;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

// ---------------------- Custom Exceptions -------------------------
class InvalidRatingException extends Exception {
    public InvalidRatingException(String msg) {
        super(msg);
    }
}

class GameNotFoundException extends Exception {
    public GameNotFoundException(String msg) {
        super(msg);
    }
}

class UserNotFoundException extends Exception {
    public UserNotFoundException(String msg) {
        super(msg);
    }
}

// ---------------------- Abstract Game Class -------------------------
abstract class Game implements Comparable<Game> {
    private static int idCounter = 1;
    protected int gameId;
    protected String name;
    protected String genre;
    protected int rating;
    protected String platform;
    protected boolean isBorrowed;

    public Game(String name, String genre, int rating, String platform) {
        this.gameId = idCounter++;
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.platform = platform;
        this.isBorrowed = false;
    }

    public int getGameId() {
        return gameId;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }

    public String getPlatform() {
        return platform;
    }

    public abstract void displayDetails();

    @Override
    public int compareTo(Game other) {
        return Integer.compare(this.gameId, other.gameId);
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Genre: %s | Rating: %d | Platform: %s | Borrowed: %s",
                gameId, name, genre, rating, platform, isBorrowed ? "Yes" : "No");
    }
}

// ---------------------- ConsoleGame -------------------------
class ConsoleGame extends Game {
    public ConsoleGame(String name, String genre, int rating) {
        super(name, genre, rating, "Console");
    }

    @Override
    public void displayDetails() {
        System.out.println(this + " [Console-specific features]");
    }
}

// ---------------------- PCGame -------------------------
class PCGame extends Game {
    public PCGame(String name, String genre, int rating) {
        super(name, genre, rating, "PC");
    }

    @Override
    public void displayDetails() {
        System.out.println(this + " [PC-specific features]");
    }
}

// ---------------------- User Class -------------------------
class User {
    private static int userCount = 0;
    private String username;
    private String email;
    private List<Game> borrowedGames;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.borrowedGames = new ArrayList<>();
        userCount++;
    }

    public String getUsername() {
        return username;
    }

    public List<Game> getBorrowedGames() {
        return borrowedGames;
    }

    public void borrowGame(Game game) {
        borrowedGames.add(game);
    }

    public void returnGame(Game game) {
        borrowedGames.remove(game);
    }

    public static int getUserCount() {
        return userCount;
    }

    @Override
    public String toString() {
        return "User: " + username + ", Email: " + email;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        return this.username.equals(other.username);
    }
}

// ---------------------- GameActions Interface -------------------------
interface GameActions {
    void addGame(String name, String genre, int rating, String platform) throws InvalidRatingException;

    void removeGame(int gameId) throws GameNotFoundException;

    void viewGames(int sortOption);

    void searchGame(String keyword);
}

// ---------------------- GameHubManager -------------------------
class GameHubManager implements GameActions {
    private List<Game> allGames = new ArrayList<>();
    private LinkedList<Game> borrowedQueue = new LinkedList<>();
    private Set<User> users = new HashSet<>();
    private HashMap<Integer, Game> gameMap = new HashMap<>();

    @Override
    public void addGame(String name, String genre, int rating, String platform) throws InvalidRatingException {
        if (rating < 1 || rating > 5) {
            throw new InvalidRatingException("Rating must be between 1 and 5.");
        }

        Game game = platform.equalsIgnoreCase("Console") ?
                new ConsoleGame(name, genre, rating) :
                new PCGame(name, genre, rating);

        allGames.add(game);
        gameMap.put(game.getGameId(), game);
        System.out.println("Game added. ID: " + game.getGameId());
    }

    @Override
    public void removeGame(int gameId) throws GameNotFoundException {
        Game game = gameMap.get(gameId);
        if (game == null) throw new GameNotFoundException("Game not found.");
        if (game.isBorrowed()) {
            System.out.println("Cannot remove a borrowed game.");
            return;
        }

        allGames.remove(game);
        gameMap.remove(gameId);
        System.out.println("Game removed successfully.");
    }

    @Override
    public void viewGames(int sortOption) {
        List<Game> games = new ArrayList<>(allGames);

        if (sortOption == 2) {
            games.sort(Comparator.comparing(Game::getName, String.CASE_INSENSITIVE_ORDER));
        } else if (sortOption == 3) {
            games.sort(Comparator.comparingInt(Game::getRating).reversed());
        } else {
            Collections.sort(games);
        }

        for (Game game : games) {
            game.displayDetails();
        }
    }

    @Override
    public void searchGame(String keyword) {
        boolean found = false;
        for (Game g : allGames) {
            if (g.getName().equalsIgnoreCase(keyword) || g.getGenre().equalsIgnoreCase(keyword)) {
                g.displayDetails();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No game found with keyword: " + keyword);
        }
    }

    public void registerUser(String username, String email) {
        User user = new User(username, email);

        if (users.contains(user)) {
            System.out.println("Username already exists.");
        } else {
            users.add(user);
            System.out.println("User registered: " + username);
        }
    }

    public void viewUsers() {
        if (users.isEmpty()) {
            System.out.println("No users found.");
            return;
        }

        for (User user : users) {
            System.out.println(user);
        }
    }

    public void issueGame(int gameId, String username) throws GameNotFoundException, UserNotFoundException {
        Game game = gameMap.get(gameId);
        if (game == null) throw new GameNotFoundException("Game not found.");
        if (game.isBorrowed()) {
            System.out.println("Game is already borrowed.");
            return;
        }

        User user = getUserByUsername(username);
        game.setBorrowed(true);
        user.borrowGame(game);
        borrowedQueue.add(game);
        System.out.println("Game issued to " + username);
    }

    public void returnGame(int gameId, String username) throws GameNotFoundException, UserNotFoundException {
        Game game = gameMap.get(gameId);
        if (game == null) throw new GameNotFoundException("Game not found.");
        if (!game.isBorrowed()) {
            System.out.println("Game is not borrowed.");
            return;
        }

        User user = getUserByUsername(username);
        if (!user.getBorrowedGames().contains(game)) {
            System.out.println("You did not borrow this game.");
            return;
        }

        user.returnGame(game);
        game.setBorrowed(false);
        borrowedQueue.remove(game);
        System.out.println("Game returned.");
    }

    public void displayBorrowedQueue() {
        if (borrowedQueue.isEmpty()) {
            System.out.println("No borrowed games.");
            return;
        }

        for (Game game : borrowedQueue) {
            System.out.println(game);
        }
    }

    public void showStatistics() {
        long total = allGames.size();
        long borrowed = allGames.stream().filter(Game::isBorrowed).count();
        long available = total - borrowed;
        int userCount = users.size();

        System.out.println("Total Games: " + total);
        System.out.println("Available Games: " + available);
        System.out.println("Borrowed Games: " + borrowed);
        System.out.println("Total Users: " + userCount);
    }

    private User getUserByUsername(String username) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found.");
    }
}

// ---------------------- Main Driver -------------------------
public class GameHub {
    public static void main(String[] args) {
        GameHubManager manager = new GameHubManager();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("----- Game Hub Menu -----");
            System.out.println("1. Add Game");
            System.out.println("2. Remove Game");
            System.out.println("3. View Games (sort)");
            System.out.println("4. Search Game");
            System.out.println("5. Register User");
            System.out.println("6. View Users");
            System.out.println("7. Issue Game");
            System.out.println("8. Return Game");
            System.out.println("9. View Borrowed Queue");
            System.out.println("10. View Statistics");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = -1;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            try {
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter game name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter genre: ");
                        String genre = sc.nextLine();
                        System.out.print("Enter rating (1-5): ");
                        int rating = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter platform (Console/PC): ");
                        String platform = sc.nextLine();
                        manager.addGame(name, genre, rating, platform);
                    }
                    case 2 -> {
                        System.out.print("Enter Game ID to remove: ");
                        int gameId = Integer.parseInt(sc.nextLine());
                        manager.removeGame(gameId);
                    }
                    case 3 -> {
                        System.out.println("Sort by: 1 = ID, 2 = Name, 3 = Rating");
                        int sortOpt = Integer.parseInt(sc.nextLine());
                        manager.viewGames(sortOpt);
                    }
                    case 4 -> {
                        System.out.print("Enter name or genre to search: ");
                        String keyword = sc.nextLine();
                        manager.searchGame(keyword);
                    }
                    case 5 -> {
                        System.out.print("Enter username: ");
                        String username = sc.nextLine();
                        System.out.print("Enter email: ");
                        String email = sc.nextLine();
                        manager.registerUser(username, email);
                    }
                    case 6 -> manager.viewUsers();
                    case 7 -> {
                        System.out.print("Enter Game ID to issue: ");
                        int gid = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter username: ");
                        String uname = sc.nextLine();
                        manager.issueGame(gid, uname);
                    }
                    case 8 -> {
                        System.out.print("Enter Game ID to return: ");
                        int gidReturn = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter username: ");
                        String unameReturn = sc.nextLine();
                        manager.returnGame(gidReturn, unameReturn);
                    }
                    case 9 -> manager.displayBorrowedQueue();
                    case 10 -> manager.showStatistics();
                    case 0 -> {
                        exit = true;
                        System.out.println("Exiting Game Hub. Goodbye!");
                    }
                    default -> System.out.println("Invalid choice. Try again.");
                }
            } catch (InvalidRatingException | GameNotFoundException | UserNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}