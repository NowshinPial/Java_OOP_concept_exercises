package objectClass.cloningMethod.deepCloning;

/**
 * Create a Player class with:
 *  *      - playerName (String)
 *  *      - stats (an object of PlayerStats class that contains gamesPlayed and goalsScored)
 */
public class Players {
    String playerName;
    PlayerStats stats;

    public Players(String playerName, PlayerStats stats){
        this.playerName = playerName;
        this.stats = stats;
    }
}
