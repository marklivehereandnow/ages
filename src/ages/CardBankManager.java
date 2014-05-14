/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ages;

/**
 *
 * @author mark
 */
public class CardBankManager {
    private CardBank cardBank;

     CardArray allCards;

    public CardArray getAllCards() {
    CardArray temp=new CardArray() ;
     for (int k=0;k<allCards.size();k++){
         temp.add(allCards.get(k));
     }
        return temp;
    }

    public CardBankManager() {
        cardBank=new CardBank();
    }
    
}
