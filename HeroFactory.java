package home_work2907;

public class HeroFactory {

    int h = 1;
    int e = 1;
    int kn = 1;
    int k = 1;


    //returns random hero
    public Hero createHero(){
        int heroNum = Math.abs((int)(Math.random()*(4-1)+1)+1);
        Hero hero = null;

        if (heroNum == 1) {
            hero = new Hobbit("Hobbit" + h++);
        }
        else if(heroNum == 2){
            hero = new Elf("Elf" + e++);
        }
        else if(heroNum == 3){
            hero = new Knight("Knight" + kn++);
        }
        else if(heroNum == 4){
            hero = new King("King" + k++);
        }
        return hero;
    }
}
