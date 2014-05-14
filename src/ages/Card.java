/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ages;

//import entity.*;
public class Card extends CardBank {
//[14:07:10] maxchen20041: 作一個方法
//[14:07:31] maxchen20041: 叫做生產
//[14:07:55] maxchen20041: 讓tokenBlue=tokenBlue+tokenYellow

    /**
     *
     * [14:07:10] maxchen20041: 作一個方法, 叫做生產, 讓tokenBlue=tokenBlue+tokenYellow
     */
    /**
     *
     * @param id
     * @param name
     * @param age
     * @param civilMilitary
     * @param tag
     * @param action
     * @param iconPoints
     * @param effect
     * @param color
     * @param cnt
     */
//    public Card(Integer id, String name, Integer age, String civilMilitary, String tag, String action, String iconPoints, String effect, String color, int cnt) {
//        super(id, name, age, civilMilitary, tag, action, iconPoints, effect, color, cnt);
//    }

    /**
     *
     * @param tokenBlue
     * @param tokenRed
     * @param tokenWhite
     * @param tokenYellow
     * @param effectBlue
     * @param effectFood
     * @param effectHouse
     * @param effectIdea
     * @param effectMusic
     * @param effectRed
     * @param effectSmile
     * @param effectStone
     * @param effectWeapon
     * @param effectWhite
     */
    public void setTokenEffect(int tokenBlue, int tokenRed, int tokenWhite, int tokenYellow, int effectBlue, int effectFood, int effectHouse, int effectIdea, int effectMusic, int effectRed, int effectSmile, int effectStone, int effectWeapon, int effectWhite) {
        setTokenBlue(tokenBlue);
        setTokenRed(tokenRed);
        setTokenWhite(tokenWhite);
        setTokenYellow(tokenYellow);

        setEffectBlue(effectBlue);
        setEffectFood(effectFood);
        setEffectHouse(effectHouse);
        setEffectIdea(effectIdea);
        setEffectMusic(effectMusic);
        setEffectRed(effectRed);
        setEffectSmile(effectSmile);
        setEffectStone(effectStone);
        setEffectWeapon(effectWeapon);
        setEffectWhite(effectWhite);

    }

    public Card() {
        super();
    }

    public void produce() {
        setTokenBlue(getTokenBlue() + getTokenYellow());
        //tokenBlue += tokenYellow;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(getId()).append("]{");
        sb.append(getName()).append(" | ");
        sb.append(getAge()).append(" | ");
        sb.append(getCivilMilitary()).append(" | ");
        sb.append(getTag()).append(" | ");
        sb.append(getAction()).append(" | ");
        sb.append(getIconPoints()).append(" | ");
        sb.append(getEffect()).append(" | ");
        sb.append(getCost()).append(" | ");
        sb.append(getColor()).append(" | ");
        sb.append(getCnt()).append("}\n ");
        sb.append("\t").append("<");
        sb.append(getTokenBlue()).append(",");
        sb.append(getTokenRed()).append(",");
        sb.append(getTokenWhite()).append(",");
        sb.append(getTokenYellow()).append(">");
        sb.append("\t").append("<");
        sb.append(getEffectBlue()).append(",");
        sb.append(getEffectFood()).append(",");
        sb.append(getEffectHouse()).append(",");
        sb.append(getEffectIdea()).append(",");
        sb.append(getEffectMusic()).append(",");
        sb.append(getEffectRed()).append(",");
        sb.append(getEffectSmile()).append(",");
        sb.append(getEffectStone()).append(",");
        sb.append(getEffectWeapon()).append(",");
        sb.append(getEffectWhite()).append(">");

        return sb.toString();
    }

    public Card copy() {
        Card card = new Card();

        card.setAction(this.getAction());
        card.setAge(this.getAge());
        card.setCivilMilitary(this.getCivilMilitary());
        card.setCnt(this.getCnt());
        card.setColor(this.getColor());
        card.setEffect(this.getEffect());
        card.setEffectBlue(this.getEffectBlue());
        card.setEffectFood(this.getEffectFood());
        card.setEffectHouse(this.getEffectHouse());
        card.setEffectIdea(this.getEffectIdea());
        card.setEffectMusic(this.getEffectMusic());
        card.setEffectRed(this.getEffectRed());
        card.setEffectSmile(this.getEffectSmile());
        card.setEffectStone(this.getEffectStone());
        card.setEffectWeapon(this.getEffectWeapon());
        card.setEffectWhite(this.getEffectWhite());

        card.setIconPoints(this.getIconPoints());
        card.setId(this.getId());
        card.setName(this.getName());
        card.setTag(this.getTag());
        card.setTokenBlue(this.getTokenBlue());
//        card.setTokenEffect(tokenBlue, tokenRed, tokenWhite, tokenYellow, effectBlue, effectFood, effectHouse, effectIdea, effectMusic, effectRed, effectSmile, effectStone, effectWeapon, effectWhite);
        card.setTokenRed(this.getTokenRed());
        card.setTokenWhite(this.getTokenWhite());
        card.setTokenYellow(this.getTokenYellow());

        return card;
    }

    
    public String toString(int style) {
        String[] ageStr = {"A", "I", "II", "III", "-"};

        switch (style) {
            case 0:// for qry
                StringBuilder sb0 = new StringBuilder();
                sb0.append("[").append(getId()).append(getName()).append("]\n");
                sb0.append(" age:").append(getAge()).append("\n");
                sb0.append(" cm:").append(getCivilMilitary()).append("\n");
                sb0.append(" tag:").append(getTag()).append("\n");
                sb0.append(" action:").append(getAction()).append("\n");
                sb0.append(" icon-points:").append(getIconPoints()).append("\n");
                sb0.append(" color:").append(getColor()).append("\n");
                sb0.append(" 白:").append(getTokenWhite()).append("\n");
                sb0.append(" 紅:").append(getTokenRed()).append("\n");
                sb0.append(" 黃:").append(getTokenYellow()).append("\n");
                sb0.append(" 藍:").append(getTokenBlue()).append("\n");
                sb0.append(" effect藍點:").append(getEffectBlue()).append("\n");
                sb0.append(" effect米:").append(getEffectFood()).append("\n");
                sb0.append(" effect房屋 :").append(getEffectHouse()).append("\n");
                sb0.append(" effect燈泡 :").append(getEffectIdea()).append("\n");
                sb0.append(" effect琴:").append(getEffectMusic()).append("\n");
                sb0.append(" effect紅點:").append(getEffectRed()).append("\n");
                sb0.append(" effect笑臉:").append(getEffectSmile()).append("\n");
                sb0.append(" effect石頭:").append(getEffectStone()).append("\n");
                sb0.append(" effect武器:").append(getEffectWeapon()).append("\n");
                sb0.append(" effect白點:").append(getEffectWhite()).append("\n");
                

                return sb0.toString();

            case 1:// for CardNow
                StringBuilder sb1 = new StringBuilder();
                sb1.append("[").append(ageStr[getAge()]);
                sb1.append(" ").append(getId());
                sb1.append(getName());
                sb1.append("-");
                sb1.append(getTag());
                sb1.append("] ");
                return sb1.toString();

            case 2: //實驗室
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[").append(getId());
                sb2.append(getName());
                sb2.append(" 黃");
                sb2.append(getTokenYellow());
                sb2.append(" 藍");
                sb2.append(getTokenBlue());

                sb2.append("]");
                return sb2.toString();
            case 3:

                StringBuilder sb3 = new StringBuilder();
                sb3.append("[").append(getId());
                sb3.append(getName());
                sb3.append(" 白");
                sb3.append(getEffectWhite());
                sb3.append(" 紅");
                sb3.append(getEffectRed());

                sb3.append("]");
                return sb3.toString();

            default:
                return toString();
        }
    }
}
