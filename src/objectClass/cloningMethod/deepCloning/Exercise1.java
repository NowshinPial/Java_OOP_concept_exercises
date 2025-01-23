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
//COME SOLVE THIS AFTER YOU COMPLETE ARRAY CLASS

class Exercise1 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Team t1 = new Team();
        PlayerStats ps = new PlayerStats("Foot Ball", 3);
        Players p1 = new Players("Sarfaraz" , ps);

        t1.setName("Go Riders");


        System.out.println(t1);

        Team t2 = t1.clone();


        System.out.println(t2);
        System.out.println(t1 == t2);



    }
}


