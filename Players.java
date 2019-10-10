import java.util.ArrayList;

//defines computer acting as dealer
//defines 

public class Players{
    ArrayList <Card> hand;
    int money;
    
    public Players(Card card1, Card card2, Card card3, boolean Dealer)
    {
        if (!Dealer) money = 500; // if not the dealer, will add cards and money to your hand
        hand = new ArrayList <Card>();
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        if (!Dealer){
        System.out.println("Your hand: ");
        hand.get(0).printCards();
        hand.get(1).printCards();
        hand.get(2).printCards();
}
    } 
    public void add_card(Card newCard){
        hand.add(newCard);
    }
    public int cardScore(){
        int newScore = 0;
        for(int i=0; i<hand.size();i++){
            newScore += hand.get(i).getScore(hand.get(i).value);
        }      
        return newScore;
        }
    public void remove_hand(Card card1, Card card2, Card card3){
            hand = new ArrayList<Card>();
        hand.add(card1);
        hand.add(card2);
        hand.add(card3);
        hand.get(0).printCards();
        hand.get(1).printCards();
        hand.get(2).printCards();}
    }
   
    
