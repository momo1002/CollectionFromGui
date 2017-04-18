package store;

/**
 * Created by mnakada on 2017-04-18.
 */
public class Card {

    private int number;

    private int availableAmount = 1000;

    public int getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(int availableAmount) {
        this.availableAmount = availableAmount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
