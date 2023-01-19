package ca.bcit.comp2522.lab02;

import java.util.Objects;
import java.util.Random;

public class Tortoise {
    int position;

    /**
     * Create a new Tortoise object
     */
    public Tortoise(){
        position = 0;
    }

    /**
     * Choose the next move action for the Tortoise randomly
     * @return the position of the Tortoise after the movement
     */
    public int move(){
        Random rnd = new Random();
        int movePrompt = rnd.nextInt(100);
        if (movePrompt < 75){
            this.position += 2;
        } else if (movePrompt < 95){
            this.position -= 1;
        } else {
            this.position += 1;
        }
        return this.position;
    }

    /**
     * Get the current position of the Tortoise
     * @return the position of the Tortoise
     */
    public int getPosition() {
        return position;
    }

    /**
     * Set the position of the Tortoise
     * @param position the new position of the Tortoise. must be an integer
     */
    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Tortoise{" +
                "position=" + position +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tortoise tortoise = (Tortoise) o;
        return position == tortoise.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
