public class Witch extends Supernatural implements Strikable{
    public Witch() {
        super(MonsterType.WITCH, 40);
    }

    @Override
    public void attacks(Monster monster) {
        if(this.isAlive() && monster.isAlive()) {
            System.out.println(this.getTypeOfMonster().name() + " is attacking " + monster.getTypeOfMonster().name() + " and makes " + this.getAttackPower() + " points of damage!" );
            monster.setHealthLevel(this.attackPower);
        }
    }

}
