package Assingment4;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    String[] suit ={ "Club","Diamond","Spade","Hearts" };
    String[] value ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    ArrayList<Card> card = new ArrayList<Card>();
            public void  createDeck(){
                for(int i = 0;i < value.length;i++){
                    for(int j=0;j<suit.length;j++){
                        this.card.add(new Card(suit[j],value[i]));
                    }
                }
    }
        public void shuffleDeck(){
            Collections.shuffle(this.card);
        }
        public void showCards(){
                System.out.println(this.card);
        }
        public Object topCard(){
        return this.card.get(0);

        }

}

