public class Vampire extends Monster {

    public Vampire() {

        super(MonsterType.VAMPIRE, 50);
    }


    @Override
    public void attacks(Monster monster) {
        if(this.isAlive() && monster.isAlive()) {
            System.out.println(this.getTypeOfMonster().name() + " is attacking " + monster.getTypeOfMonster().name() + " and makes " + this.getAttackPower() + " points of damage!" );
            monster.setHealthLevel(this.attackPower);

        }
            //        a chance that, when vampire attacks, it bites its enemy
            int healthIncrease = RandomNumber.generateRandomNumber(1, 3);
            if (healthIncrease == 3) {
                this.healthLevel += 20;
                System.out.println(this.getTypeOfMonster().name() + " not only attacked but also bit " + monster.getTypeOfMonster().name() + ". " + this.getTypeOfMonster() + "´S health level increased by 20 points. And now its health is " + this.getHealthLevel());
            }

        }



    }





