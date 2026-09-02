/**
 * The card that models a play card (movement card) in the game.
 * No additional fields or methods are required.
 * No additional fields can be added.
 * You can add additional method if you want.
 */
public class PlayCard {
    public final String color;
    public final String type;
   
    public PlayCard(String color, String type) {
        this.color = color;
        this.type = type;
    }
    
    public String toString() {
        return "PlayCard{" + color + "," + type + "}"; //e.g. PlayCard{yellow,-1}
    }
    
    public String getColor() {
        return color;
    }
    
    public String getType() {
        return type;
    }
    
    public int getSteps() {
        if (type.equals("+1")) {
            return 1;
        }
        if (type.equals("+2")) {
            return 2;
        }
        if (type.equals("-1")) {
            return -1;
        }
        return 0;
    }
}
