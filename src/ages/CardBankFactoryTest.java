/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ages;

import java.util.List;

/**
 *
 * @author mark
 */
public class CardBankFactoryTest {
    public static void main(String[] args){
    new CardBankFactoryTest().test2();
        
    }
    public void test1(){
        
        List<CardBank> list1=new CardBankFactory().getAllCardBank();
        List<CardBank> list2=new CardBankFactory().getAllCardBank();
        System.out.println(" list1 "+list1.size());
        System.out.println(" list2 "+list2.size());
        
        list1.get(0);
//        list1.
        System.out.println(" list1 "+list1.size());
        System.out.println(" list2 "+list2.size());
        
//        list1.remove(0);
        CardBank c1=list1.remove(0);
        System.out.println(" c1 is"+c1.toString());
        System.out.println(" list1 "+list1.size());
        System.out.println(" list2 "+list2.size());
        
        
        
    }
    
    public void test2(){
        
        CardArray list1=new CardBankFactory().getAllCards();
        CardArray list2=new CardBankFactory().getAllCards();
        
        System.out.println(" list1 "+list1.size());
        System.out.println(" list2 "+list2.size());
        
        Card c1;
        
        c1=list1.get(0);
        System.out.println(" c1 is"+c1.toString());
        System.out.println(" list1 "+list1.size());
        System.out.println(" list2 "+list2.size());
        
//        list1.remove(0);
        c1=list1.remove(0);
        System.out.println(" c1 is"+c1.toString());
        System.out.println(" list1 "+list1.size());
        System.out.println(" list2 "+list2.size());
      
        c1=list1.getCardById(1009);
        System.out.println(" c1 is"+c1.toString());
        System.out.println(" list1 "+list1.size());
        System.out.println(" list2 "+list2.size());
        
        
        
    }
}
