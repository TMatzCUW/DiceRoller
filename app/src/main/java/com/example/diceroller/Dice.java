package com.example.diceroller;
import java.util.Random;
public class Dice {
    private int sides;
    private int rolls;

    public Dice(int numberOfSides)
    {
        this.sides = numberOfSides;
        this.rolls = rolls;
    }

    public int roll()
    {
        Random r = new Random();
        return r.nextInt(this.sides)+1;
    }
}
