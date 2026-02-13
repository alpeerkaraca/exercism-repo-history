import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class DnDCharacter {
    private final Random random = new Random();
    
    private int str = ability(rollDice());
    private int dex = ability(rollDice());
    private int cst = ability(rollDice());
    private int intel = ability(rollDice());
    private int wis = ability(rollDice());
    private int chr = ability(rollDice());
    private int hp = 10 + modifier(this.cst);


    int ability(List<Integer> scores) {
        return scores
            .stream()
            .sorted(Collections.reverseOrder())
            .limit(3)
            .mapToInt(Integer::intValue)
            .sum();
        }

    List<Integer> rollDice() {
        List<Integer> dices = new ArrayList<Integer>();
        for (int i = 0; i< 4; i++) {
            dices.add(this.random.nextInt(6) + 1);
        }
        return dices;
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
        }

    int getStrength() {
        return this.str;
        }

    int getDexterity() {
        return this.dex;
    }

    int getConstitution() {
        return this.cst;
    }

    int getIntelligence() {
        return this.intel;
    }

    int getWisdom() {
        return this.wis;
    }

    int getCharisma() {
        return this.chr;
    }

    int getHitpoints() {
        return this.hp;
        }
}
