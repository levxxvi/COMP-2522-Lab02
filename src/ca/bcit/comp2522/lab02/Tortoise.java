package ca.bcit.comp2522.lab02;

import java.util.Objects;
import java.util.Random;

public class Tortoise {
    int position;

    public Tortoise(){
        position = 0;
    }

    public Tortoise(int newPosition){
        position = newPosition;
    }

    public int move(){
        Random rnd = new Random();
        int movePrompt = rnd.nextInt(20);
        if (movePrompt <= 14){
            return position + 2;
        } else if (movePrompt <= 18){
            return position - 1;
        } else {
            return position + 1;
        }
    }

    public int getPosition() {
        return position;
    }

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
