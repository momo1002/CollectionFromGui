package store;

import java.util.ArrayList;

/**
 * Created by mnakada on 2017-04-18.
 */
public class DriveBuy {
    public static void main(String[] args) {
        Client momo = new Client("Momo", new Visa());
        // Card card =  new Visa()
        Client gui = new Client("Gui", new Mastercard());

        ArrayList<Client> table = new ArrayList<Client>();

        table.add(gui);
        table.add(momo);

        int bill = 200;

        Card useThisCard;
        for (int i=0;i<table.size();i++) {
             useThisCard = table.get(i).getCard();
             if(useThisCard.getAvailableAmount() > bill/table.size()) {
                 pay(useThisCard);
                 useThisCard.setAvailableAmount(useThisCard.getAvailableAmount()-bill/table.size());

                 System.out.println(table.get(i).getName() + " paid "+ bill/table.size() +
                    " with card "+ useThisCard.getClass().getSimpleName() + " and the remain amount is "
                         + useThisCard.getAvailableAmount());
             }
        }
//        pay(momo.getCard());

    }

    public static boolean pay(Card card){
        return true;
    }
}
