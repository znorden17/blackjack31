//Define cards & deck  
import java.util.Random;
import java.util.*;
import java.util.Scanner;

/* 
Switches are our friend
https://www.w3schools.com/java/java_switch.asp
*/
public class Card {
    
 // private List<String> Card;
  //private List<String> suit;
  public String suit;
  public String value;
  public Card(String suit, String value){
       this.suit = suit;
       this.value = value;       
  }
  public void printCards()
  {
      System.out.println(value+ " of "+ suit);
  
  }
  public int getScore(String CardName){
      int score = 0;
      switch(CardName){
          case "Ace":  score = 11;
               break;
               case "2": score = 2;
               break;
               case "3": score = 3;
               break;
               case "4": score = 4;
               break;
               case "5": score = 5;
               break;
               case "6": score = 6;
               break; 
               case "7": score = 7;
               break; 
               case "8": score = 8;
               break;
               case "9": score = 9;
               break;
               case "10": score = 10;
               break; 
               case "Jack": score = 10;
               break;
               case "Queen": score = 10;
               break;        
               case "King": score = 10;
               break; 
             
               
      }
      return score;
  }
    }
