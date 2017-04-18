package store;

/**
 * Created by mnakada on 2017-04-18.
 */
public class Client {

    private String name;
    private Card card;

    public Client(String name, Card card){
        this.name = name;
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
