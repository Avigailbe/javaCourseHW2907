package home_work2907;

public interface Hero {

    void kick(Hero enemy);

    //usually will be used to calculate damage this hero are doing
    int power=0;

    //Hit Points: amount of life, usually if it is zero, it means that this hero is dead
    int hp=0;

    //check if alive
    default boolean isAlive() {
        return (getHp() > 0 && getPower()>0 );
    }

    int getPower();

    String getName();

    void setName(String name);

    int getHp();

    void setHp(int newHp);

    void setPower(int newPower);

    default void printMyStatus(String message){
        System.out.println(message);
    }

    //  void print what happens
    default void printWhatsHappening(Hero h1, Hero h2){
        System.out.println(h1.getName()+ " has " + h1.getPower()+" power left and "+h1.getHp()+" hp left");
        System.out.println(h2.getName()+ " has " + h2.getPower()+" power left and "+h2.getHp()+" hp left");
    }
}
