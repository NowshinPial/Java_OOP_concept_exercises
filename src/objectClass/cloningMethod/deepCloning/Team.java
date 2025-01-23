package objectClass.cloningMethod.deepCloning;
/**
 * Clone a Class with Multiple Nested Objects
 * 1. Create a Team class with the following fields:
 *      - name (String)
 *      - players (List of Player objects)
 * 2. Create a Player class with:
 *      - playerName (String)
 *      - stats (an object of PlayerStats class that contains gamesPlayed and goalsScored)
 * 3. Implement deep cloning for the Team class.
 * 4. Clone a Team object, modify the PlayerStats of a Player in the cloned object, and verify that it does not impact the original Team object.
 */


public class Team implements Cloneable{
    String name;
    Players[] players;

    //getters and setters
    public void setName (String name) {
        this.name = name;
    }
    public String getName () {
        return name;
    }
    public void setPlayers (Players[] players){
        this.players = players;
    }
    public Players[] getPlayers () {
        return players;
    }

    //Override the clone()
    @Override
    public Team clone() throws CloneNotSupportedException {
        //Shallow cloning
        Team team = (Team) super.clone();

        //deep cloning
        team.players = this.players.clone();

        return team;
    }
}
