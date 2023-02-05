public class Mummy extends Monster {

    private int consecutiveAttacksCounter;

    public Mummy() {
        super(MonsterType.MUMMY, 20);
        consecutiveAttacksCounter = 1;
    }

    @Override
    public void attacks(Monster monster) {
        if (this.isAlive() && monster.isAlive()) {
            tryToAttack(monster);
        consecutiveAttacksCounter++;

        }
    }

    private void tryToAttack(Monster monster) {
        if (consecutiveAttacksCounter % 3 == 0) {
            this.healthLevel -= 10;
            System.out.println(this.getTypeOfMonster().name() + " can´t attack the third time. It looses 10 points of its health level. And the overall " + this.getTypeOfMonster().name() + "´s health level now is " + this.getHealthLevel());
        } else {
            System.out.println(this.getTypeOfMonster().name() + " is attacking " + monster.getTypeOfMonster().name() + " and makes " + this.getAttackPower() + " points of damage!" );
            monster.setHealthLevel(this.attackPower);
        }
    }

}
