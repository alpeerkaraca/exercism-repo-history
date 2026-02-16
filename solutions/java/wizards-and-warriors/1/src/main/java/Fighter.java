class Fighter {
    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }

}

 class Wizard extends Fighter {
    private boolean hasSpellPrepared = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    boolean isVulnerable() {
        return !hasSpellPrepared;
    }

    boolean prepareSpell() {
        hasSpellPrepared = true;
        return hasSpellPrepared;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return hasSpellPrepared ? 12 : 3;
    }
}
