package ca.bcit.comp2522.lab02;

import java.util.Objects;
import java.util.Random;

/**
 * Hare
 *
 * @author Lex Wong
 * @version 202213
 */
public class Hare {
    int position;

    /**
     * Create a new Hare object
     */
    public Hare (){
        position = 0;
    }

    /**
     * Choose the next move action for the Hare randomly
     * @return the position of the Hare after the movement
     */
    public int move(){
        Random rnd = new Random();
        int movePrompt = rnd.nextInt(100);
        if (movePrompt < 25){
            this.position += 4;
        } else if (movePrompt < 30) {
            this.position -= 3;
        } else if (movePrompt < 50){
            this.position += 2;
        }
        return this.position;
    }

    /**
     * Get the current position of the Hare
     * @return the position of the Hare
     */
    public int getPosition(){
        return this.position;
    }

    /**
     * Set the position of the Hare
     * @param position the new position of the Hare. must be an integer
     */
    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Hare{" +
                "position=" + position +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hare hare = (Hare) o;
        return position == hare.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
