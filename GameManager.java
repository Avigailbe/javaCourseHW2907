package home_work2907;

public class GameManager {

    HeroFactory heroFactory = new HeroFactory();
    int gameAmt=10;
    int gameCount=0;

    public GameManager(int gameAmt) {
        this.gameAmt = gameAmt;
    }

    void fight(Hero h1, Hero h2){
        int counter = 0;
        String msg = null;
        gameCount++;
        //check if heroes are both Hobbits. If so play 2 rounds
        if(h1 instanceof Hobbit && h2 instanceof Hobbit) {
            counter+=2;
        }
            //fight till h1 or h2 are isAlive()=false
            //or if both hobbits, for 2 rounds only
            while ((h1.isAlive() && h2.isAlive()) || counter>0) {
                h1.kick(h2);
                if(h2.isAlive()) {
                    h2.kick(h1);
                }
                counter--;
            }

            if ((!h1.isAlive()) && (!h2.isAlive())){
                msg = "End of game.";
                printEndGame(msg);
                while (gameCount<gameAmt) {
                    createHeroes();
                }
            }
            else if(h1.isAlive()) {
                msg = "End of game. "+h1.getName()+" won against"+" enemy "+h2.getName();
                printEndGame(msg);
                while (gameCount<gameAmt) {
                    createNewHero(h1);
                }
            }
            else{
                msg = "End of game. "+h2.getName()+" won against"+" enemy "+h1.getName();
                printEndGame(msg);
                while (gameCount<gameAmt) {
                    createNewHero(h2);
                }
            }


      //  print who is dead and who alive
        //when dies, create a new
        //not hobbit
    }

    void createNewHero(Hero lastWinner){
            Hero h1 = heroFactory.createHero();
            printHeroInfo(h1, lastWinner);
            fight(h1,lastWinner);
    }

    void createHeroes(){
        Hero h1 = heroFactory.createHero();
        Hero h2 = heroFactory.createHero();
        printHeroInfo(h1, h2);
        fight(h1,h2);
    }

  //  void print at beginning of fight
    void printHeroInfo(Hero h1, Hero h2){
        System.out.println(" ");
        System.out.println("******New fight*****");
        System.out.println("Fighters names are: "+h1.getName()+ " and " + h2.getName());
        System.out.println("--------------------");
    }

    //  void print end message who won and who lost
    void printEndGame(String msg){
        System.out.println(msg);
    }

}
