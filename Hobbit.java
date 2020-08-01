package home_work2907;

public class Hobbit implements Hero{

    private int power;
    private int hp;
    private String name;

    public Hobbit(String name) {
        this.name = name;
        this.hp = 3;
        this.power = 0;
    }

    @Override
    public void kick(Hero enemy) {
    toCry();
    }

    private void toCry(){
        System.out.println("boooo hoooo");
    }

    @Override
    public int getPower() {
        return this.power;
    }

    @Override
    public void setPower(int newPower) {
        this.power=newPower;
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
        this.hp = hp-newHp;
        String msg = "Hobbit: "+getName()+" I'm loosing hp!!!";
    }

   /* @Override
    public void printMyStatus(String message) {
        System.out.println(message);
    }*/
}
