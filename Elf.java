package home_work2907;

public class Elf implements Hero{

    private int power;
    private int hp;
    private String name;

    public Elf(String name) {
        this.name = name;
        this.power = 10;
        this.hp = 10;
    }

    @Override
    //checks if power higher than enemy, if so kills enemy hp=0 to enemy.
    //if the hp of enemy is higher than elf, reduces hp by one each time
    //till elfs hp are higher then kills (sets hp=0)
    public void kick(Hero enemy) {
        String msg = "Elf name: "+getName()+" I'm kicking!!";
        printMyStatus(msg);
        //check if elf's power more than enemy. if not, then reduces enemy's power by 1
        while (enemy.getPower()>getPower()) {
            msg = "Elf name: "+getName()+" I'm kicking!! Enemy "+enemy.getName()+" is loosing";
            enemy.setPower(enemy.getPower() - 1);
            enemy.setHp(enemy.getHp() - 1);
            printWhatsHappening(this, enemy);
        }
            enemy.setPower(0);
            msg = "Elf name: "+getName()+" I'm kicking!! Enemy "+enemy.getName()+" is dead!!!";
            printMyStatus(msg);
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
    //hp go down when hit
    public int getHp() {
        return this.hp;
    }

    @Override
    public void setHp(int newHp) {
        String msg = "Elf: "+getName()+" I'm loosing hp!!!";
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
