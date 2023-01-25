 // Property class

public class Property {

    private String name;
    private int price;
    private int rent;
    private int location;
    private Player owner;

    // Constructor
    public Property(String newName, int newPrice, int newRent, int location2) {
        name = newName;
        price = newPrice;
        rent = newRent;
        owner = null;
        location = 0;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getRent() {
        return rent;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player newOwner) {
        owner = newOwner;
    }

    public int compareTo(Property other) {
        if(location < other.location) return -1;
        if(location > other.location) return 1;
        return 0;
        
        
    }

    public void setLocation(int newLocation) {
        location = newLocation;
    }

    public int getLocation() {
        return location;
    }
}
