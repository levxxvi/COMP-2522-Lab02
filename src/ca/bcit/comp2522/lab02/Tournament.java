package ca.bcit.comp2522.lab02;

/**
 * Tournament
 *
 * @author Lex Wong
 * @version 202213
 */
public class Tournament {
    /**
     * Simulate a defined amount of races with the same distance
     * @param numOfRaces an integer defining the amount of races to simulate. must be an integer greater than 0
     * @param lengthOfRace an integer defining the length of the race, must be an integer greater than 0
     * @return a string describing who won the most, and how many victories each animal got
     */
    private static String simulateRace(int numOfRaces, int lengthOfRace){
        int hareWins = 0;
        int tortoiseWins = 0;
        String overallWinner;
        for (int i = 0; i < numOfRaces; i++){
            Hare tourneyHare = new Hare();
            Tortoise tourneyTortoise = new Tortoise();
            Race newRace = new Race(lengthOfRace, tourneyTortoise, tourneyHare);
            String winner = newRace.simulateRace();
            if (winner.equals("Hare")){
                hareWins++;
            } else {
                tortoiseWins++;
            }
        }
        if (hareWins > tortoiseWins){
            overallWinner = "The hare won more races.\n";
        } else {
            overallWinner = "The tortoise won more races.\n";
        }
        return overallWinner + "The hare won: " + hareWins + " times. The tortoise won: " + tortoiseWins + " times.\n";
    }

    public static void main(String[] args) {
        Hare tourneyHare = new Hare();
        Tortoise tourneyTortoise = new Tortoise();
        Race newRace = new Race(100, tourneyTortoise, tourneyHare);
        String winner = newRace.simulateRace();
        System.out.println("The " + winner + " won the race after " + newRace.getTick() + " ticks\n");
        System.out.print("The position of the winner was: ");
        if (winner.equals("Hare")){
            System.out.print(tourneyHare.getPosition() + "\n");
        } else {
            System.out.print(tourneyTortoise.getPosition() + "\n");
        }
        System.out.println("For the length 100 races: \n" + simulateRace(100, 100));
        System.out.println("For the length 1000 races: \n" + simulateRace(100, 1000));
    }
}
