import org.w3c.dom.css.Counter;

public class WaterBottles {

    public static void main(String[] args) {
        numWaterBottles(9,3);
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int counter = 0;
        int FullBottle = numBottles;
        int EmptyBottle = 0;

        while(FullBottle != 0){
            EmptyBottle += FullBottle;
            counter += FullBottle;
            FullBottle = 0;
            FullBottle += (EmptyBottle/numExchange);
            EmptyBottle  = (EmptyBottle%numExchange);

        }

        System.out.printf("Number of bottles drank: %d", counter);
        return counter;
    }
}
