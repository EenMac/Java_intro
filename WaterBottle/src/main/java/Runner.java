public class Runner {

    public static void main(String[] args){
        WaterBottle waterBottle = new WaterBottle(100);
        System.out.println(waterBottle.drink());
        System.out.println(waterBottle.empty(100));
        System.out.println(waterBottle.fill(20));
    }
}
