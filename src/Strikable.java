public interface Strikable {

    public abstract void attacks(Monster monster);

    public boolean isAlive();

    public MonsterType getTypeOfMonster();

    public int getHealthLevel();

    public int getAttackPower();


}
