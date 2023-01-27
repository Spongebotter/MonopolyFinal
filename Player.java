// Player class
public class Player {

    private String name;
    private int balance;
    private String position;
    private gameBoard board;

    // Constructor
    public Player(String newName) {
        name = newName;
        balance = 1500;
        position = "Go";
        board = new gameBoard();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getPosition() {
        return position;
    }

    public void setBalance(int newBalance) {
        balance = newBalance;
    }

    public void addRent(int newRent) {
        balance += newRent;
    }

    public void setPosition(String newPosition) {
        position = newPosition;
    }

    // Other Methods
    public void move(int spaces) {
        int currentIndex = board.indexOf(position);
        int newIndex = (currentIndex + spaces) % board.getProperties().size();
        position = board.getProperties().get(newIndex).getName();
    }

    public void buyProperty(Property p) {
        p.setOwner(this);
        balance -= p.getPrice();
    }

    public void payRent(Player owner, int rent) {
        balance -= rent;
        owner.addRent(rent);
    }

    public void winner() {
    }
}
