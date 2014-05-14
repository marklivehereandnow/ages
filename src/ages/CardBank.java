/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ages;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mark
 */
@Entity
@Table(name = "CARD_BANK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CardBank.findAll", query = "SELECT c FROM CardBank c"),
    @NamedQuery(name = "CardBank.findBySeq", query = "SELECT c FROM CardBank c WHERE c.seq = :seq"),
    @NamedQuery(name = "CardBank.findById", query = "SELECT c FROM CardBank c WHERE c.id = :id"),
    @NamedQuery(name = "CardBank.findByName", query = "SELECT c FROM CardBank c WHERE c.name = :name"),
    @NamedQuery(name = "CardBank.findByAge", query = "SELECT c FROM CardBank c WHERE c.age = :age"),
    @NamedQuery(name = "CardBank.findByCivilMilitary", query = "SELECT c FROM CardBank c WHERE c.civilMilitary = :civilMilitary"),
    @NamedQuery(name = "CardBank.findByTag", query = "SELECT c FROM CardBank c WHERE c.tag = :tag"),
    @NamedQuery(name = "CardBank.findByAction", query = "SELECT c FROM CardBank c WHERE c.action = :action"),
    @NamedQuery(name = "CardBank.findByIconPoints", query = "SELECT c FROM CardBank c WHERE c.iconPoints = :iconPoints"),
    @NamedQuery(name = "CardBank.findByEffect", query = "SELECT c FROM CardBank c WHERE c.effect = :effect"),
    @NamedQuery(name = "CardBank.findByCost", query = "SELECT c FROM CardBank c WHERE c.cost = :cost"),
    @NamedQuery(name = "CardBank.findByColor", query = "SELECT c FROM CardBank c WHERE c.color = :color"),
    @NamedQuery(name = "CardBank.findByCnt", query = "SELECT c FROM CardBank c WHERE c.cnt = :cnt"),
    @NamedQuery(name = "CardBank.findByTokenWhite", query = "SELECT c FROM CardBank c WHERE c.tokenWhite = :tokenWhite"),
    @NamedQuery(name = "CardBank.findByTokenRed", query = "SELECT c FROM CardBank c WHERE c.tokenRed = :tokenRed"),
    @NamedQuery(name = "CardBank.findByTokenYellow", query = "SELECT c FROM CardBank c WHERE c.tokenYellow = :tokenYellow"),
    @NamedQuery(name = "CardBank.findByTokenBlue", query = "SELECT c FROM CardBank c WHERE c.tokenBlue = :tokenBlue"),
    @NamedQuery(name = "CardBank.findByEffectWhite", query = "SELECT c FROM CardBank c WHERE c.effectWhite = :effectWhite"),
    @NamedQuery(name = "CardBank.findByEffectFood", query = "SELECT c FROM CardBank c WHERE c.effectFood = :effectFood"),
    @NamedQuery(name = "CardBank.findByEffectRed", query = "SELECT c FROM CardBank c WHERE c.effectRed = :effectRed"),
    @NamedQuery(name = "CardBank.findByEffectMusic", query = "SELECT c FROM CardBank c WHERE c.effectMusic = :effectMusic"),
    @NamedQuery(name = "CardBank.findByEffectStone", query = "SELECT c FROM CardBank c WHERE c.effectStone = :effectStone"),
    @NamedQuery(name = "CardBank.findByEffectIdea", query = "SELECT c FROM CardBank c WHERE c.effectIdea = :effectIdea"),
    @NamedQuery(name = "CardBank.findByEffectSmile", query = "SELECT c FROM CardBank c WHERE c.effectSmile = :effectSmile"),
    @NamedQuery(name = "CardBank.findByEffectHouse", query = "SELECT c FROM CardBank c WHERE c.effectHouse = :effectHouse"),
    @NamedQuery(name = "CardBank.findByEffectBlue", query = "SELECT c FROM CardBank c WHERE c.effectBlue = :effectBlue"),
    @NamedQuery(name = "CardBank.findByEffectWeapon", query = "SELECT c FROM CardBank c WHERE c.effectWeapon = :effectWeapon"),
    @NamedQuery(name = "CardBank.findByEffectWeaponOld", query = "SELECT c FROM CardBank c WHERE c.effectWeaponOld = :effectWeaponOld"),
    @NamedQuery(name = "CardBank.findByEffectYellow", query = "SELECT c FROM CardBank c WHERE c.effectYellow = :effectYellow"),
    @NamedQuery(name = "CardBank.findByCostPeople", query = "SELECT c FROM CardBank c WHERE c.costPeople = :costPeople"),
    @NamedQuery(name = "CardBank.findByCostFoot", query = "SELECT c FROM CardBank c WHERE c.costFoot = :costFoot"),
    @NamedQuery(name = "CardBank.findByCostWonder", query = "SELECT c FROM CardBank c WHERE c.costWonder = :costWonder"),
    @NamedQuery(name = "CardBank.findByCostMilitary", query = "SELECT c FROM CardBank c WHERE c.costMilitary = :costMilitary"),
    @NamedQuery(name = "CardBank.findByCostHorse", query = "SELECT c FROM CardBank c WHERE c.costHorse = :costHorse"),
    @NamedQuery(name = "CardBank.findByCostCannon", query = "SELECT c FROM CardBank c WHERE c.costCannon = :costCannon"),
    @NamedQuery(name = "CardBank.findByCostPeace", query = "SELECT c FROM CardBank c WHERE c.costPeace = :costPeace"),
    @NamedQuery(name = "CardBank.findByCostRevolution", query = "SELECT c FROM CardBank c WHERE c.costRevolution = :costRevolution"),
    @NamedQuery(name = "CardBank.findByCostRed", query = "SELECT c FROM CardBank c WHERE c.costRed = :costRed"),
    @NamedQuery(name = "CardBank.findByCostStone", query = "SELECT c FROM CardBank c WHERE c.costStone = :costStone"),
    @NamedQuery(name = "CardBank.findByCostIdea", query = "SELECT c FROM CardBank c WHERE c.costIdea = :costIdea"),
    @NamedQuery(name = "CardBank.findByCostFood", query = "SELECT c FROM CardBank c WHERE c.costFood = :costFood"),
    @NamedQuery(name = "CardBank.findByCostMusic", query = "SELECT c FROM CardBank c WHERE c.costMusic = :costMusic")})
public class CardBank implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SEQ")
    private Integer seq;
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "AGE")
    private Integer age;
    @Column(name = "CIVIL_MILITARY")
    private String civilMilitary;
    @Column(name = "TAG")
    private String tag;
    @Basic(optional = false)
    @Column(name = "ACTION")
    private String action;
    @Basic(optional = false)
    @Column(name = "ICON_POINTS")
    private String iconPoints;
    @Basic(optional = false)
    @Column(name = "EFFECT")
    private String effect;
    @Column(name = "COST")
    private String cost;
    @Column(name = "COLOR")
    private String color;
    @Basic(optional = false)
    @Column(name = "CNT")
    private int cnt;
    @Basic(optional = false)
    @Column(name = "TOKEN_WHITE")
    private int tokenWhite;
    @Basic(optional = false)
    @Column(name = "TOKEN_RED")
    private int tokenRed;
    @Basic(optional = false)
    @Column(name = "TOKEN_YELLOW")
    private int tokenYellow;
    @Basic(optional = false)
    @Column(name = "TOKEN_BLUE")
    private int tokenBlue;
    @Basic(optional = false)
    @Column(name = "EFFECT_WHITE")
    private int effectWhite;
    @Basic(optional = false)
    @Column(name = "EFFECT_FOOD")
    private int effectFood;
    @Basic(optional = false)
    @Column(name = "EFFECT_RED")
    private int effectRed;
    @Basic(optional = false)
    @Column(name = "EFFECT_MUSIC")
    private int effectMusic;
    @Basic(optional = false)
    @Column(name = "EFFECT_STONE")
    private int effectStone;
    @Basic(optional = false)
    @Column(name = "EFFECT_IDEA")
    private int effectIdea;
    @Basic(optional = false)
    @Column(name = "EFFECT_SMILE")
    private int effectSmile;
    @Basic(optional = false)
    @Column(name = "EFFECT_HOUSE")
    private int effectHouse;
    @Basic(optional = false)
    @Column(name = "EFFECT_BLUE")
    private int effectBlue;
    @Basic(optional = false)
    @Column(name = "EFFECT_WEAPON")
    private int effectWeapon;
    @Basic(optional = false)
    @Column(name = "EFFECT_WEAPON_OLD")
    private int effectWeaponOld;
    @Basic(optional = false)
    @Column(name = "EFFECT_YELLOW")
    private int effectYellow;
    @Basic(optional = false)
    @Column(name = "COST_PEOPLE")
    private int costPeople;
    @Basic(optional = false)
    @Column(name = "COST_FOOT")
    private int costFoot;
    @Basic(optional = false)
    @Column(name = "COST_WONDER")
    private int costWonder;
    @Basic(optional = false)
    @Column(name = "COST_MILITARY")
    private int costMilitary;
    @Basic(optional = false)
    @Column(name = "COST_HORSE")
    private int costHorse;
    @Basic(optional = false)
    @Column(name = "COST_CANNON")
    private int costCannon;
    @Basic(optional = false)
    @Column(name = "COST_PEACE")
    private int costPeace;
    @Basic(optional = false)
    @Column(name = "COST_REVOLUTION")
    private int costRevolution;
    @Basic(optional = false)
    @Column(name = "COST_RED")
    private int costRed;
    @Basic(optional = false)
    @Column(name = "COST_STONE")
    private int costStone;
    @Basic(optional = false)
    @Column(name = "COST_IDEA")
    private int costIdea;
    @Basic(optional = false)
    @Column(name = "COST_FOOD")
    private int costFood;
    @Basic(optional = false)
    @Column(name = "COST_MUSIC")
    private int costMusic;

    public CardBank() {
    }

    public CardBank(Integer seq) {
        this.seq = seq;
    }

    public CardBank(Integer seq, int id, String action, String iconPoints, String effect, int cnt, int tokenWhite, int tokenRed, int tokenYellow, int tokenBlue, int effectWhite, int effectFood, int effectRed, int effectMusic, int effectStone, int effectIdea, int effectSmile, int effectHouse, int effectBlue, int effectWeapon, int effectWeaponOld, int effectYellow, int costPeople, int costFoot, int costWonder, int costMilitary, int costHorse, int costCannon, int costPeace, int costRevolution, int costRed, int costStone, int costIdea, int costFood, int costMusic) {
        this.seq = seq;
        this.id = id;
        this.action = action;
        this.iconPoints = iconPoints;
        this.effect = effect;
        this.cnt = cnt;
        this.tokenWhite = tokenWhite;
        this.tokenRed = tokenRed;
        this.tokenYellow = tokenYellow;
        this.tokenBlue = tokenBlue;
        this.effectWhite = effectWhite;
        this.effectFood = effectFood;
        this.effectRed = effectRed;
        this.effectMusic = effectMusic;
        this.effectStone = effectStone;
        this.effectIdea = effectIdea;
        this.effectSmile = effectSmile;
        this.effectHouse = effectHouse;
        this.effectBlue = effectBlue;
        this.effectWeapon = effectWeapon;
        this.effectWeaponOld = effectWeaponOld;
        this.effectYellow = effectYellow;
        this.costPeople = costPeople;
        this.costFoot = costFoot;
        this.costWonder = costWonder;
        this.costMilitary = costMilitary;
        this.costHorse = costHorse;
        this.costCannon = costCannon;
        this.costPeace = costPeace;
        this.costRevolution = costRevolution;
        this.costRed = costRed;
        this.costStone = costStone;
        this.costIdea = costIdea;
        this.costFood = costFood;
        this.costMusic = costMusic;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCivilMilitary() {
        return civilMilitary;
    }

    public void setCivilMilitary(String civilMilitary) {
        this.civilMilitary = civilMilitary;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getIconPoints() {
        return iconPoints;
    }

    public void setIconPoints(String iconPoints) {
        this.iconPoints = iconPoints;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public int getTokenWhite() {
        return tokenWhite;
    }

    public void setTokenWhite(int tokenWhite) {
        this.tokenWhite = tokenWhite;
    }

    public int getTokenRed() {
        return tokenRed;
    }

    public void setTokenRed(int tokenRed) {
        this.tokenRed = tokenRed;
    }

    public int getTokenYellow() {
        return tokenYellow;
    }

    public void setTokenYellow(int tokenYellow) {
        this.tokenYellow = tokenYellow;
    }

    public int getTokenBlue() {
        return tokenBlue;
    }

    public void setTokenBlue(int tokenBlue) {
        this.tokenBlue = tokenBlue;
    }

    public int getEffectWhite() {
        return effectWhite;
    }

    public void setEffectWhite(int effectWhite) {
        this.effectWhite = effectWhite;
    }

    public int getEffectFood() {
        return effectFood;
    }

    public void setEffectFood(int effectFood) {
        this.effectFood = effectFood;
    }

    public int getEffectRed() {
        return effectRed;
    }

    public void setEffectRed(int effectRed) {
        this.effectRed = effectRed;
    }

    public int getEffectMusic() {
        return effectMusic;
    }

    public void setEffectMusic(int effectMusic) {
        this.effectMusic = effectMusic;
    }

    public int getEffectStone() {
        return effectStone;
    }

    public void setEffectStone(int effectStone) {
        this.effectStone = effectStone;
    }

    public int getEffectIdea() {
        return effectIdea;
    }

    public void setEffectIdea(int effectIdea) {
        this.effectIdea = effectIdea;
    }

    public int getEffectSmile() {
        return effectSmile;
    }

    public void setEffectSmile(int effectSmile) {
        this.effectSmile = effectSmile;
    }

    public int getEffectHouse() {
        return effectHouse;
    }

    public void setEffectHouse(int effectHouse) {
        this.effectHouse = effectHouse;
    }

    public int getEffectBlue() {
        return effectBlue;
    }

    public void setEffectBlue(int effectBlue) {
        this.effectBlue = effectBlue;
    }

    public int getEffectWeapon() {
        return effectWeapon;
    }

    public void setEffectWeapon(int effectWeapon) {
        this.effectWeapon = effectWeapon;
    }

    public int getEffectWeaponOld() {
        return effectWeaponOld;
    }

    public void setEffectWeaponOld(int effectWeaponOld) {
        this.effectWeaponOld = effectWeaponOld;
    }

    public int getEffectYellow() {
        return effectYellow;
    }

    public void setEffectYellow(int effectYellow) {
        this.effectYellow = effectYellow;
    }

    public int getCostPeople() {
        return costPeople;
    }

    public void setCostPeople(int costPeople) {
        this.costPeople = costPeople;
    }

    public int getCostFoot() {
        return costFoot;
    }

    public void setCostFoot(int costFoot) {
        this.costFoot = costFoot;
    }

    public int getCostWonder() {
        return costWonder;
    }

    public void setCostWonder(int costWonder) {
        this.costWonder = costWonder;
    }

    public int getCostMilitary() {
        return costMilitary;
    }

    public void setCostMilitary(int costMilitary) {
        this.costMilitary = costMilitary;
    }

    public int getCostHorse() {
        return costHorse;
    }

    public void setCostHorse(int costHorse) {
        this.costHorse = costHorse;
    }

    public int getCostCannon() {
        return costCannon;
    }

    public void setCostCannon(int costCannon) {
        this.costCannon = costCannon;
    }

    public int getCostPeace() {
        return costPeace;
    }

    public void setCostPeace(int costPeace) {
        this.costPeace = costPeace;
    }

    public int getCostRevolution() {
        return costRevolution;
    }

    public void setCostRevolution(int costRevolution) {
        this.costRevolution = costRevolution;
    }

    public int getCostRed() {
        return costRed;
    }

    public void setCostRed(int costRed) {
        this.costRed = costRed;
    }

    public int getCostStone() {
        return costStone;
    }

    public void setCostStone(int costStone) {
        this.costStone = costStone;
    }

    public int getCostIdea() {
        return costIdea;
    }

    public void setCostIdea(int costIdea) {
        this.costIdea = costIdea;
    }

    public int getCostFood() {
        return costFood;
    }

    public void setCostFood(int costFood) {
        this.costFood = costFood;
    }

    public int getCostMusic() {
        return costMusic;
    }

    public void setCostMusic(int costMusic) {
        this.costMusic = costMusic;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seq != null ? seq.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CardBank)) {
            return false;
        }
        CardBank other = (CardBank) object;
        if ((this.seq == null && other.seq != null) || (this.seq != null && !this.seq.equals(other.seq))) {
            return false;
        }
        return true;
    }

//    @Override
//    public String toString() {
//        return "ages.CardBank[ seq=" + seq + " ]";
//    }
    @Override
    public String toString() {
        return "CardBank{" + "seq=" + seq + ", id=" + id + ", name=" + name + ", age=" + age + ", civilMilitary=" + civilMilitary + ", tag=" + tag + ", action=" + action + ", iconPoints=" + iconPoints + ", effect=" + effect + ", cost=" + cost + ", color=" + color + ", cnt=" + cnt + ",\ntokenWhite=" + tokenWhite + ", tokenRed=" + tokenRed + ", tokenYellow=" + tokenYellow + ", tokenBlue=" + tokenBlue + ", \neffectWhite=" + effectWhite + ", effectFood=" + effectFood + ", effectRed=" + effectRed + ", effectMusic=" + effectMusic + ", effectStone=" + effectStone + ", effectIdea=" + effectIdea + ", effectSmile=" + effectSmile + ", effectHouse=" + effectHouse + ", effectBlue=" + effectBlue + ", effectWeapon=" + effectWeapon + ", effectWeaponOld=" + effectWeaponOld + ", effectYellow=" + effectYellow + ", \ncostPeople=" + costPeople + ", costFoot=" + costFoot + ", costWonder=" + costWonder + ", costMilitary=" + costMilitary + ", costHorse=" + costHorse + ", costCannon=" + costCannon + ", costPeace=" + costPeace + ", costRevolution=" + costRevolution + ", costRed=" + costRed + ", costStone=" + costStone + ", costIdea=" + costIdea + ", costFood=" + costFood + ", costMusic=" + costMusic + '}';
    }
    
}
