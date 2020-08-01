package home_work2907;

public interface RoyalHero {

        int power = 0;
        int decreaseAmt = 0;
        int minPower = 0;

        default int getPower(int maxPower, int minPower){
            return Math.abs((int)(Math.random()*(maxPower-minPower)+1)+minPower);
        }

        default int getHp(int maxPower, int minPower){
            return Math.abs((int)(Math.random()*(maxPower-minPower)+1)+minPower);
        }

        default int getDecreaseAmt(int maxPower, int minPower){
            return Math.abs((int)(Math.random()*(maxPower-minPower)+1)+minPower);
        }

}
