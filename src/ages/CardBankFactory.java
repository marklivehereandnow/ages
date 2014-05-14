package ages;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CardBankFactory {

    private static final String PERSISTENCE_UNIT_NAME = "agesPU";
    private static EntityManagerFactory factory;
    private static EntityManager em;
    Set<String> icons;

    public CardBankFactory() {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        em = factory.createEntityManager();
        icons = new HashSet<>();
    }

    public static void main(String[] args) {
        new CardBankFactory().getAllCardBank();

    }

    public List<CardBank> getAllCardBank() {
        return em.createNamedQuery("CardBank.findAll").getResultList();
//     
//        System.out.println("DEBUG...");
//        List<CardBank> cardBank=em.createNamedQuery("CardBank.findAll").getResultList();
//        for (CardBank cb:cardBank){
//            System.out.println(""+cb.getId()+cb.getName());
//        }
    }

    public CardArray getAllCards() {
//           return em.createNamedQuery("CardBank.findAll").getResultList();
//     
//        System.out.println("DEBUG...");
        List<CardBank> cardBank = em.createNamedQuery("CardBank.findAll").getResultList();
        CardArray ca = new CardArray();
        for (CardBank cb : cardBank) {
            System.out.println("" + cb.getId() + cb.getName());
            Card card = new Card();
//            card.setAction(cb.getAction());
            card.setId(cb.getId());
            card.setName(cb.getName());
            card.setAction(cb.getAction());
            card.setIconPoints(cb.getIconPoints());

            card.setEffect(cb.getEffect());

            ca.add(card);
        }
        return ca;
    }
}
