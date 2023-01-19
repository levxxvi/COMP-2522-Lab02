package ca.bcit.comp2522.lab02;

import java.util.Objects;
import java.util.Random;

public class Hare {
    int position;

    public Hare (){
        position = 0;
    }

    public Hare(int newPosition){
        position = newPosition;
    }

    /**
     * Chooses the next move action for the hare randomly
     * @return the position of the hare after the movement
     */
    public int move(){
        Random rnd = new Random();
        int movePrompt = rnd.nextInt(100);
        if (movePrompt < 50){
            return this.position;
        } else if (movePrompt < 75){
            this.position += 4;
        } else if (movePrompt < 80) {
            this.position -= 3;
        } else {
            this.position += 2;
        }
        return this.position;
    }

    public int getPosition(){
        return this.position;
    }

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
