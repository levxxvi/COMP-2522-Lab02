package ca.bcit.comp2522.lab02;

import java.util.Random;

/**
 * Race
 *
 * @author Lex Wong
 * @version 202213
 */
public class Race {
    private final int length;
    private int tick;
    private final Hare hare;
    private final Tortoise tortoise;

    /**
     * Create a new Race object
     * @param newLength length of the race, must be a positive integer greater than 0
     * @param newTortoise new Tortoise racer
     * @param newHare new Hare racer
     */
    public Race(int newLength, Tortoise newTortoise, Hare newHare){
        tick = 0;
        length = newLength;
        hare = newHare;
        tortoise = newTortoise;
    }

    /**
     * Set the position of the Hare and Tortoise to 0, set the clock tick to 0
     */
    private void onYourMark(){
        this.tick = 0;
        this.hare.setPosition(0);
        this.tortoise.setPosition(0);
    }

    /**
     * Run the race between the tortoise and the hare
     * @return a string describing who is the winner
     */
    private String race(){
        Random rnd = new Random();
        while (hare.getPosition() < length && tortoise.getPosition() < length){
            if (rnd.nextBoolean()){
                this.hare.move();
                this.tortoise.move();
            } else {
                this.tortoise.move();
                this.hare.move();
            }
            this.tick++;
        }
        if (hare.getPosition() > tortoise.getPosition()){
            return "Hare";
        } else {
            return "Tortoise";
        }
    }

    /**
     * Simulate a race between the Tortoise and the Hare
     * @return a string describing the result of the race
     */
    public String simulateRace(){
        onYourMark();
        return race();
    }

    /**
     * Get the current clock tick
     * @return an integer of clock tick
     */
    public int getTick() {
        return this.tick;
    }
}
