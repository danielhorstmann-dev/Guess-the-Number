package de.danielhorstmann;

public class Controller {

    InputOutput io = new InputOutput();

    public void run() {
        Generator generator = new Generator();
        int maxNumber = io.readMaxInteger(generator.getMaxNumber());
        generator.setMaxNumber(maxNumber);
        int randomNumber = generator.getRandomNumber();


        while (true) {
            int guessNumber = io.readInteger(maxNumber);
            if (guessNumber == randomNumber) {
                io.right();
                break;
            }
            io.wrong();
        }


    }

}
