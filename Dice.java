package game;
public class Dice {
    private int noOfDice;
    Dice(int noOfDice)
    {
        this.noOfDice=noOfDice;
    }
    int rollDice()
    {
        return ((int)(Math.random()*(6))+1);
    }
    
}
