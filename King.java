package home_work2907;

public class King implements Hero, RoyalHero{

    private int power;
    private int hp;
    private String name;
    private final int MAXPOWER = 15;
    private final int MINPOWER = 5;

    public King(String name) {
        this.name = name;
        this.power = getPower(MAXPOWER, MINPOWER);//Math.abs((int)(Math.random()*(15-5)+1)+5);
        this.hp = getHp(MAXPOWER, MINPOWER);//Math.abs((int)(Math.random()*(15-5)+1)+5);
    }

    public void setHpEnemy(Hero enemy){
        int maxPowerForDecrease = this.power;
        int decreaseAmt = getDecreaseAmt(maxPowerForDecrease,MINPOWER);//Math.abs((int)(Math.random()*(maxPower-5)+1)+5);
        enemy.setHp(decreaseAmt);
        enemy.setPower(decreaseAmt);
        String msg = "King name: "+getName()+" My enemy "+enemy.getName()+ " has lost his hp by: " +decreaseAmt;
        printMyStatus(msg);

    }

    @Override
    //decreases hp of enemy by random number in range of kings power (5-15)
    public void kick(Hero enemy) {
        String msg = "King name: "+getName()+" I'm kicking!!";
        printMyStatus(msg);
        setHpEnemy(enemy);
        printWhatsHappening(this, enemy);
    }

    @Override
    public int getPower() {
        return this.power;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public void setHp(int newHp) {
        String msg = "King: "+getName()+" I'm loosing hp!!!";
        printMyStatus(msg);
        this.hp = hp-newHp;
    }

    @Override
    public void setPower(int newPower) {
        this.power=newPower;
    }

    @Override
    public void printMyStatus(String message) {
        System.out.println(message);
    }
}
