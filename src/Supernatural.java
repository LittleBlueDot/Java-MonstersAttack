public abstract class Supernatural implements Strikable {

    private MonsterType type;


    protected int healthLevel;

    protected int attackPower;

    protected boolean isStrikable;

    public Supernatural(MonsterType type, int attackPower) {
        this.type = type;
        this.attackPower = attackPower;
        healthLevel = 100;
        isStrikable = true;

    }

    @Override
    public boolean isAlive() {
        return healthLevel > 0;
    }

    @Override
    public MonsterType getTypeOfMonster() {
        return type;
    }

    @Override
    public int getHealthLevel() {
        return healthLevel;
    }

    @Override
    public int getAttackPower() {
        return attackPower;
    }


    public void setHealthLevel(int attackPower) {
        this.healthLevel -= attackPower;
        if (isAlive()) {
            System.out.println("Remaining " + getTypeOfMonster().name() + "´s health level is " + getHealthLevel());
        } else {
            System.out.println(type.name() + " : Ooh noo, I'm dead!");
        }
    }

}
