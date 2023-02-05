public class Werewolf extends Monster{

    public Werewolf() {
        super(MonsterType.WEREWOLF, 50);
    }


    @Override
    public void attacks(Monster monster) {
        if(this.isAlive() && monster.isAlive()) {
            System.out.println(this.getTypeOfMonster().name() + " is attacking " + monster.getTypeOfMonster().name() + " and makes " + this.getAttackPower() + " points of damage!" );
            monster.setHealthLevel(this.attackPower);

        }
    }
}
