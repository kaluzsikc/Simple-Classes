public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public int getDrink() {
        return this.volume - 10;
    }

    public int getEmpty() {
        return this.volume - this.volume;
    }

    public int getFill() {
        while (this.volume < 100) {
           this.volume ++;
        }
        return this.volume;
    }
}
