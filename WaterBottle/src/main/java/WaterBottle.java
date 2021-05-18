public class WaterBottle {
    private int volume = 100;

    public WaterBottle(int volume){
        this.volume = volume;
    }
    public int drink(){
        return this.volume-10;
    }
    public int empty(int volume){
        return this.volume = 0;
    }
    public int fill(int volume){
        return this.volume = 100;
    }
}
