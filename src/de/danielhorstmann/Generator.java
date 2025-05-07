package de.danielhorstmann;

import java.util.Random;

public class Generator {

    private int maxNumber = 10;

    public Integer getRandomNumber() {
        Random random = new Random();
        return random.nextInt(1,maxNumber+1);
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }
}
