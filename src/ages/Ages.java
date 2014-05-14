package ages;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Ages {

    private static final String PERSISTENCE_UNIT_NAME = "agesPU";
    private static EntityManagerFactory factory;
    private static EntityManager em;
    Set<String> icons;

    public Ages() {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        em = factory.createEntityManager();
        icons=new HashSet<>();
    }

    public static void main(String[] args) {
        new Ages().doTask1();

    }

    public void doTask1() {
        List<CardBank> list = em.createQuery("select t from CardBank t order by t.seq ").getResultList();
//        List<CardBank> list = em.createNamedQuery("CardBank.findById").setParameter("id", 1012).getResultList();
        System.out.println("" + list);
        int cntEffect = 0;
        int cntIconPoints = 0;
        
        for (CardBank cb : list) {
            if (cb.getEffect().trim().length() > 0) {
                cntEffect++;
//                System.out.println(" id " + cb.getId());
                parseCardEffect(cb);
            }
            if (cb.getIconPoints().trim().length() > 0) {
                cntIconPoints++;
                System.out.println(" IconPoints  id=" + cb.getId());
                parseIconPoints(cb);
            }
            
        }
        System.out.println(cntEffect + "  records affected. --- Effect");
        System.out.println(cntIconPoints + "  records affected. --- IconPoints");
    }

    void parseCardEffect(CardBank cardBank) {
//        int counter=0;
        String[] tokens = cardBank.getEffect().split(";");
        for (String token : tokens) {
            if (token.trim().length() == 0) {
                continue;
            }
//            System.out.println(""+token);
            String[] pair = token.split(":");
            String key = pair[0];
            int val = -999;
            try {
                val = Integer.parseInt(pair[1]);
            } catch (Exception ex) {
                System.out.println(cardBank.getId() + " effect is " + cardBank.getEffect());

                System.out.println("token is ###" + token + "###");
                ex.printStackTrace();
            }
//            System.out.println(key + " " + val);

//            Effect keyword: [+黃點, +白點, +紅點, 石頭, 燈泡, 笑臉, 食物, 過期武器, +房屋, 音樂, +藍點, 武器]
            switch (key) {
                case "+黃點":
                    cardBank.setEffectYellow(val);
                    break;
                case "+白點":
                    cardBank.setEffectWhite(val);
                    break;
                case "+紅點":
                    cardBank.setEffectRed(val);
                    break;
                case "+藍點":
                    cardBank.setEffectBlue(val);
                    break;
                case "+房屋":
                    cardBank.setEffectHouse(val);
                    break;
                case "食物":
                    cardBank.setEffectFood(val);
                    break;
                case "音樂":
                    cardBank.setEffectMusic(val);
                    break;
                case "石頭":
                    cardBank.setEffectStone(val);
                    break;
                case "燈泡":
                    cardBank.setEffectIdea(val);
                    break;
                case "笑臉":
                    cardBank.setEffectSmile(val);
                    break;
                case "藍點":
                    cardBank.setEffectBlue(val);
                    break;
                case "武器":
                    cardBank.setEffectWeapon(val);
                    break;
                case "過期武器":
                    cardBank.setEffectWeaponOld(val);
                    break;
                default:
                    System.out.println("***************NEED TO HANDLE => " + key);
            }
        }
        System.out.println(" " + cardBank.toString());

        em.getTransaction().begin();
        em.persist(cardBank);
        em.getTransaction().commit();

    }

    
    
     void parseIconPoints(CardBank cardBank) {
//        int counter=0;
        String[] tokens = cardBank.getIconPoints().split(";");
        for (String token : tokens) {
            if (token.trim().length() == 0) {
                continue;
            }
//            System.out.println(""+token);
            String[] pair = token.split(":");
            String key = pair[0];
            int val = -999;
            try {
                if (key.equals("奇蹟石頭")){
                    val=98765;
                }else{
                
                
                
                val = Integer.parseInt(pair[1]);
                }
            } catch (Exception ex) {
                System.out.println(cardBank.getId() + " IconPoints is " + cardBank.getIconPoints());

                System.out.println("token is ###" + token + "###");
                ex.printStackTrace();
                System.exit(-1);
            }
//            System.out.println(key + " " + val);

//            Effect keyword: [+黃點, +白點, +紅點, 石頭, 燈泡, 笑臉, 食物, 過期武器, +房屋, 音樂, +藍點, 武器]
            switch (key) {
                case "擴充人口":
                    cardBank.setCostPeople(val);
                    break;
                case "步":
                    cardBank.setCostFoot(val);
                    break;
                case "奇蹟石頭":
                    cardBank.setCostWonder(val);
                    break;
                case "軍事牌":
                    cardBank.setCostMilitary(val);
                    break;
                case "馬":
                    cardBank.setCostHorse(val);
                    break;
                case "炮":
                    cardBank.setCostCannon(val);
                    break;
                case "和平燈炮":
                    cardBank.setCostPeace(val);
                    break;
                case "革命燈泡":
                    cardBank.setCostRevolution(val);
                    break;
                case "消耗紅點":
                    cardBank.setCostRed(val);
                    break;
                case "石頭":
                    cardBank.setCostStone(val);
                    break;
                case "燈泡":
                    cardBank.setCostIdea(val);
                    break;
                case "食物":
                    cardBank.setCostFood(val);
                    break;
                case "音樂":
                    cardBank.setCostMusic(val);
                    break;
                    
                    
                    
                default:
                    System.out.println("***************NEED TO HANDLE => " + key);
//                    System.exit(-1);
            }
            icons.add(key);
        }
         System.out.println(" "+icons);
        System.out.println(" " + cardBank.toString());
//
//        em.getTransaction().begin();
//        em.persist(cardBank);
//        em.getTransaction().commit();

    }

}
