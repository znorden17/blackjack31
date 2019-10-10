import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
//construct game
        

public class Game{
    Players dealer, player;
    ArrayList <Card> newDeck = new ArrayList <Card>();
    int money = 500;
    int amtBet = 50;
    boolean playerStand = true;
    boolean dealerStand = true;
    boolean userWins;
    
    
    public Game(){ //creates a deck 
        String[] CardName = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; // creates names for card
        String[] CardSuit = {"Hearts","Spades","Clubs","Diamonds"}; // creates suits for card
        int[] CardValue = {1,2,3,4,5,6,7,8,9,10,10,10,10}; // creates card values
        for (int i=0; i<CardSuit.length;i++){
            for(int j=0; j<CardName.length;j++){
                newDeck.add(new Card(CardSuit[i],CardName[j]));
    } //end second forloop
}   // end first forloop
        

        dealer = new Players(newCard(), newCard(),newCard(), true); // makes a dealer
        player = new Players(newCard(), newCard(),newCard(),false); // makes a player
     do{    
  //      int player_total = card1.getScore(card1.value) + card2.getScore(card2.value) + card3.getScore(card3.value); 
  //      System.out.println("Your hand is worth " + player_total+ " points.");

System.out.println("REMOVE LATER; CHECKS DEALER SCORE" +dealer.cardScore());

        
        while (true){ // starts the game
        
        System.out.println("Right, above are the three cards you'll be starting the game with. Here's your score so far: "+player.cardScore());
        Scanner initialBet = new Scanner(System.in);
        System.out.println("After reviewing your cards and deciding you'd like to bet, please type 'Yes'");
        String wantBet = initialBet.nextLine();
        if (wantBet.equals("Yes")){
          money = (money -  (amtBet));
          System.out.print("After your recent bet of $" + amtBet + " you have $"+ money);
          
          break;
        } else if  (wantBet != "Yes"){
            break;
        }
       
        }
        while(playerStand == true){ // player conditions
            if (player.cardScore() < 31){
            System.out.println(" The dealer's last cards are ");
            dealer.hand.get(1).printCards();
            dealer.hand.get(2).printCards();
            Scanner hitstand = new Scanner(System.in);
            System.out.println("Hit or Stand? ");
            String answer = hitstand.nextLine();
            if (answer.equals("Hit")){
                player.add_card(newCard());
                for(int i =0; i<player.hand.size(); i++){
                player.hand.get(i).printCards();
                } //ends add_card to hand for loop
            int score = player.cardScore();
            System.out.println("Your new score is: " + score);
            }// ends the Hit if statement 
            else break;
        }} // ends if player total isn't 31 & end while loop 

        while(dealerStand == true){
            if (dealer.cardScore() >= 26){
                break;}
            else if (dealer.cardScore() > 31){
                System.out.println("The dealer has busted! You win!");
                money = (money + amtBet);
                
                break;}
            else{
                dealer.add_card(newCard());
                for(int i=0; i<dealer.hand.size();i++){
                    dealer.hand.get(i);
                    dealer.cardScore();
                    }
                System.out.println("REMOVE LATER; CHECKS DEALER SCORE" +dealer.cardScore());
            } // ends the else
                } //ends dealer while loop
        
           if (dealer.cardScore() > 31 && player.cardScore() <= 31){ // dealer bust 
                System.out.println("The Player has won!");
                money += money + amtBet;
                System.out.println("You have " +money);}
           else if (dealer.cardScore() > 31 && player.cardScore() > 31){ // both bust
                   System.out.println("Because youre score was " + player.cardScore() + " and the dealer score was "+ dealer.cardScore() + " you are both over 31, which means you both lose!");
                   System.out.println("You have " +money);
                   }
           else if (dealer.cardScore() > player.cardScore() && dealer.cardScore() < 32){ // player bust
                   System.out.println("The dealer wins!");
                   System.out.println("You have " + money);
           }
           player.remove_hand(newCard(), newCard(), newCard());
           dealer.remove_hand(newCard(),newCard(),newCard());
                   
     } while (player.money >= 49);
    } // ends game
    
    public Card newCard()
    {
        int index = (int)(Math.random()*newDeck.size()); 
        Card temporary = newDeck.get(index);
        newDeck.remove(index); 
        return temporary;
    } // end newCard()
    
} // end public class Game

 
  
   
