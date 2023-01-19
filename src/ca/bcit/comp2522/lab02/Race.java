package ca.bcit.comp2522.lab02;

import java.util.Random;

public class Race {
    private final int length;
    private int tick;
    private final Hare hare;
    private final Tortoise tortoise;

    public Race(int newLength, Tortoise newTortoise, Hare newHare){
        tick = 0;
        length = newLength;
        hare = newHare;
        tortoise = newTortoise;
    }

    private void onYourMark(){
        this.tick = 0;
        this.hare.setPosition(0);
        this.tortoise.setPosition(0);
    }

    /**
     * Run the race between the tortoise and the hare
     * @return the winner's position
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

    public String simulateRace(){
        onYourMark();
        return race();
    }

    public int getTick() {
        return this.tick;
    }
}
