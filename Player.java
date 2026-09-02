/**
 * This to model a player in the game.
 * You need to add additional methods (including) constructors 
 * in this class.
 * You cannot add additional fields.
 */

public class Player {
    private final String name;
    private final String color;
    private final PlayCard[] playCards = new PlayCard[5];
    //TODO

    public Player(String name, String color){
        this.name = name;
        this.color = color;
    }


    public String getName(){
        return name;
    }

    public String toString() {
        String s = getName() + " has the following cards:\n";
        for (int i = 0; i < playCards.length; i++) {
            if (playCards[i] != null) {
                s = s + i + ": " + playCards[i].toString() + "\n";
            }
        }
        return s;
    }

    public PlayCard playCard(int index) {
        if (index < 0 || index >= playCards.length || playCards[index] == null) {
            return null;
        }
        PlayCard card = playCards[index];
        playCards[index] = null;
        return card;
    }




    public String revealColor() {
        return color;
    }

    public boolean drawCard(PlayCard card) {
        for (int i = 0; i < playCards.length; i++) {
            if (playCards[i] == null) {
                playCards[i] = card;
                return true;
            }
        }
        return false;
    }

}
