public abstract class Monster extends Supernatural {


    public Monster(MonsterType type, int attackPower) {
        super(type, attackPower);
    }

    public void attacks(Supernatural supernatural) {
        if (this.isAlive() && isAlive() && supernatural.isStrikable) {
            System.out.println(this.getTypeOfMonster().name() + " is attacking " + supernatural.getTypeOfMonster().name() + " and makes only half of the usual damage: " + this.getAttackPower() / 2 + " points.");
            supernatural.setHealthLevel(this.attackPower / 2);
            return;

        }
        System.out.println("You cant´t attack FAIRY, it´s a FAIRY!");

    }
}

