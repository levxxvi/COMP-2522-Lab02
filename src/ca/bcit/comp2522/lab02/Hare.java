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

    public int move(){
        Random rnd = new Random();
        int movePrompt = rnd.nextInt(20);
        if (movePrompt <= 9){
            return position;
        } else if (movePrompt <= 13){
            return position - 3;
        } else if (movePrompt <= 15) {
            return position + 4;
        } else {
            return position;
        }
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
